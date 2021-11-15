package com.microservice.book.dao;

import com.microservice.book.model.Book;

import java.util.List;

/**
 * @author Richer Alexis
 * @version 1.0.0
 */

public interface IbookDAO{
    List<Book> findAll();
    Book findById(int id);
    void save(Book[] book);
    void modify(Book book);
}
