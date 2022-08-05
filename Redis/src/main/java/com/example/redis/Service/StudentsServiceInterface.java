package com.example.redis.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.redis.Domain.Students;

import java.util.List;

public interface StudentsServiceInterface extends IService<Students> {
    List<Students> select(Students students);
    Students getCacheById(Long sid);
}
