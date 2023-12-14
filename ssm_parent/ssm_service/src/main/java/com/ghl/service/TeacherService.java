package com.ghl.service;

import com.ghl.pojo.Teacher;
import com.ghl.vo.CourseAndTeacherVo;

public interface TeacherService {
    int update(CourseAndTeacherVo vo);

   public int insert(CourseAndTeacherVo vo);
}
