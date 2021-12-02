package com.example.projectarbetecomplexjavaspring.controller;

import com.example.projectarbetecomplexjavaspring.entity.TeacherEntity;
import com.example.projectarbetecomplexjavaspring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("teachers")
public class TeacherController {
    //@Autowired
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping()
    public ResponseEntity<TeacherEntity> createTeacher(@RequestBody TeacherEntity teacherEntity) {
        TeacherEntity createdTeacher = teacherService.createTeacher(teacherEntity);
        return new ResponseEntity<>(createdTeacher, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<TeacherEntity>> findTeacherById(@PathVariable Long id) {
        Optional<TeacherEntity> foundTeacher = teacherService.findTeacherById(id);
        return new ResponseEntity<>(foundTeacher, HttpStatus.OK);
    }
}
