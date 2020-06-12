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
public class AdminController {

    @Autowired
    private AdminService adminService;
//jsp页面
//    @RequestMapping("/admin")
//    public String toAdmin(){
//        return "admin";
//    }

    @RequestMapping("/new")
    public ModelAndView toNew(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("news","欢迎来到登录页面");
        return mav;
    }
    //允许跨域
    @CrossOrigin(origins = "*")
    @RequestMapping("/validate")
    @ResponseBody //返回JSON数据
    public String validate(String username,String password){
        boolean result=adminService.validate(username,password);
        adminService.findAll();
        if(result){
            return "登录成功";
        }
        else{
            return "登录失败";
        }
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Admin> getAllAdmin(){
        List<Admin> list=adminService.findAll();
        return list;
    }
}
