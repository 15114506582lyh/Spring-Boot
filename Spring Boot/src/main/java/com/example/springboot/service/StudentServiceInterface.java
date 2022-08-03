package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.domain.Student;

import java.util.List;

public interface StudentServiceInterface extends IService<Student> {
    List<Student> select(Student student);
}
