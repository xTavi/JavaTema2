package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository {

    private List<Book> allBooks = new ArrayList<Book>();

    public Book addBook(Book book) {
        allBooks.add(book);
        return book;
    }

    public void deleteBook(int id) {
        allBooks.removeIf(book -> book.getId() == id);
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public List<Book> getBooksByName(String name) {
        return allBooks.stream().filter(book -> book.getName().contains(name)).collect(Collectors.toList());
    }

    public BookRepository() {
        Book book1 = new Book(1, "Harry Potter and the Philosopher's Stone", "J. K Rowling", true);
        Book book2 = new Book(2, "The Da Vinci Code", "Dan Brown", true);
        allBooks.add(book1);
        allBooks.add(book2);
    }
}
