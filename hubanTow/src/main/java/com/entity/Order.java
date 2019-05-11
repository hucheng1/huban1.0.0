package com.entity;

import java.util.Date;

public class Order {
    private String forId;

    private Integer forSid;

    private Integer forState;

    private Date forDate;

    private String forPayment;

    private String forType;

    private Integer forMoney;

    private Integer fesId;

    private Integer forUrgent;

    private Integer uid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getForId() {
        return forId;
    }

    public void setForId(String forId) {
        this.forId = forId;
    }

    public Integer getForSid() {
        return forSid;
    }

    public void setForSid(Integer forSid) {
        this.forSid = forSid;
    }

    public Integer getForState() {
        return forState;
    }

    public void setForState(Integer forState) {
        this.forState = forState;
    }

    public Date getForDate() {
        return forDate;
    }

    public void setForDate(Date forDate) {
        this.forDate = forDate;
    }

    public String getForPayment() {
        return forPayment;
    }

    public void setForPayment(String forPayment) {
        this.forPayment = forPayment == null ? null : forPayment.trim();
    }

    public String getForType() {
        return forType;
    }

    public void setForType(String forType) {
        this.forType = forType == null ? null : forType.trim();
    }

    public Integer getForMoney() {
        return forMoney;
    }

    public void setForMoney(Integer forMoney) {
        this.forMoney = forMoney;
    }

    public Integer getFesId() {
        return fesId;
    }

    public void setFesId(Integer fesId) {
        this.fesId = fesId;
    }

    public Integer getForUrgent() {
        return forUrgent;
    }

    public void setForUrgent(Integer forUrgent) {
        this.forUrgent = forUrgent;
    }

    @Override
    public String toString() {
        return "Order{" +
                "forId='" + forId + '\'' +
                ", forSid=" + forSid +
                ", forState=" + forState +
                ", forDate=" + forDate +
                ", forPayment='" + forPayment + '\'' +
                ", forType='" + forType + '\'' +
                ", forMoney=" + forMoney +
                ", fesId=" + fesId +
                ", forUrgent=" + forUrgent +
                '}';
    }
}