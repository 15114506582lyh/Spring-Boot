package com.example.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.domain.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends BaseMapper<Student> {

}
