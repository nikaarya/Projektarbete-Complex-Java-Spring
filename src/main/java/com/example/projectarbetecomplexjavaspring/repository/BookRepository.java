package com.example.projectarbetecomplexjavaspring.repository;

import com.example.projectarbetecomplexjavaspring.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
