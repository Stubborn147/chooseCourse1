package com.example.service.impl;

import com.example.entity.Delcourse;
import com.example.entity.DelcourseExample;
import com.example.mapping.DelcourseMapper;
import com.example.service.DelCourseSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DelCourseServiceImpl implements DelCourseSerive {

    @Autowired
    private DelcourseMapper delcourseMapper;
    @Override
    public boolean insertDelCourse(String delsid, String deltid, String delcid, String delcontent) {
        Delcourse delcourse=new Delcourse();
        delcourse.setDelsid(delsid);
        delcourse.setDelcid(delcid);
        delcourse.setDeltid(deltid);
        delcourse.setDelcontent(delcontent);
        return delcourseMapper.insertSelective(delcourse)>0?true:false;
    }

    @Override
    public boolean delDelCourse(String delsid,String deltid) {
        DelcourseExample example=new DelcourseExample();
        example.createCriteria().andDeltidEqualTo(deltid).andDelsidEqualTo(delsid);
        return delcourseMapper.deleteByExample(example)>0?true:false;
    }

    @Override
    public List<Delcourse> getDelCourseByTid(String deltid) {
        DelcourseExample example=new DelcourseExample();
        example.createCriteria().andDeltidEqualTo(deltid);
        return delcourseMapper.selectByExample(example);
    }
}
