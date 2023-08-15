package com.waverly.jadcoffer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.waverly.jadcoffer.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Waverly
 * @version 1.0
 * @className UserMapper
 * @date 2023/8/11 17:14
 * @description TODO
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {



    User getUserByUserId(Long userId);

    User selectUserByUserName(String username);

    @Override
    int insert(User entity);
}
