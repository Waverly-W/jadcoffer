package com.waverly.jadcoffer.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Waverly
 * @version 1.0
 * @className BookVO
 * @date 2023/8/14 16:27
 * @description TODO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookVO extends FileVO implements Serializable {

    // 作者
    private String author;

    // 出版社
    private String publisher;

    // 出版日期
    private LocalDateTime publishDate;

    // ISBN
    private String isbn;

    // 概要
    private String summary;
}
