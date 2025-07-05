package com.example.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksController {
    List<Book> books = new ArrayList<>();

    public BooksController() {
        books.add(new Book("think-straight", "Darious forex", 200));
        books.add(new Book("Spring Boot", "Bob", 599));
    }

    @GetMapping("/listofbooks")
    public List<Book> getBooks() {
        return books;
    }

    @PostMapping("/add-book")
    public String addBook(@RequestBody Book book) {
        books.add(book);
        return "Book-added!";
    }

    @DeleteMapping("/delete-book/{title}")
    public String deleteBook(@PathVariable("title") String title) {
        boolean deleted = books.removeIf(book -> book.getTitle().equals(title));
        return deleted ? "Book-deleted!" : "Book not found!";
    }
}
