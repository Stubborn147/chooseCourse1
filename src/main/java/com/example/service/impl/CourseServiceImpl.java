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

    @Override
    public boolean delOneStudent(String courseId) {
        return courseMapper.deleteByPrimaryKey(courseId)>0?true:false;
    }

    @Override
    public void importCourse(List<Course> list) {
        for(Course cou:list){
            courseMapper.insert(cou);
        }
    }

    @Override
    public List<Course> getCourseByCourseName(String courseName) {
        CourseExample example=new CourseExample();
        example.createCriteria().andCourseNameLike("%"+courseName+"%");
        return courseMapper.selectByExample(example);
    }

    @Override
    public Course getOneCourseByCid(String courseId) {
        return courseMapper.selectByPrimaryKey(courseId);
    }

    @Override
    public Course getOneCourseByCourseTid(String courseTid) {
        return courseMapper.selectByCourseTid(courseTid);
    }

}
