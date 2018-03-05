package com.zking.zf.model;

import java.io.Serializable;

public class User implements Serializable{
    private Integer userId;

    private String userNo;

    private String userPwd;

    private Integer rank;

    public User(Integer userId, String userNo, String userPwd,Integer rank) {
        this.userId = userId;
        this.userNo = userNo;
        this.userPwd = userPwd;
        this.rank = rank;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userNo='" + userNo + '\'' +
                ", userPwd='" + userPwd + '\'' +
                '}';
    }
}