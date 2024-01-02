package com.example.jeeioa.controller;

import com.example.jeeioa.entities.Student;
import com.example.jeeioa.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        List<Student> student = studentRepository.findAll();
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
