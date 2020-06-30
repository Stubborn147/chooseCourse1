package com.example.controller;

import com.example.entity.Selectcourse;
import com.example.entity.SelectcourseExample;
import com.example.service.SelectCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/selectcourse")
public class SelectcourseController {

    @Autowired
    private SelectCourseService selectCourseService;

    @RequestMapping("/getSelectCourseBySid")
    @ResponseBody
    public List<Selectcourse> getSelectCourseBySid(String sid){
        return selectCourseService.getSelectCourseBySid(sid);
    }

    @RequestMapping("/getSelectCourseByCourseName")
    @ResponseBody
    public List<Selectcourse> getSelectCourseByName(String coursename){
        return selectCourseService.getSelectCourseByCourseName(coursename);
    }


    @RequestMapping("/insertCourses")
    @ResponseBody
    public String insertCourses(String sid,String name,String courseid,String coursename){
        boolean result= selectCourseService.insertCourse(sid,name,courseid,coursename);
        if(result){
            return "选课成功";
        }else{
            return "选课失败";
        }

    }
    @RequestMapping("/deleteCourse")
    @ResponseBody
    public boolean deleteCourse(String courseid,String sid){
        boolean res=selectCourseService.delectCourse(courseid,sid);
        if(res){
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Selectcourse> getAllSelectCurse(){
        return selectCourseService.getAllSelectCourse();
    }
}
