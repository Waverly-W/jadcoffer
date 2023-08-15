package com.waverly.jadcoffer.service;

import com.waverly.jadcoffer.pojo.vo.BookVO;

import java.util.List;

/**
 * @author Waverly
 * @version 1.0
 * @className BookService
 * @date 2023/8/14 16:09
 * @description TODO
 */
public interface BookService {
    List<BookVO> getAllBooks();
}
