package com.example.redis.Domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Students{

    @TableId("sid")
    private Long id;
    @TableField("sname")
    private String name;
    @TableField("sex")
    private String sex;
}
