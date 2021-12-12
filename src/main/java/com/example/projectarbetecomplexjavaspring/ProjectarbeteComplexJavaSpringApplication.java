package com.example.projectarbetecomplexjavaspring;

import com.example.projectarbetecomplexjavaspring.entity.*;
import com.example.projectarbetecomplexjavaspring.repository.*;
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
            BookRepository bookRepository,
            TeacherRepository teacherRepository,
            SubjectRepository subjectRepository,
            StudentRepository studentRepository) {
        return (args) -> {

            //LIBRARY & BOOK TEST DATA
            LibraryEntity library1 = new LibraryEntity("lib");
            BookEntity book1 = new BookEntity("It", "horror", "222-111");
            library1.addBook(book1);
            libraryRepository.save(library1);

            //TEACHER & SUBJECT TEST DATA
            TeacherEntity teacher1 = new TeacherEntity("Pontus");
            SubjectEntity subject1 = new SubjectEntity("Math");
            teacher1.addSubject(subject1);
            teacherRepository.save(teacher1);

            //STUDENT TEST DATA
            StudentEntity student1 = new StudentEntity("Leo", "leo@mail.com");
            student1.addSubject(subject1);
            studentRepository.save(student1);

        };
    }

}
