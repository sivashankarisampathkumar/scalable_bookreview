package com.example.BookReview.controller;

import com.example.BookReview.model.Book;
import com.example.BookReview.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable String id) {
        return bookRepository.findById(id);
    }

@PostMapping
public Book createBook(@RequestBody Book book) {
    System.out.println("Received Book: " + book);  // Log the received object
    Book savedBook = bookRepository.save(book);  // Save to MongoDB
    System.out.println("Saved Book: " + savedBook); // Log the saved book object
    return savedBook;  // Return the saved book
}


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id) {
        bookRepository.deleteById(id);
    }
}
