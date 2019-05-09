package com.entity;

import java.util.List;

public class Categorize {
    private Integer fcId;

    private String fcName;

    private List<Subclassification> subs;

    public List<Subclassification> getSubs() {
        return subs;
    }

    public void setSubs(List<Subclassification> subs) {
        this.subs = subs;
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getFcName() {
        return fcName;
    }

    public void setFcName(String fcName) {
        this.fcName = fcName == null ? null : fcName.trim();
    }
}