package com.waverly.jadcoffer.pojo.dto;

import com.waverly.jadcoffer.pojo.entity.Auth;
import com.waverly.jadcoffer.pojo.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Waverly
 * @version 1.0
 * @className UserRegisterDTO
 * @date 2023/8/11 19:50
 * @description 用户注册DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "UserRegisterDTO", description = "用户注册DTO")
public class UserRegisterDTO extends User {


    @ApiModelProperty(value = "身份类型", example = "用户")
    private String identityType;

    @ApiModelProperty(value = "标识符", example = "123")
    private String identifier;

    @ApiModelProperty(value = "凭证", example = "abc")
    private String credential;

}
