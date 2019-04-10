package com.huaban.entity;

public class Page {

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private int currentPage; // 当前页
    private int pageSize; // 每页显示多少条记录
}
