package com.ghl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseLesson {
    private Integer id;
    private Integer courseId;
    private Integer sectionId;
    private String theme;
    private Integer duration;
    private  Integer isFree;
    private Date createTime;
    private Date updateTime;
    private Integer isDel;
    private Integer orderNum;
    private  Integer status;
}
