package com.microservice.book.dao;

import com.microservice.book.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Richer Alexis
 * @version 1.0.0
 */

@Repository
public class BookDAO implements IbookDAO {
    List<Book> listBooks;

    public BookDAO(){
        listBooks = new ArrayList<Book>();
        listBooks.add(new Book());
    }

    @Override
    public List<Book> findAll() {
        return listBooks;
    }

    @Override
    public Book findById(int id) {
        Book res = null;
        for(Book book : listBooks){
            if(book.getId() == id){
                res = book;
            }
        }
        return res;
    }

    @Override
    public void save(Book... book) {
        for (Book b : book){
            b.setId(listBooks.size());
            listBooks.add(b);
        };
    }

    @Override
    public void modify(Book book) {
        listBooks.set(book.getId(), book);
    }
}
