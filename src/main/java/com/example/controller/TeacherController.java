package com.example.controller;

import com.example.entity.Teacher;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/validate")
    @ResponseBody
    public boolean validate(String username2,String password2){
        boolean result=teacherService.validateTeacher(username2,password2);
        if(result){
            return true;
        }else{
            return false;
        }
    }
}
