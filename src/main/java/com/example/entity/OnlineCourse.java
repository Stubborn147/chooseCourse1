package com.example.entity;

public class OnlineCourse {
    private Integer id;

    private String onlineCourseName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOnlineCourseName() {
        return onlineCourseName;
    }

    public void setOnlineCourseName(String onlineCourseName) {
        this.onlineCourseName = onlineCourseName == null ? null : onlineCourseName.trim();
    }
}