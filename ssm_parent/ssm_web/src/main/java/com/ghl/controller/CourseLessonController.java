package com.ghl.controller;


import com.ghl.pojo.Course;
import com.ghl.pojo.CourseLesson;
import com.ghl.pojo.CourseSection;
import com.ghl.service.CourseLessonService;
import com.ghl.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/courseContent")
public class CourseLessonController {

    @Autowired
    private CourseLessonService courseLessonService;

    @GetMapping("/findSectionAndLesson")
    public Result findSectionAndLesson(@RequestParam Integer courseId) {

        List<CourseSection> sections = courseLessonService.findAll(courseId);

        if (sections == null) {
            return new Result(false, "查找失败", sections, 500);
        }
        return new Result(true, "查找成功", sections, 200);
    }

    @GetMapping("/findCourseByCourseId")
    public Result findCourseByCourseId(Integer courseId) {


        Course course = courseLessonService.findCourse(courseId);


        return new Result(true, "响应成功", course, 200);

    }

    @PostMapping("/saveOrUpdateSection")
    public Result saveOrUpdateSection(@RequestBody CourseSection courseSection) {

        Date date = new Date();
        courseSection.setUpdateTime(date);
        courseSection.setCreateTime(date);
        if (courseSection.getId() != null) {


            //修改
            courseLessonService.updateById(courseSection);

            return new Result(true, "修改成功", "已有数据", 200);
        }


        courseLessonService.insert(courseSection);

        //添加


        return new Result(true, "添加成功", "新数据", 200);
    }

    @GetMapping("/updateSectionStatus")
    public Result  updateSectionStatus(Integer id,Integer status){
        CourseSection courseSection=new CourseSection();

        courseSection.setId(id);
        courseSection.setStatus(status);
        courseLessonService.updateStatus(courseSection);

        return new Result(true,"修改成功","修改状态",200);
    }

    @PostMapping("/saveLesson")
    public Result saveLesson(@RequestBody CourseLesson courseLesson){
        Date date = new Date();
        courseLesson.setUpdateTime(date);
        courseLesson.setCreateTime(date);
        if (courseLesson.getId()!=null){


            courseLessonService.updateLesson(courseLesson);

            return new Result(true,"成功修改","已有该数据",200);

        }

            courseLessonService.insertLesson(courseLesson);


        return new Result(true,"成功添加","添加数据",200);


    }

}
