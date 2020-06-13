package com.example.service.impl;

import com.example.entity.Teacher;
import com.example.entity.TeacherExample;
import com.example.mapping.TeacherMapper;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> getAllTeacher() {
        TeacherExample example=new TeacherExample();
        return teacherMapper.selectByExample(example);
    }

    @Override
    public boolean validateTeacher(String username2, String password2) {
        TeacherExample teacherExample=new TeacherExample();
        teacherExample.createCriteria().andTidEqualTo(username2).andTpwdEqualTo(password2);
        List<Teacher> teachers=teacherMapper.selectByExample(teacherExample);
        return teachers.size()>0?true:false;
    }
}
