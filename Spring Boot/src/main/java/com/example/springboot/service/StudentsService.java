package com.example.springboot.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.dao.StudentsMapper;
import com.example.springboot.domain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsService extends ServiceImpl<StudentsMapper, Students> implements StudentsServiceInterface {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> select(Students students) {
        return studentsMapper.selectList(null);
    }
    @Override
    @Cacheable(value="cacheSpace", key="#sid")
    public Students getCacheById(Long sid){
        return studentsMapper.selectById(sid);
    }
}
