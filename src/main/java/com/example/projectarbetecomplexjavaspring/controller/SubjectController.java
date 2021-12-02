package com.example.projectarbetecomplexjavaspring.controller;

import com.example.projectarbetecomplexjavaspring.entity.SubjectEntity;
import com.example.projectarbetecomplexjavaspring.entity.TeacherEntity;
import com.example.projectarbetecomplexjavaspring.service.SubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("subjects")
public class SubjectController {
    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @PostMapping()
    public ResponseEntity<SubjectEntity> createSubject(@RequestBody SubjectEntity subjectEntity) {
        SubjectEntity createdSubject = subjectService.createSubject(subjectEntity);
        return new ResponseEntity<>(createdSubject, HttpStatus.CREATED);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteSubject(@PathVariable Long id) {
        subjectService.deleteSubject(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping()
    public ResponseEntity<Iterable<SubjectEntity>> findAllSubjects() {
        Iterable<SubjectEntity> allSubjects = subjectService.findAllSubjects();
        return new ResponseEntity<>(allSubjects, HttpStatus.OK);
    }

}
