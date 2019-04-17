package com.entity;

public class Extended {
    private Integer feId;

    private String feName;

    private Integer fePrice;

    private String fePriceunit;

    private Integer fsId;

    public Integer getFeId() {
        return feId;
    }

    public void setFeId(Integer feId) {
        this.feId = feId;
    }

    public String getFeName() {
        return feName;
    }

    public void setFeName(String feName) {
        this.feName = feName == null ? null : feName.trim();
    }

    public Integer getFePrice() {
        return fePrice;
    }

    public void setFePrice(Integer fePrice) {
        this.fePrice = fePrice;
    }

    public String getFePriceunit() {
        return fePriceunit;
    }

    public void setFePriceunit(String fePriceunit) {
        this.fePriceunit = fePriceunit == null ? null : fePriceunit.trim();
    }

    public Integer getFsId() {
        return fsId;
    }

    public void setFsId(Integer fsId) {
        this.fsId = fsId;
    }
}