package com.example.controller;

import com.example.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/all")
    @ResponseBody
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }


    @RequestMapping("/validate")
    @ResponseBody
    public boolean validate(String username1,String password1){
      boolean result=studentService.ValidateStudent(username1,password1);
      if(result){
          return true;
      }else{
          return false;
      }
  }

}
