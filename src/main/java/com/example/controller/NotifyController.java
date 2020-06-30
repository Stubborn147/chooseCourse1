package com.example.controller;

import com.example.entity.Notify;
import com.example.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/notify")
public class NotifyController {

    @Autowired
    private NotifyService notifyService;

    @RequestMapping("/selectBySid")
    @ResponseBody
    public Notify getOneNotifyBySid(String sid){
        return notifyService.getOneNotifyBySid(sid);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public boolean insertNotify(String sid,String notice){
        return notifyService.insertService(sid,notice);
    }

    @RequestMapping("/del")
    @ResponseBody
    public boolean delNotifyBySid(String sid){
        return notifyService.deleteNotifyBySid(sid);
    }
}
