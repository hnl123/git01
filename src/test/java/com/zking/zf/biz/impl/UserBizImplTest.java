package com.zking.zf.biz.impl;

import com.zking.zf.biz.IUserBiz;
import com.zking.zf.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserBizImplTest extends BaseTest {

    @Autowired
    private IUserBiz userBiz;

    private User user;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        user = new User();
    }

    @Test
    public void add() throws Exception {
        user.setUserNo("zs002");
        user.setUserPwd("123321");
        userBiz.add(user);

    }

    @Test
    public void del() throws Exception {
        user.setUserId(1);
        userBiz.del(user);
    }

    @Test
    public void edit() throws Exception {
        user.setUserId(2);
        user.setUserNo("zs003");
        user.setUserPwd("321456");
        userBiz.edit(user);
    }

    @Test
    public void load() throws Exception {
        user.setUserId(2);
        User user1 = userBiz.load(user);
        System.out.println(user1);
    }

    @Test
    public void list() throws Exception {
        List<User> userList = userBiz.list(user, pageBean);
        for (User u:userList){
            System.out.println(u);
        }
    }

    @Test
    public void doLogin() throws Exception {
       user.setUserNo("zs003");
       user.setUserPwd("321456");
        User user1 = userBiz.doLogin(this.user);
        System.out.println(user1);
    }

}