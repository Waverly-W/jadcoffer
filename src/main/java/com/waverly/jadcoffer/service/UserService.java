package com.waverly.jadcoffer.service;

import com.waverly.jadcoffer.pojo.dto.UserLoginDTO;
import com.waverly.jadcoffer.pojo.dto.UserRegisterDTO;
import com.waverly.jadcoffer.pojo.entity.User;

/**
 * @author Waverly
 * @version 1.0
 * @className UserService
 * @date 2023/8/11 17:08
 * @description TODO
 */
public interface UserService {
    void userRegister(UserRegisterDTO userRegisterDTO);

    User userLogin(UserLoginDTO userLoginDTO);
}
