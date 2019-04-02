package com.huaban.entity;

import java.util.Date;

public class Gather {
    private Integer gid;

    private String gname;

    private String img;

    private Integer hid;

    private Integer lid;

    private Integer transpondUid;

    private Date date;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getTranspondUid() {
        return transpondUid;
    }

    public void setTranspondUid(Integer transpondUid) {
        this.transpondUid = transpondUid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}