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
 * @className Book
 * @date 2023/8/9 21:09
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book extends File implements Serializable {

    // 书籍ID
    private Long bookId;

    // 文件ID
    private Long fileId;

    // 作者
    private String author;

    // 出版社
    private String publisher;

    // 出版日期
    private LocalDateTime publishDate;

    // 页数
    private Integer pageNum;

    // ISBN
    private String isbn;

    // 概要
    private String summary;
}
