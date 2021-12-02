package com.example.projectarbetecomplexjavaspring.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class LibraryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<BookEntity> books = new ArrayList<>();

    public LibraryEntity(String name) {
        this.name = name;
    }

    public LibraryEntity() {
    }

    public void addBook(BookEntity bookEntity) {
        books.add(bookEntity);
        bookEntity.setLibrary(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }
}
