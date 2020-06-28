package com.example.service.impl;

import com.example.entity.Selectcourse;
import com.example.entity.SelectcourseExample;
import com.example.mapping.SelectcourseMapper;
import com.example.service.SelectCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SelectCourseServiceImpl implements SelectCourseService {

    @Autowired
    private SelectcourseMapper selectcourseMapper;
    @Override
    public List<Selectcourse> getSelectCourseBySid(String sid) {
        SelectcourseExample example=new SelectcourseExample();
        example.createCriteria().andSidEqualTo(sid);
        return selectcourseMapper.selectByExample(example);
    }

    @Override
    public List<Selectcourse> getSelectCourseByCourseName(String coursename) {
        SelectcourseExample example=new SelectcourseExample();
        example.createCriteria().andCoursenameLike("%"+coursename+"%");
        return selectcourseMapper.selectByExample(example);
    }

    @Override
    public boolean insertCourse(String sid, String name, String courseid, String coursename) {
        Selectcourse selectcourse=new Selectcourse();
        selectcourse.setSid(sid);
        selectcourse.setName(name);
        selectcourse.setCourseid(courseid);
        selectcourse.setCoursename(coursename);
        int selective=selectcourseMapper.insertSelective(selectcourse);
        return selective>0?true:false;
    }

    @Override
    public boolean delectCourse(String courseid, String sid) {
        SelectcourseExample selectcourseExample=new SelectcourseExample();
        selectcourseExample.createCriteria().andCourseidEqualTo(courseid).andSidEqualTo(sid);
        int re=selectcourseMapper.deleteByExample(selectcourseExample);
        return re>0?true:false;

    }

    @Override
    public List<Selectcourse> getAllSelectCourse() {
        SelectcourseExample example=new SelectcourseExample();
        return selectcourseMapper.selectByExample(example);
    }

    @Override
    public boolean insertDelCourse(String sid, String courseid, String delcourse) {
        SelectcourseExample example=new SelectcourseExample();
        example.createCriteria().andSidEqualTo(sid).andCourseidEqualTo(courseid);
        Selectcourse selectcourse=new Selectcourse();
        selectcourse.setDelcourse(delcourse);
        return selectcourseMapper.insertSelectiveByExample(selectcourse,example)>0?true:false;
    }
}
