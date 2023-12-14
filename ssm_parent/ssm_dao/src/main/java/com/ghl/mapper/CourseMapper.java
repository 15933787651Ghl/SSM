package com.ghl.mapper;

import com.ghl.pojo.Course;
import com.ghl.vo.CourseAndTeacherVo;

import java.util.List;

public interface CourseMapper {
   public List<Course> findByCourse(Course course);

  public Course findById(Integer id);

   public int update( CourseAndTeacherVo vo);

public     int insert(CourseAndTeacherVo vo);

    void updateStatus(Course course);
}
