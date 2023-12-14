package com.ghl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    private Integer id;
    private Integer courseId;
    private String teacherName;
    private String position;
    private Date createTime;
    private  Date updateTime;
    private Integer isDel;
}
