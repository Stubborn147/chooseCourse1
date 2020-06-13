package com.example.service.impl;

import com.example.entity.OnlineCourse;
import com.example.entity.OnlineCourseExample;
import com.example.mapping.OnlineCourseMapper;
import com.example.service.OnlineCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OnlineCourseServiceImpl implements OnlineCourseService {

    @Autowired
    private OnlineCourseMapper onlineCourseMapper;
    @Override
    public List<OnlineCourse> getAllOnlineCourse() {
        OnlineCourseExample onlineCourseExample=new OnlineCourseExample();
        return onlineCourseMapper.selectByExample(onlineCourseExample);
    }
}
