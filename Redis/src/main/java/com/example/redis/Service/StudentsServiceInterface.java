package com.example.redis.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.redis.Domain.Students;

import java.util.List;

public interface StudentsServiceInterface extends IService<Students> {
    //根据id查询
    Students GetById(Long id);
}
