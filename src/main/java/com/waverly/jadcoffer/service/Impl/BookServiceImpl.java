package com.waverly.jadcoffer.service.Impl;

import com.waverly.jadcoffer.mapper.BookMapper;
import com.waverly.jadcoffer.pojo.entity.Book;
import com.waverly.jadcoffer.pojo.vo.BookVO;
import com.waverly.jadcoffer.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Waverly
 * @version 1.0
 * @className BookServiceImpl
 * @date 2023/8/14 16:09
 * @description TODO
 */
@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookVO> getAllBooks() {
        List<Book> allBooks = bookMapper.getAllBooks();
        List<BookVO> allBooksVO=new ArrayList<>();
        for (Book book : allBooks) {
            BookVO bookVO = new BookVO();
            BeanUtils.copyProperties(book,bookVO);
            allBooksVO.add(bookVO);
        }
        return allBooksVO;
    }
}
