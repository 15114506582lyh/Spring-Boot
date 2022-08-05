package com.example.redis.Domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Students implements Serializable {

    @TableId(value ="sid")
    private Long sid;
    @TableId(value ="sname")
    private String sname;
    @TableId(value ="sex")
    private String sex;
}
