package com.entity;

import java.util.List;

public class Designer {
    private Integer fdId;

    private Integer fdUid;

    private String fdTruename;

    private String fdQq;

    private String fdIntro;

    private String fdAddress;

    private String fdimges;


    private int counts;

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }

    public String getFdimges() {
        return fdimges;
    }

    public void setFdimges(String fdimges) {
        this.fdimges = fdimges;
    }

    private List<Good>good;

    private List<Services> ser;

    public List<Good> getGood() {
        return good;
    }

    public void setGood(List<Good> good) {
        this.good = good;
    }

    public List<Services> getSer() {
        return ser;
    }

    public void setSer(List<Services> ser) {
        this.ser = ser;
    }


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

    @Override
    public String toString() {
        return "Designer{" +
                "fdId=" + fdId +
                ", fdUid=" + fdUid +
                ", fdTruename='" + fdTruename + '\'' +
                ", fdQq='" + fdQq + '\'' +
                ", fdIntro='" + fdIntro + '\'' +
                ", fdAddress='" + fdAddress + '\'' +
                ", fdimges='" + fdimges + '\'' +
                ", counts=" + counts +
                ", good=" + good +
                ", ser=" + ser +
                '}';
    }
}