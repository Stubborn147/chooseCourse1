package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String toAdmin(){
        return "admin";
    }

    @RequestMapping("/new")
    public ModelAndView toNew(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("news","欢迎来到登录页面");
        return mav;
    }

    @RequestMapping("/login")
    public String tologin(){
        return null;
    }
}
