package com.example.controller;

import com.example.entity.Delcourse;
import com.example.service.DelCourseSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/delcourse")
public class DelCourseController {

    @Autowired
    private DelCourseSerive delCourseSerive;

    @RequestMapping("/insert")
    @ResponseBody
    public boolean insertDelCourse(String delsid, String deltid, String delcid, String delcontent){
        boolean result=delCourseSerive.insertDelCourse(delsid,deltid,delcid,delcontent);
        if(result){
            return true;
        }
        else{
            return false;
        }
    }

    @RequestMapping("/del")
    @ResponseBody
    public boolean delDelCourse(String delsid,String deltid){
        boolean result=delCourseSerive.delDelCourse(delsid,deltid);
        if(result){
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping("/selectByTid")
    @ResponseBody
    public List<Delcourse> getDelcourseByDelTid(String deltid){
        return delCourseSerive.getDelCourseByTid(deltid);
    }
}
