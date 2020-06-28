package com.example.controller;
import com.example.entity.Admin;
import com.example.entity.AdminExample;
import com.example.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@CrossOrigin(origins = "*")//允许跨域
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/new")
    public ModelAndView toNew(){
        ModelAndView mav=new ModelAndView();
        mav.setViewName("new");
        mav.addObject("news","欢迎来到登录页面");
        return mav;
    }


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

   @RequestMapping("/getOneAdmin")
    @ResponseBody
    public Admin getOneAdminByUsername(String username){
        return adminService.getOneAdmin(username);
   }

   @RequestMapping("/updateByUsername")
    @ResponseBody
    public boolean updateByUsername(Admin admin,AdminExample example){
       example.createCriteria().andUsernameEqualTo(admin.getUsername());
        boolean result=adminService.updateByUsername(admin,example);
        if(result){
            return true;
        }else{
            return false;
        }
   }
}
