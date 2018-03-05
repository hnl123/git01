package com.zking.zf.model;

import java.io.Serializable;

public class Order implements Serializable{
    private Integer orderId;

    private String orderName;

    private Integer cid;

    private Customer customer;

    public Order(Integer orderId, String orderName, Integer cid) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.cid = cid;
    }

    public Order() {
        super();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                ", cid=" + cid +
                '}';
    }
}