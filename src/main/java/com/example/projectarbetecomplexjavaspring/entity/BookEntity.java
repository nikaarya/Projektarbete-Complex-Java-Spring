package com.example.projectarbetecomplexjavaspring.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String genre;
    @NotNull
    private String isbn;

    @ManyToOne
    private LibraryEntity library;

    public BookEntity(String name, String genre, String isbn) {
        this.name = name;
        this.genre = genre;
        this.isbn = isbn;
    }

    public BookEntity() {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LibraryEntity getLibrary() {
        return library;
    }

    public void setLibrary(LibraryEntity library) {
        this.library = library;
    }
}
