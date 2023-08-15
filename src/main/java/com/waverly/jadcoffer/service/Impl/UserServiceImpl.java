package com.waverly.jadcoffer.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.waverly.jadcoffer.constant.MessageConstant;
import com.waverly.jadcoffer.constant.StatusConstant;
import com.waverly.jadcoffer.exception.AccountOrPasswordErrorException;
import com.waverly.jadcoffer.exception.RegisterException;
import com.waverly.jadcoffer.mapper.AuthMapper;
import com.waverly.jadcoffer.mapper.UserMapper;
import com.waverly.jadcoffer.pojo.dto.UserLoginDTO;
import com.waverly.jadcoffer.pojo.dto.UserRegisterDTO;
import com.waverly.jadcoffer.pojo.entity.Auth;
import com.waverly.jadcoffer.pojo.entity.User;
import com.waverly.jadcoffer.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.time.LocalDateTime;

/**
 * @author Waverly
 * @version 1.0
 * @className UserServiceImpl
 * @date 2023/8/11 17:11
 * @description TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AuthMapper authMapper;

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    @Override
    public User userLogin(UserLoginDTO userLoginDTO) {

        String identifier=userLoginDTO.getIdentifier();
        String credential=userLoginDTO.getCredential();

        Auth auth = authMapper.selectAuthByIdentifier(identifier);

        if(auth == null){
            throw new AccountOrPasswordErrorException(MessageConstant.ACCOUNT_NOT_FOUND);
        }

        // md5加密
        String password_md5 = DigestUtils.md5DigestAsHex(credential.getBytes());

        if(!auth.getCredential().equals(password_md5)){
            throw new AccountOrPasswordErrorException(MessageConstant.PASSWORD_ERROR);
        }

        if(!auth.getStatus().equals(StatusConstant.ENABLE)){
            throw new AccountOrPasswordErrorException(MessageConstant.ACCOUNT_LOCKED);
        }

        User user=userMapper.getUserByUserId(auth.getUserId());

        assert user != null;

        return user;
    }

    @Override
    @Transactional
    public void userRegister(UserRegisterDTO userRegisterDTO) {



        // 1. 校验用户名是否重复
        User userByUserName = userMapper.selectUserByUserName(userRegisterDTO.getUsername());
        if(userByUserName != null) {
            throw new RegisterException(MessageConstant.USER_ALREADY_EXISTS);
        }

        // 2. 校验邮箱是否重复
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("email", userRegisterDTO.getEmail());
        User userByEmail = userMapper.selectOne(userQueryWrapper);
        if(userByEmail != null) {
            throw new RegisterException(MessageConstant.EMAIL_ALREADY_EXISTS);
        }
        User user = new User();
        BeanUtils.copyProperties(userRegisterDTO,user);

        String password_md5 = DigestUtils.md5DigestAsHex(userRegisterDTO.getCredential().getBytes());
        user.setRegisterTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        userMapper.insert(user);
        Auth auth = new Auth().builder()
                .userId(user.getUserId())
                .identityType(userRegisterDTO.getIdentityType())
                .identifier(userRegisterDTO.getIdentifier())
                .credential(password_md5)
                .status(StatusConstant.ENABLE)
                .build();

        authMapper.insert(auth);
    }
}
