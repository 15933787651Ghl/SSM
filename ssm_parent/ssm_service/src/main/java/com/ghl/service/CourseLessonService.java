package com.ghl.service;

import com.ghl.pojo.Course;
import com.ghl.pojo.CourseLesson;
import com.ghl.pojo.CourseSection;

import java.util.List;

public interface CourseLessonService {
   public List<CourseSection> findAll(Integer id);

   public Course findCourse(Integer courseId);

  public void updateById(CourseSection courseSection);

   public void insert(CourseSection courseSection);

   public void updateStatus(CourseSection courseSection);

   public void updateLesson(CourseLesson courseLesson);

   public void insertLesson(CourseLesson courseLesson);
}
