package xyz.ieden.spring.boot.example.swagger.book.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import xyz.ieden.spring.boot.example.common.entity.Result;
import xyz.ieden.spring.boot.example.common.util.ResultUtils;
import xyz.ieden.spring.boot.example.swagger.book.entity.Book;

import java.util.Collections;
import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/16 11:29
 */
@Api(value = "Book API")
@Slf4j
@RestController
@RequestMapping(value = "book")
public class BookController {

    @DeleteMapping(value = "{id}")
    public Result<Boolean> delBook(@PathVariable(value = "id") Integer bookId) {
        log.info("Del Book By Id [{}].", bookId);
        Boolean delResult = Boolean.TRUE;
        return ResultUtils.getSuccess(delResult);
    }

    @PutMapping(value = "{id}")
    public Result<Book> updBook(@PathVariable(value = "id") Integer userId, Book book) {
        log.info("Update Book By Id [{}].", userId);
        Book updateBook = book;
        return ResultUtils.getSuccess(updateBook);
    }

    @PostMapping()
    public Result<Book> addBook(Book book) {
        log.info("Add Book.");
        Book addBook = book;
        return ResultUtils.getSuccess(addBook);
    }

    @ApiOperation(value = "获取 Book", notes = "通过 Id 获取 Book")
    @GetMapping(value = "{id}")
    public Result<Book> getBookById(@PathVariable(value = "id") Integer bookId) {
        log.info("Get Book By Id [{}].", bookId);
        Book book = new Book(bookId, "book_" + bookId);
        return ResultUtils.getSuccess(book);
    }

    @GetMapping(value = "")
    public Result<List<Book>> getBookList() {
        log.info("Get Book List.");
        List<Book> bookList = Collections.EMPTY_LIST;
        return ResultUtils.getSuccess(bookList);
    }

}
