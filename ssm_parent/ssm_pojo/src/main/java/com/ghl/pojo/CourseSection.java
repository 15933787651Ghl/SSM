package com.ghl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseSection {
    private Integer id;
    private Integer courseId;
    private String SectionName;
    private String description;
    private Date createTime;
    private Date updateTime;
    private Integer isDe;
    private Integer orderNum;
    private Integer status;
    private List<CourseLesson> lessonList;
}
