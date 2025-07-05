package com.example.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController {
    @GetMapping("/book")
    public Book getBook() {
        return new Book("java 101", "Alice", 499);
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("think-straight", "Darious forex", 200));
        books.add(new Book("Spring Boot", "Bob", 599));
        return books;
    }
}
