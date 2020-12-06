package com.cb.sbcd.business.base.bean;

public class BaseBean {

    private Integer pageSize;  // 一页多少条数据
    private Integer pageNumber;// 第几页
    private Integer order; // 排序

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }
}
