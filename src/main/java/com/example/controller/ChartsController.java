package com.example.controller;

import com.example.entity.*;
import com.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@Controller
public class ChartsController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private ClassesService classesService;

    @Autowired
    private SelectCourseService selectCourseService;

    @RequestMapping("/bar")
    @ResponseBody
    public List<Map<String,Object>> getBar(){
        List<Map<String,Object>> list=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        List<Student> students=studentService.getAllStudent();
        map.put("name","学生总人数");
        map.put("value",students.size());
        list.add(map);
        map=new HashMap<>();
        List<Selectcourse> selectcourses=selectCourseService.getAllSelectCourse();
        map.put("name","已选课程人数");
        map.put("value",selectcourses.size());
        list.add(map);
        List<Teacher> teachers=teacherService.getAllTeacher();
        map=new HashMap<>();
        map.put("name","教师人数");
        map.put("value",teachers.size());
        list.add(map);
        map=new HashMap<>();
        List<Course> courses=courseService.getAllCourse();
        map.put("name","课程数量");
        map.put("value",courses.size());
        list.add(map);
        map=new HashMap<>();
        List<Classes> classes=classesService.getAllClasses();
        map.put("name","班级数量");
        map.put("value",classes.size());
        list.add(map);
        return list;
    }
}
