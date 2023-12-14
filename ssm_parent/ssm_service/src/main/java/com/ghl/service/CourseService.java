package com.ghl.service;

import com.ghl.pojo.Course;
import com.ghl.pojo.Teacher;
import com.ghl.vo.CourseAndTeacherVo;

import java.util.List;

public interface CourseService {
   public List<Course> findByCourse(Course course);

   public Course findById(Integer id);

  public int update(CourseAndTeacherVo vo);

 public    int insert(CourseAndTeacherVo vo);

   public void updateStatus(Course course);
}
