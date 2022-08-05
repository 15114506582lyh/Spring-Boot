package com.example.redis.Service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.redis.DAO.StudentsMapper;
import com.example.redis.Domain.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "Students")
public class StudentsService extends ServiceImpl<StudentsMapper, Students> implements StudentsServiceInterface {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> select(Students students) {
        return studentsMapper.selectList(null);
    }
    @Override
    @Cacheable(key="#sid")
    public Students getCacheById(Long sid){
        return getById(sid);
    }
}
