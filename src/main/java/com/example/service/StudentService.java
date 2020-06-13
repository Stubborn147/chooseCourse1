package com.example.service;

import com.example.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    boolean ValidateStudent(String username1,String password1);
}
