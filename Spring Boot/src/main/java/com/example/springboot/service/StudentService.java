package com.example.springboot.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.StudentMapper;
import com.example.springboot.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService extends ServiceImpl<StudentMapper,Student> implements StudentServiceInterface {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> select(Student student) {
        return studentMapper.selectList(null);
    }
}
