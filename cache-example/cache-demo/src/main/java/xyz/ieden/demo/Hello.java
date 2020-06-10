package xyz.ieden.demo;

import xyz.ieden.demo.entity.BookEntity;
import xyz.ieden.demo.entity.UserEntity;
import xyz.ieden.demo.service.BookService;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/3/18 21:49
 */
public class Hello {


    /**
     * 1. 类型转换 -->
     *  强制类型转换 --> 大转小
     *  类型转换 --> 小转大
     */

    /**
     * 强制转换:
     * 1. Object -> entity
     * 2. entity1 -> entity2
     *
     * @param args
     */
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Object obj = bookService.getBookById(12);
        //  1. Object -> entity
        BookEntity bookEntity = (BookEntity) obj;

        Object obj2 = bookService.getBookByIdd2(12);

        UserEntity userEntity = (UserEntity) bookEntity;
    }
}
