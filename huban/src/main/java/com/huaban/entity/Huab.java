package com.huaban.entity;

import java.util.List;

/**
 * 画板类
 */
public class Huab {
    private Integer hid;

    private String hname;

    private String context;

    private Integer cid;

    private Integer uid;

    private List<Gather> gathers;

    private List<Users> usersList;

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    public List<Gather> getGathers() {
        return gathers;
    }

    public void setGathers(List<Gather> gathers) {
        this.gathers = gathers;
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname == null ? null : hname.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Huab{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                ", context='" + context + '\'' +
                ", cid=" + cid +
                ", uid=" + uid +
                ", gathers=" + gathers +
                ", usersList=" + usersList +
                '}';
    }
}