package com.example.projectarbetecomplexjavaspring.service;

import com.example.projectarbetecomplexjavaspring.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }


}
