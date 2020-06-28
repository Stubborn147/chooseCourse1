package com.example.controller;

import com.example.entity.Classes;
import com.example.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("classes")
public class ClassesController {

    @Autowired
    private ClassesService classesService;


    @RequestMapping("all")
    @ResponseBody
    public List<Classes> getAllClasses(){
        return classesService.getAllClasses();
    }

    @RequestMapping("/insert")
    @ResponseBody
    public boolean insertClass(Classes classes){
        boolean result=classesService.insertClasses(classes);
        if(result){
            return true;
        }else{
            return false;
        }

    }

}
