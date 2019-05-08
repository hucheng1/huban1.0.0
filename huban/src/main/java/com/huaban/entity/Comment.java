package com.huaban.entity;

import java.util.Date;

/**
 * 讨论类
 */
public class Comment {
    /**
     * 聊天id
     */
    private Integer cid;

    /**
     * 采集id
     */
    private Integer gid;

    /**
     *  用户id
     */
    private Integer uid;
    /**
     * 发表内容
     */
    private String context;
    /**
     * 发表时间
     */
    private Date date;
    /**
     * 用户对象
     */
    private Users users;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}