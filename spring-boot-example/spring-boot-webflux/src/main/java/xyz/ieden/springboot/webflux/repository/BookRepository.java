package xyz.ieden.springboot.webflux.repository;

import xyz.ieden.spring.boot.example.common.entity.Book;

import java.util.List;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/6/10 19:15
 */
public interface BookRepository {

    Long save(Book book);

    Long remove(Long id);

    Long update(Long id);

    Book findById(Long id);

    List<Book> findAll();

}
