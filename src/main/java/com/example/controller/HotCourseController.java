package com.example.controller;

import com.example.entity.Hotcourse;
import com.example.service.HotCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HotCourseController {

    @Autowired
    private HotCourseService hotCourseService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allhotcourse")
    @ResponseBody
    public List<Hotcourse> getAllHotCourse(){
        return hotCourseService.getAllHotCourse();
    }
}
