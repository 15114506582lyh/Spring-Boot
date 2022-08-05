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

    //根据id查询
    @Override
    @Cacheable(key="#id")
    public Students GetById(Long id){
        return getById(id);
    }
}
