package com.huaban.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 采集类
 */
public class Gather {

    private Integer gid;

    private String img;
    /**
     * 用户id
     */
    private Integer hid;

    /**
     * 标签id
     */
    private Integer lid;
    /**
     * 转采者id
     */
    private Integer transpondUid;
    /**
     * 描述
     */
    private String details;

    private String hname;

    private Users user;

    private Integer uid;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @DateTimeFormat( pattern = "yyyy-MM-dd")
    private Date date;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
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

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Gather{" +
                "gid=" + gid +
                ", img='" + img + '\'' +
                ", hid=" + hid +
                ", lid=" + lid +
                ", transpondUid=" + transpondUid +
                ", details='" + details + '\'' +
                ", hname='" + hname + '\'' +
                ", user=" + user +
                ", uid=" + uid +
                ", date=" + date +
                '}';
    }
}