package com.example.service;

import com.example.entity.Selectcourse;

import java.util.List;

public interface SelectCourseService {

    List<Selectcourse> getSelectCourseBySid(String sid);

    List<Selectcourse> getSelectCourseByCourseName(String coursename);

    boolean insertCourse(String sid,String name,String courseid,String coursename);

    boolean delectCourse(String courseid,String sid);

    List<Selectcourse> getAllSelectCourse();


}
