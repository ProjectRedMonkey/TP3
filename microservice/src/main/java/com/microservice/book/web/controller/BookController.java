package com.microservice.book.web.controller;

import com.microservice.book.dao.IbookDAO;
import com.microservice.book.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Richer Alexis
 * @version 1.0.0
 */

//permet de désigner une classe comme contrôleur capable de traiter les requêtes http GET, POST
@RestController
public class BookController {
    //permet à Spring d’en fabriquer une instance
    @Autowired
    private IbookDAO dao;

    @GetMapping(value = "/Books")
    public List<Book> getBooks(){
        return dao.findAll();
    }

    @GetMapping(value = "/Books/{id}")
    public Book getBook(@PathVariable int id){
        return dao.findById(id);
    }

    //pour une fonction d’ajout d’une donnée dans la base
    @PostMapping(value="Books")
    public void addBook(@RequestBody Book... book){
        dao.save(book);
    }

    @PutMapping(value="Books")
    public void modifyBook(@RequestBody Book book){
        dao.modify(book);
    }
}
