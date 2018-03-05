package com.zking.zf.model;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.Serializable;
import java.util.Date;

public class HouseInfo implements Serializable {
    private Integer houseId;

    private String title;

    private String address;

    private Integer money;

    private String linkman;

    private String phone;

    private Integer houseType;

    private Integer zxqk;

    private Integer szlc;

    private Integer fwcx;

    private String remark;

    private Integer userEmp;

    private Date showtime;

    private Integer startMoney;

    private Integer endMoney;

    @Ignore
    private Integer isVoid;

    private Integer forward;

    public HouseInfo(Integer houseId, String title, String address, Integer money, String linkman, String phone, Integer houseType, Integer zxqk, Integer szlc, Integer fwcx, String remark, Integer userEmp, Date showtime, Integer startMoney, Integer endMoney, Integer isVoid,Integer forward) {
        this.houseId = houseId;
        this.title = title;
        this.address = address;
        this.money = money;
        this.linkman = linkman;
        this.phone = phone;
        this.houseType = houseType;
        this.zxqk = zxqk;
        this.szlc = szlc;
        this.fwcx = fwcx;
        this.remark = remark;
        this.userEmp = userEmp;
        this.showtime = showtime;
        this.startMoney = startMoney;
        this.endMoney = endMoney;
        this.isVoid = isVoid;
        this.forward = forward;
    }

    public HouseInfo() {
        super();
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getHouseType() {
        return houseType;
    }

    public void setHouseType(Integer houseType) {
        this.houseType = houseType;
    }

    public Integer getZxqk() {
        return zxqk;
    }

    public void setZxqk(Integer zxqk) {
        this.zxqk = zxqk;
    }

    public Integer getSzlc() {
        return szlc;
    }

    public void setSzlc(Integer szlc) {
        this.szlc = szlc;
    }

    public Integer getFwcx() {
        return fwcx;
    }

    public void setFwcx(Integer fwcx) {
        this.fwcx = fwcx;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getUserEmp() {
        return userEmp;
    }

    public void setUserEmp(Integer userEmp) {
        this.userEmp = userEmp;
    }

    public Date getShowtime() {
        return showtime;
    }

    public void setShowtime(Date showtime) {
        this.showtime = showtime;
    }

    public Integer getIsVoid() {
        return isVoid;
    }

    public void setIsVoid(Integer isVoid) {
        this.isVoid = isVoid;
    }


    public Integer getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(Integer startMoney) {
        this.startMoney = startMoney;
    }

    public Integer getEndMoney() {
        return endMoney;
    }

    public void setEndMoney(Integer endMoney) {
        this.endMoney = endMoney;
    }

    public Integer getForward() {
        return forward;
    }

    public void setForward(Integer forward) {
        this.forward = forward;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "houseId=" + houseId +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                ", linkman='" + linkman + '\'' +
                ", phone='" + phone + '\'' +
                ", houseType=" + houseType +
                ", zxqk=" + zxqk +
                ", szlc=" + szlc +
                ", fwcx=" + fwcx +
                ", remark='" + remark + '\'' +
                ", userEmp=" + userEmp +
                ", showtime=" + showtime +
                '}';
    }
}