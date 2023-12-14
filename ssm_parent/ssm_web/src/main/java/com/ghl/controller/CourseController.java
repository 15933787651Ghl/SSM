package com.ghl.controller;

import com.ghl.pojo.Course;
import com.ghl.service.CourseService;
import com.ghl.service.TeacherService;
import com.ghl.util.Result;
import com.ghl.vo.CourseAndTeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/findAllCourse")
    public Result findAllCourse(@RequestBody Course course) {


        List<Course> list = courseService.findByCourse(course);
        if (list != null && list.size() != 0) {

            Result<List<Course>> result = new Result<>(true, "成功", list, 200);

            return result;
        } else {
            Result result = new Result(false, "未找到数据", list, 500);
            return result;
        }


    }


    @PostMapping("/courseUpload")
    public Result courseUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request)  {

        if (file.isEmpty()){
            throw new RuntimeException();
        }
        //获取项目部署路径
        // D:\apache-tomcat-8.5.56\webapps\ssm_web\
        String realPath = request.getServletContext().getRealPath("/");

        System.out.println(realPath);
        // D:\apache-tomcat-8.5.56\webapps\
        String webappsPath = realPath.substring(0, realPath.indexOf("ssm_web"));

        //获取原文件名
        String fileName = file.getOriginalFilename();

        //新文件名
        String newFileName=System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));

        //上传文件
        String uploadPath=webappsPath+"upload\\";
        File filePath=new File(uploadPath,newFileName);

        //判断目录是否存在
        if (!filePath.getParentFile().exists()){
            filePath.getParentFile().mkdir();
            System.out.println("创建目录"+filePath);
        }
        try {
            file.transferTo(filePath);
            //返回文件名和文件路径
            Map<String,String> map=new HashMap<>();


            map.put("fileName",newFileName);
            map.put("filePath","localhost"+"/upload/"+newFileName);

            Result result=new Result(true,"上传成功",map,200);

            return result;

        } catch (IOException e) {
            throw new RuntimeException(e);

        }





    }

    @PostMapping("/saveOrUpdateCourse")
    public Result saveOrUpdateCourse(@RequestBody CourseAndTeacherVo vo) {

        Date date=new Date();
        Course course = courseService.findById(vo.getId());
        if (course != null) {
            vo.setUpdateTime(date);
            int A = courseService.update(vo);
            int B = teacherService.update(vo);

            return new Result(true, "修改成功", "已存在该数据", 200);
        } else {
            vo.setCreateTime(date);
            vo.setUpdateTime(date);
            int A = courseService.insert(vo);
            int B = teacherService.insert(vo);


            return new Result(true, "添加数据", "未存在数据 添加成功", 200);

        }


    }




    @GetMapping("/findCourseById")
    public Result findCourseById(@RequestParam("id") Integer id) {

        Course course = courseService.findById(id);


        if (course!=null) {


            Result<List<Course>> result = new Result(true, "查询成功", course, 200);

            return result;
        }

        Result<List<Course>> result = new Result(false, "查询失败", course, 500);
        return result;
    }
    @GetMapping("updateCourseStatus")
    public Result updateCourseStatus(Course course){

        courseService.updateStatus(course);

        return new Result(true,"修改状态成功",course.getStatus(),200);

    }






}
