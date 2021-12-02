package com.example.projectarbetecomplexjavaspring.repository;

import com.example.projectarbetecomplexjavaspring.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity, Long> {
}
