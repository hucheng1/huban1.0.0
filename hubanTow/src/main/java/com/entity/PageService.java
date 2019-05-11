package com.entity;

import java.util.List;

public class PageService {

    Page page;
    List<Services> ser;
    List<Designer> des;

    List<Good>good;
    List<DesignerGood> dg;

    public List<Designer> getDes() {
        return des;
    }

    public void setDes(List<Designer> des) {
        this.des = des;
    }



    public List<Good> getGood() {
        return good;
    }

    public void setGood(List<Good> good) {
        this.good = good;
    }

    public List<DesignerGood> getDg() {
        return dg;
    }

    public void setDg(List<DesignerGood> dg) {
        this.dg = dg;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<Services> getSer() {
        return ser;
    }

    public void setSer(List<Services> ser) {
        this.ser = ser;
    }
}
