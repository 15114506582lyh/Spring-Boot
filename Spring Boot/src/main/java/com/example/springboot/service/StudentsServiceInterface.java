package com.example.springboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.domain.Students;

import java.util.List;

public interface StudentsServiceInterface extends IService<Students> {
    List<Students> select(Students students);
    Students getCacheById(Long sid);
}
