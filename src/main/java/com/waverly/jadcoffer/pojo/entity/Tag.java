package com.waverly.jadcoffer.pojo.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Waverly
 * @version 1.0
 * @className Tag
 * @date 2023/8/9 21:11
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tag implements Serializable {

    // 标签ID
    private Long tagId;

    // 标签名称
    private String tagName;

    // 使用该标签的文件数
    private Long tagNums;

}
