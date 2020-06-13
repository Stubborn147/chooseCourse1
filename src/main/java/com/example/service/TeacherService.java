package com.example.service;

import com.example.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAllTeacher();

    boolean validateTeacher(String username2,String password2);
}
