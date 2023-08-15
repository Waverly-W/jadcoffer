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
 * @className File
 * @date 2023/8/9 21:01
 * @description TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class File implements Serializable {

    // 文件id
    protected Long fileId;

    // 用户id
    protected Long userId;

    // 展示名称
    protected String name;

    // 文件名
    protected String fileName;

    // 文件大小
    protected Long fileSize;

    // 文件路径
    protected String urlPath;

    // 缓存路径
    protected String cachePath;

    // 封面
    protected String cover;

    // 文件类型
    protected String mimeType;

    // 文档类型
    protected String fileType;

    // 创建时间
    protected LocalDateTime createTime;

    // 修改时间
    protected LocalDateTime updateTime;

    // 标签ID数组
    protected String tagIds;
}
