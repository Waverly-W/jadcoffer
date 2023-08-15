package com.waverly.jadcoffer.pojo.vo;

import com.waverly.jadcoffer.pojo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Waverly
 * @version 1.0
 * @className UserLoginVO
 * @date 2023/8/11 17:51
 * @description TODO
 */

@Data
@ApiModel(value = "UserLoginVO", description = "用户登录VO")
public class UserLoginVO extends User {

    @ApiModelProperty(value = "用户登录令牌", name = "authentication")
    private String authentication;
}
