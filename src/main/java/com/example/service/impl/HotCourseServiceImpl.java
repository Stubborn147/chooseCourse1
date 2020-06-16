package com.example.service.impl;

import com.example.entity.Hotcourse;
import com.example.entity.HotcourseExample;
import com.example.mapping.HotcourseMapper;
import com.example.service.HotCourseService;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class HotCourseServiceImpl  implements HotCourseService {

    @Autowired
    private HotcourseMapper hotcourseMapper;
    @Override
    public List<Hotcourse> getAllHotCourse() {
        HotcourseExample example=new HotcourseExample();
        return hotcourseMapper.selectByExample(example);
    }
}
