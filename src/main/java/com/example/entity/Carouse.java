package com.example.entity;

public class Carouse {
    private Integer id;

    private String rotationurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRotationurl() {
        return rotationurl;
    }

    public void setRotationurl(String rotationurl) {
        this.rotationurl = rotationurl == null ? null : rotationurl.trim();
    }
}