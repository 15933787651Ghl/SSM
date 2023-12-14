package com.ghl.service.imp;

import com.ghl.mapper.CourseMapper;
import com.ghl.pojo.Course;
import com.ghl.service.CourseService;
import com.ghl.vo.CourseAndTeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findByCourse(Course course) {
        return courseMapper.findByCourse(course);
    }

    @Override
    public Course findById(Integer id) {
        Course course = courseMapper.findById(id);
        return course;
    }

    @Override
    public int update(CourseAndTeacherVo vo) {
        return courseMapper.update(vo);
    }

    @Override
    public int insert(CourseAndTeacherVo vo) {


        return  courseMapper.insert(vo);
    }

    @Override
    public void updateStatus(Course course) {
        courseMapper.updateStatus(course);
    }
}
