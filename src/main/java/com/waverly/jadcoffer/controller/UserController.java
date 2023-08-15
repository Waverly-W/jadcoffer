package com.waverly.jadcoffer.controller;

import com.waverly.jadcoffer.constant.JwtClaimsConstant;
import com.waverly.jadcoffer.pojo.dto.UserLoginDTO;
import com.waverly.jadcoffer.pojo.dto.UserRegisterDTO;
import com.waverly.jadcoffer.pojo.entity.User;
import com.waverly.jadcoffer.pojo.vo.UserLoginVO;
import com.waverly.jadcoffer.properties.JwtProperties;
import com.waverly.jadcoffer.result.Result;
import com.waverly.jadcoffer.service.UserService;
import com.waverly.jadcoffer.utils.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Waverly
 * @version 1.0
 * @className UserController
 * @date 2023/8/11 15:31
 * @description TODO
 */

@RestController
@RequestMapping("/user")
@Api(tags = "用户操作接口")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtProperties jwtProperties;

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    @PostMapping("/login")
    @ApiOperation("用户登录")
    public Result<UserLoginVO> userLogin(UserLoginDTO userLoginDTO){
        log.info("用户登录请求参数:{}",userLoginDTO);
        User user = userService.userLogin(userLoginDTO);

        Map<String, Object> claims = new HashMap<>();
        claims.put(JwtClaimsConstant.USER_ID, user.getUserId());
        String authentication = JwtUtil.createJWT(
                jwtProperties.getUserSecretKey(),
                jwtProperties.getUserTtl(),
                claims);

        UserLoginVO userLoginVO = new UserLoginVO();
        BeanUtils.copyProperties(user,userLoginVO);
        userLoginVO.setAuthentication(authentication);
        log.info("用户登录成功:{}",user.getUsername());

        return Result.success(userLoginVO);
    }

    /**
     * 用户注册
     * @param userRegisterDTO
     * @return
     */
    @PostMapping("/register")
    @ApiOperation("用户注册")
    public Result<String> userRegister(UserRegisterDTO userRegisterDTO) {
        userService.userRegister(userRegisterDTO);
        return Result.success("注册成功");
    }


}
