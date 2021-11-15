package com.microservice.book.model;

/**
 * @author Richer Alexis
 * @version 1.0.0
 */

public class Book {
    private int id;
    private String title;
    private String author;

    public Book(){
        id = 0;
        title = "DefaultTitle";
        author = "DefaultAuthor";
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }
}
