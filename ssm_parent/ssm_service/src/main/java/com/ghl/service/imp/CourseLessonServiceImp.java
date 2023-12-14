package com.ghl.service.imp;


import com.ghl.mapper.CourseLessonMapper;

import com.ghl.pojo.Course;
import com.ghl.pojo.CourseLesson;
import com.ghl.pojo.CourseSection;
import com.ghl.service.CourseLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseLessonServiceImp implements CourseLessonService {
    @Autowired
    private CourseLessonMapper lessonMapper;

    @Override
    public List<CourseSection> findAll(Integer id) {
        return lessonMapper.find(id);
    }

    @Override
    public Course findCourse(Integer courseId) {
        return lessonMapper.findCourse(courseId);
    }

    @Override
    public void updateById(CourseSection courseSection) {
        lessonMapper.updateById(courseSection);
    }

    @Override
    public void insert(CourseSection courseSection) {
        lessonMapper.insert(courseSection);
    }

    @Override
    public void updateStatus(CourseSection courseSection) {
        lessonMapper.updateStatus(courseSection);
    }

    @Override
    public void updateLesson(CourseLesson courseLesson) {
        lessonMapper.updateLesson(courseLesson);
    }

    @Override
    public void insertLesson(CourseLesson courseLesson) {
       lessonMapper.insertLesson(courseLesson);
    }
}
