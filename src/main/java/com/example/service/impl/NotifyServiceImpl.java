package com.example.service.impl;

import com.example.entity.Notify;
import com.example.entity.NotifyExample;
import com.example.mapping.NotifyMapper;
import com.example.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NotifyServiceImpl implements NotifyService {

    @Autowired
    private NotifyMapper notifyMapper;

    @Override
    public boolean insertService(String sid, String notice) {
        Notify notify=new Notify();
        notify.setSid(sid);
        notify.setNotice(notice);
        return notifyMapper.insertSelective(notify)>0?true:false;
    }

    @Override
    public Notify getOneNotifyBySid(String sid) {
        return notifyMapper.selectNotifyBySid(sid);
    }

    @Override
    public boolean deleteNotifyBySid(String sid) {
        NotifyExample example=new NotifyExample();
        example.createCriteria().andSidEqualTo(sid);
        return notifyMapper.deleteByExample(example)>0?true:false;
    }
}
