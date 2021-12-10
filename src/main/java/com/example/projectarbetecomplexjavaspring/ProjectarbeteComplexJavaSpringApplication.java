package com.example.projectarbetecomplexjavaspring;

import com.example.projectarbetecomplexjavaspring.entity.BookEntity;
import com.example.projectarbetecomplexjavaspring.entity.LibraryEntity;
import com.example.projectarbetecomplexjavaspring.repository.BookRepository;
import com.example.projectarbetecomplexjavaspring.repository.LibraryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectarbeteComplexJavaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectarbeteComplexJavaSpringApplication.class, args);

    }

    // Generate data at startup
    @Bean
    public CommandLineRunner setUpData(
            LibraryRepository libraryRepository,
            BookRepository bookRepository) {
        return (args) -> {

            /*
            libraryRepository.save(new LibraryEntity("Lib1"));
            bookRepository.save(new BookEntity("It","horror","111-111"));
            */

            LibraryEntity library1 = new LibraryEntity("lib");
            BookEntity book1 = new BookEntity("It", "horror", "222-111");

            //bookRepository.save(book1);
            //libraryRepository.save(library1);


            library1.addBook(book1);
            libraryRepository.save(library1);

        };
    }

}
