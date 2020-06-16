package com.example.controller;

import com.example.entity.Admin;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/index")
    public String toIndex(){
        return "admin";
    }

    @RequestMapping("/new")
    public ModelAndView toNew(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("news","欢迎来到登录页面");
        return mav;
    }


    @CrossOrigin(origins = "*")//允许跨域
    @RequestMapping("/validate")
    @ResponseBody //返回JSON数据
    public boolean validate(String username,String password){
        boolean result=adminService.validateAdmin(username,password);
        adminService.findAll();
        if(result){
            return true;
        }
        else{
            return false;
        }
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Admin> getAllAdmin(){
        List<Admin> list=adminService.findAll();
        return list;
    }
}
