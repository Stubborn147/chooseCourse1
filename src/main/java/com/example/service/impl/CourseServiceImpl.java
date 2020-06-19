package com.example.service.impl;

import com.example.entity.Course;
import com.example.entity.CourseExample;
import com.example.mapping.CourseMapper;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> getAllCourse() {
        CourseExample example=new CourseExample();
        return courseMapper.selectByExample(example);
    }
}
