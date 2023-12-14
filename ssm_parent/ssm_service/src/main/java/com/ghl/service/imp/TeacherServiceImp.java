package com.ghl.service.imp;

import com.ghl.mapper.TeacherMapper;
import com.ghl.service.TeacherService;
import com.ghl.vo.CourseAndTeacherVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImp implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public int update(CourseAndTeacherVo vo) {
        return teacherMapper.update(vo);
    }

    @Override
    public int insert(CourseAndTeacherVo vo) {
        return teacherMapper.insert(vo);
    }
}
