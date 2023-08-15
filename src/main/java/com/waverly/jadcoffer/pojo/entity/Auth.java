package com.waverly.jadcoffer.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Waverly
 * @version 1.0
 * @className Auth
 * @date 2023/8/9 21:12
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auth implements Serializable {

    // ID
    private Long id;

    // 用户ID
    private Long userId;

    // 身份类型
    private String identityType;

    // 标识符
    private String identifier;

    // 凭证
    private String credential;

    // 状态
    private Integer status;

    // 过期时间
    private LocalDateTime expireTime;
}
