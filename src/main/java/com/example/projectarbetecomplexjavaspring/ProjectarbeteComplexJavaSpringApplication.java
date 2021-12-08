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

            //libraryRepository.save(new LibraryEntity("Lib1"));
            bookRepository.save(new BookEntity("It","horror","111-111"));

        };
    }

}
