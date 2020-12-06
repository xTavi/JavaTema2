package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void addBook(Book bookToAdd)  {
        bookRepository.addBook(bookToAdd);
    }

    public void deleteBook(int id) {
        bookRepository.deleteBook(id);
    }

    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    public List<Book> getBookByName(String name) {
        return bookRepository.getBooksByName(name);
    }
}
