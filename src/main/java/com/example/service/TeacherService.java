package com.example.service;

import com.example.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAllTeacher();

    boolean validateTeacher(String username2,String password2);

    boolean delOneTeacher(String tid);

    void importTeacher(List<Teacher> teachers);

    List<Teacher> getTeacherByName(String tname);

    List<Teacher> getTeacherByTeachCourse(String teachCourse);

    Teacher getOneTeacherByTid(String tid);

    boolean updatePwd(String tid,String pwd);

}
