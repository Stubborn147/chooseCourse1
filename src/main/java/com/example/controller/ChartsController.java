package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@Controller
public class ChartsController {

    @RequestMapping("/bar")
    @ResponseBody
    public List<Map<String,Object>> getBar(){
        List<Map<String,Object>> list=new ArrayList<>();
        Map<String,Object> map=new HashMap<>();
        map.put("name","一月");
        map.put("value","200");
        list.add(map);
        map=new HashMap<>();
        map.put("name","二月");
        map.put("value","400");
        list.add(map);
        map=new HashMap<>();
        map.put("name","三月");
        map.put("value","600");
        list.add(map);
        map=new HashMap<>();
        map.put("name","四月");
        map.put("value","350");
        list.add(map);
        return list;
    }
}
