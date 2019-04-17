package com.entity;

public class Designer {
    private Integer fdId;

    private Integer fdUid;

    private String fdTruename;

    private String fdQq;

    private String fdIntro;

    private String fdAddress;

    public Integer getFdId() {
        return fdId;
    }

    public void setFdId(Integer fdId) {
        this.fdId = fdId;
    }

    public Integer getFdUid() {
        return fdUid;
    }

    public void setFdUid(Integer fdUid) {
        this.fdUid = fdUid;
    }

    public String getFdTruename() {
        return fdTruename;
    }

    public void setFdTruename(String fdTruename) {
        this.fdTruename = fdTruename == null ? null : fdTruename.trim();
    }

    public String getFdQq() {
        return fdQq;
    }

    public void setFdQq(String fdQq) {
        this.fdQq = fdQq == null ? null : fdQq.trim();
    }

    public String getFdIntro() {
        return fdIntro;
    }

    public void setFdIntro(String fdIntro) {
        this.fdIntro = fdIntro == null ? null : fdIntro.trim();
    }

    public String getFdAddress() {
        return fdAddress;
    }

    public void setFdAddress(String fdAddress) {
        this.fdAddress = fdAddress == null ? null : fdAddress.trim();
    }
}