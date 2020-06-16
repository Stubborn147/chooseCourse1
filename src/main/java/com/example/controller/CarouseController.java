package com.example.controller;

import com.example.entity.Carouse;
import com.example.service.CarouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CarouseController {
    @Autowired
    private CarouseService carouseService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allCarouse")
    @ResponseBody
    public List<Carouse> getAllCarouse(){
        return carouseService.getAllCarouse();
    }
}
