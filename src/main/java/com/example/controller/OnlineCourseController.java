package com.example.controller;

import com.example.entity.OnlineCourse;
import com.example.service.OnlineCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OnlineCourseController {

    @Autowired
    private OnlineCourseService onlineCourseService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allOnlineCourse")
    @ResponseBody
    public List<OnlineCourse> getAllOnlineCourse(){
        return onlineCourseService.getAllOnlineCourse();
    }
}
