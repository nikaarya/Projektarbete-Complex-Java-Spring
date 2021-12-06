package com.example.projectarbetecomplexjavaspring.service;

import com.example.projectarbetecomplexjavaspring.entity.BookEntity;
import com.example.projectarbetecomplexjavaspring.entity.LibraryEntity;
import com.example.projectarbetecomplexjavaspring.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookEntity createBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    public void deleteBook(Long id) {
        BookEntity foundBook = bookRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        bookRepository.deleteById(foundBook.getId());
    }

    public Optional<BookEntity> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Iterable<BookEntity> findAllBooks() {
        return bookRepository.findAll();
    }

}
