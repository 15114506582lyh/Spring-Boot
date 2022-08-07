package com.example.redis.Controller;

import com.example.redis.Domain.Students;
import com.example.redis.Service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.ReturnedType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController{
    @Autowired
    private StudentsService studentsService;
    //查询所有信息
    @GetMapping()
    public List<Students> select(){
        return studentsService.list();
    }
    //根据id查询
    @GetMapping("{id}")
    public Students getById(@PathVariable Long id){
        return studentsService.GetById(id);
    }
    //添加用户
    @PostMapping("add")
    public boolean add(@RequestBody Students students){
        return studentsService.save(students);
    }
    //删除用户
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable("id") Long id){
        return studentsService.removeById(id);
    }
    //更新用户
    @PutMapping("Update")
    public boolean update(@RequestBody Students students){
        return studentsService.updateById(students);
    }
}
