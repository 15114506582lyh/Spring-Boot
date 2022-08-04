package com.example.springboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.domain.Students;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsMapper extends BaseMapper<Students> {}
