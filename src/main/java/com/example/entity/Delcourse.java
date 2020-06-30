package com.example.entity;

public class Delcourse {
    private Integer delid;

    private String delsid;

    private String deltid;

    private String delcid;

    private String delcontent;

    public Integer getDelid() {
        return delid;
    }

    public void setDelid(Integer delid) {
        this.delid = delid;
    }

    public String getDelsid() {
        return delsid;
    }

    public void setDelsid(String delsid) {
        this.delsid = delsid == null ? null : delsid.trim();
    }

    public String getDeltid() {
        return deltid;
    }

    public void setDeltid(String deltid) {
        this.deltid = deltid == null ? null : deltid.trim();
    }

    public String getDelcid() {
        return delcid;
    }

    public void setDelcid(String delcid) {
        this.delcid = delcid == null ? null : delcid.trim();
    }

    public String getDelcontent() {
        return delcontent;
    }

    public void setDelcontent(String delcontent) {
        this.delcontent = delcontent == null ? null : delcontent.trim();
    }
}