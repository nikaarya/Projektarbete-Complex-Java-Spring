package com.example.projectarbetecomplexjavaspring.controller;

import com.example.projectarbetecomplexjavaspring.entity.BookEntity;
import com.example.projectarbetecomplexjavaspring.entity.StudentEntity;
import com.example.projectarbetecomplexjavaspring.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping()
    public ResponseEntity<BookEntity> createBook(@RequestBody BookEntity bookEntity) {
        BookEntity createdBook = bookService.createBook(bookEntity);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<BookEntity>> findBookById(@PathVariable Long id) {
        Optional<BookEntity> foundBook = bookService.findBookById(id);
        return new ResponseEntity<>(foundBook, HttpStatus.OK);
    }
}
