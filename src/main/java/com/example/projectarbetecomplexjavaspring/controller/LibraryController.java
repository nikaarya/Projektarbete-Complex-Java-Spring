package com.example.projectarbetecomplexjavaspring.controller;

import com.example.projectarbetecomplexjavaspring.entity.BookEntity;
import com.example.projectarbetecomplexjavaspring.entity.LibraryEntity;
import com.example.projectarbetecomplexjavaspring.entity.StudentEntity;
import com.example.projectarbetecomplexjavaspring.service.LibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("libraries")
public class LibraryController {
    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping()
    public ResponseEntity<LibraryEntity> createSLibrary(@RequestBody LibraryEntity libraryEntity) {
        LibraryEntity createdLibrary = libraryService.createLibrary(libraryEntity);
        return new ResponseEntity<>(createdLibrary, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Iterable<LibraryEntity>> findAllLibraries() {
        Iterable<LibraryEntity> allLibraries = libraryService.findAllLibraries();
        return new ResponseEntity<>(allLibraries, HttpStatus.OK);
    }
}
