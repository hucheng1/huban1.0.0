package com.entity;

public class Good {
    private Integer fgId;

    private String fgName;

    public Integer getFgId() {
        return fgId;
    }

    public void setFgId(Integer fgId) {
        this.fgId = fgId;
    }

    public String getFgName() {
        return fgName;
    }

    public void setFgName(String fgName) {
        this.fgName = fgName == null ? null : fgName.trim();
    }
}