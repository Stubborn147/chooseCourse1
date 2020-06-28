package com.example.service;

import com.example.entity.Course;

import java.util.List;

public interface CourseService {

    List<Course> getAllCourse();

    boolean delOneStudent(String courseId);

    void importCourse(List<Course> list);

    List<Course> getCourseByCourseName(String courseName);

    Course getOneCourseByCid(String courseId);

    Course getOneCourseByCourseTid(String courseTid);

}
