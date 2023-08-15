package com.waverly.jadcoffer.controller;

import com.waverly.jadcoffer.pojo.entity.Book;
import com.waverly.jadcoffer.pojo.vo.BookVO;
import com.waverly.jadcoffer.result.Result;
import com.waverly.jadcoffer.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Waverly
 * @version 1.0
 * @className BookController
 * @date 2023/8/14 16:03
 * @description TODO
 */

@RestController
@RequestMapping("/book")
@Api(tags = "书籍操作接口")
@Slf4j
@CrossOrigin
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    @ApiOperation("获取所有书籍")
    private Result<List<BookVO>> getAllBooks(){
        log.info("get all books");

        List<BookVO> books=bookService.getAllBooks();
        return Result.success(books);
    }
}
