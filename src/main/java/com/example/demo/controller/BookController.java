package com.example.demo.controller;


import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> findAllBooks() {
        return  bookService.getAllBooks();
    }

    @GetMapping("search/{name}")
    public ResponseEntity<List<Book>> findBookByName(@PathVariable("name") String name) {
        return new ResponseEntity<>(bookService.getBookByName(name), HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);
        return HttpStatus.OK;
    }

    @PostMapping("/new")
    public ResponseEntity<Void> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

