package com.ghl.mapper;

import com.ghl.pojo.Teacher;
import com.ghl.vo.CourseAndTeacherVo;

public interface TeacherMapper {


   public int update(CourseAndTeacherVo vo);

 public   int insert(CourseAndTeacherVo vo);
}
