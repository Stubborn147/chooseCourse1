package com.example.service;

import com.example.entity.Delcourse;

import java.util.List;

public interface DelCourseSerive {

    boolean insertDelCourse(String delsid,String deltid,String delcid,String delcontent);

    boolean delDelCourse(String delsid,String deltid);

    List<Delcourse> getDelCourseByTid(String deltid);
}
