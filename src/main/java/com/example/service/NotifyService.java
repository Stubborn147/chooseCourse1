package com.example.service;

import com.example.entity.Notify;

public interface NotifyService {

    boolean insertService(String sid,String notice);

    Notify getOneNotifyBySid(String sid);

    boolean deleteNotifyBySid(String sid);
}
