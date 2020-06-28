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

    @Override
    public boolean delOneTeacher(String tid) {
        return teacherMapper.deleteByPrimaryKey(tid)>0?true:false;
    }

    @Override
    public void importTeacher(List<Teacher> teachers) {
        for(Teacher tea:teachers){
            teacherMapper.insert(tea);
        }
    }

    @Override
    public List<Teacher> getTeacherByName(String tname) {
        TeacherExample example=new TeacherExample();
        example.createCriteria().andTnameLike("%"+tname+"%");
        return teacherMapper.selectByExample(example);
    }

    @Override
    public List<Teacher> getTeacherByTeachCourse(String teachCourse) {
        TeacherExample example=new TeacherExample();
        example.createCriteria().andTeachCourseLike("%"+teachCourse+"%");
        return teacherMapper.selectByExample(example);
    }

    @Override
    public Teacher getOneTeacherByTid(String tid) {
        return teacherMapper.selectByPrimaryKey(tid);
    }

    @Override
    public boolean updatePwd(String tid, String pwd) {
        Teacher teacher=new Teacher();
        teacher.setTpwd(pwd);
        TeacherExample example=new TeacherExample();
        example.createCriteria().andTidEqualTo(tid);
        return teacherMapper.updateByExampleSelective(teacher,example)>0?true:false;
    }
}
