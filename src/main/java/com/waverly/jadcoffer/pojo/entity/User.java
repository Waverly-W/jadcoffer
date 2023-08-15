package com.waverly.jadcoffer.pojo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Waverly
 * @version 1.0
 * @className User
 * @date 2023/8/11 17:21
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "用户信息")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户ID")
    private Long UserId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime registerTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;
}
