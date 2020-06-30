package com.example.entity;

public class Selectcourse {
    private Integer selectid;

    private String sid;

    private String name;

    private String courseid;

    private String coursename;

    public Integer getSelectid() {
        return selectid;
    }

    public void setSelectid(Integer selectid) {
        this.selectid = selectid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }
}