package com.example.springboot.controller;

import com.example.springboot.domain.Students;
import com.example.springboot.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Stusents")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;
    @GetMapping("test")
    public List<Students> select(Students students){
        return studentsService.select(students);
    }
    @GetMapping("{sid}")
    public Students getById(@PathVariable Long sid){
        return studentsService.getCacheById(sid);
    }
}
