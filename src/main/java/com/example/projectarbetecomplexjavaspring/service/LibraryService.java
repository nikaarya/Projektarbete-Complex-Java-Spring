package com.example.projectarbetecomplexjavaspring.service;

import com.example.projectarbetecomplexjavaspring.entity.BookEntity;
import com.example.projectarbetecomplexjavaspring.entity.LibraryEntity;
import com.example.projectarbetecomplexjavaspring.entity.StudentEntity;
import com.example.projectarbetecomplexjavaspring.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryEntity createLibrary(LibraryEntity libraryEntity) {
        //libraryEntity.addBook(new BookEntity("Harry Potter", "Fantasy", "7863536"));
        return libraryRepository.save(libraryEntity);
    }

    public Iterable<LibraryEntity> findAllLibraries() {
        return libraryRepository.findAll();
    }





}
