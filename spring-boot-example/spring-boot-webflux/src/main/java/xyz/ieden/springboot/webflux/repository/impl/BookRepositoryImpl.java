package xyz.ieden.springboot.webflux.repository.impl;

import org.springframework.stereotype.Repository;
import xyz.ieden.spring.boot.example.common.entity.Book;
import xyz.ieden.springboot.webflux.repository.BookRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2020/6/10 19:21
 */
@Repository
public class BookRepositoryImpl implements BookRepository {

    private ConcurrentMap<Long, Book> bookMap = new ConcurrentHashMap<>(10);
    private AtomicLong createId = new AtomicLong(0);

    @Override
    public Long save(Book book) {
        long id = this.createId.incrementAndGet();
        book.setId(id);
        bookMap.put(id, book);
        return id;
    }

    @Override
    public Book remove(Long id) {
        Book removeBook = bookMap.remove(id);
        return removeBook;
    }

    @Override
    public Long update(Book book) {
        Long id = book.getId();
        bookMap.put(id, book);
        return id;
    }

    @Override
    public Book findById(Long id) {
        return bookMap.get(id);
    }

    @Override
    public List<Book> findAll() {
        Collection<Book> bookCollection = bookMap.values();
        return new ArrayList<Book>(bookCollection);
    }
    https://me.csdn.net/why191314
}
