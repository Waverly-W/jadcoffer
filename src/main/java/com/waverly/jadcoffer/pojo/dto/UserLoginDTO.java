package com.waverly.jadcoffer.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Waverly
 * @version 1.0
 * @className UserLoginDTO
 * @date 2023/8/11 15:34
 * @description TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户登录DTO")
public class UserLoginDTO {
    // 身份类型
    @ApiModelProperty("身份类型")
    private String identityType;

    // 标识符
    @ApiModelProperty("标识符")
    private String identifier;

    // 凭证
    @ApiModelProperty("凭证")
    private String credential;
}
