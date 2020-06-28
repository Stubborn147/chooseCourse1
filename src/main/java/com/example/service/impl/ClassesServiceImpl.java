package com.example.service.impl;

import com.example.entity.Classes;
import com.example.entity.ClassesExample;
import com.example.mapping.ClassesMapper;
import com.example.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesMapper classesMapper;
    @Override
    public List<Classes> getAllClasses() {
        ClassesExample example=new ClassesExample();
        return classesMapper.selectByExample(example);
    }

    @Override
    public boolean insertClasses(Classes classes) {
        return classesMapper.insertSelective(classes)>0?true:false;
    }
}
