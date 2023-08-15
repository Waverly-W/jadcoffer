package com.waverly.jadcoffer.mapper;

import com.waverly.jadcoffer.pojo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Waverly
 * @version 1.0
 * @className BookMapper
 * @date 2023/8/14 16:11
 * @description TODO
 */

@Mapper
public interface BookMapper {
    List<Book> getAllBooks();
}
