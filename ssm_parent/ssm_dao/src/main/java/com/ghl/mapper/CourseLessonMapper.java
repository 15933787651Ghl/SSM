package com.ghl.mapper;

import com.ghl.pojo.Course;
import com.ghl.pojo.CourseLesson;
import com.ghl.pojo.CourseSection;

import java.util.List;


public interface CourseLessonMapper {
   public List<CourseSection> find(Integer id);

 public   Course findCourse(Integer courseId);

   public void updateById(CourseSection courseSection);

   public void insert(CourseSection courseSection);

   public void updateStatus(CourseSection courseSection);

   public void updateLesson(CourseLesson courseLesson);

   public void insertLesson(CourseLesson courseLesson);
}
