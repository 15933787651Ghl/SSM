package com.ghl.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseAndTeacherVo {

private  Integer id;
private String courseName;
private String brief;
private String teacherName;
private String description;
private String position;
private String previewFirstField;
private String previewSecondField;
private String  discountsTag;
private String courseImgUrl;
private String courseListImg;
private String  courseDescriptionMarkDown;
private Double discounts;
private Double  price;
private Integer sortNum;
private Integer sales;
private Date createTime;
private Date updateTime;








}
