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
 * @className Paper
 * @date 2023/8/9 21:06
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Paper extends File implements Serializable {

    // 论文ID
    private Long paperId;

    // 文件ID
    private Long fileId;

    // DOI
    private String doi;

    // 作者
    private String author;

    // 摘要
    private String abstract_;

    // 机构
    private String organization;

    // 年份
    private Integer year;

    // 月份
    private Integer month;

    // 卷号
    private String volume;

    // 期号
    private String number;

    // 页码
    private String pages;

    // 期刊
    private String journal;

    // 出版社
    private String publisher;

    // URL
    private String url;

}
