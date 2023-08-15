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
 * @className Manual
 * @date 2023/8/9 21:08
 * @description TODO
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Manual extends File implements Serializable {

    // 手册ID
    private Long manualId;

    // 文件ID
    private Long fileId;

    // 版本
    private String version;

    // 描述
    private String description;

    // 作者
    private String author;

    // 发布日期
    private LocalDateTime releaseDate;

    // 出版者
    private String publisher;
}
