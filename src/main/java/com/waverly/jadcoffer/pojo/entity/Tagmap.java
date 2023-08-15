package com.waverly.jadcoffer.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Waverly
 * @version 1.0
 * @className Tagmap
 * @date 2023/8/9 21:11
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tagmap implements Serializable {

    // 用户ID
    private Long userId;

    // 用户名
    private String username;

    // 昵称
    private String nickname;

    // 头像
    private String avatar;

    // 邮箱
    private String email;

    // 注册时间
    private LocalDateTime registerTime;

//    @Schema(description = "用户ID", example = "1")
//    private Long userId;
//
//    @Schema(description = "用户名", example = "John Doe")
//    private String username;
//
//    @Schema(description = "昵称", example = "Jane Doe")
//    private String nickname;
//
//    @Schema(description = "头像", example = "https://example.com/avatar.jpg")
//    private String avatar;
//
//    @Schema(description = "邮箱", example = "john.doe@example.com")
//    private String email;
//
//    @Schema(description = "注册时间", example = "2021-01-01T00:00:00")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private LocalDateTime registerTime;

}
