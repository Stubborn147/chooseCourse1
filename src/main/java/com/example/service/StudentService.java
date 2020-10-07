package com.example.service;

import com.example.entity.Student;
import com.example.entity.StudentExample;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();
    Student getOneStudent(String sid);
    boolean ValidateStudent(String username1,String password1);
    boolean delOneStudent(String sid);
    void importStudent(List<Student> students);
    boolean updateStudent(Student student, StudentExample example);
    boolean updatePwd(String sid,String pwd);
    boolean insertStudent(Student student);

}
