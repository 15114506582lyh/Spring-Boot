package com.example.springboot.controller;

import com.example.springboot.domain.Student;
import com.example.springboot.service.StudentServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServce studentServce;
    @GetMapping("/")
    public List<Student> select(Student student){
        return studentServce.select(student);
    }
}
