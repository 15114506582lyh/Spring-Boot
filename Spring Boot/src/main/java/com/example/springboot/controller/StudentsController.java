package com.example.springboot.controller;

import com.example.springboot.domain.Students;
import com.example.springboot.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    private StudentsService studentsService;
    @GetMapping("test")
    public List<Students> select(Students students){
        return studentsService.select(students);
    }
}
