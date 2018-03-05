package com.zking.zf.biz.impl;

import com.zking.zf.biz.IUserBiz;
import com.zking.zf.mapper.UserMapper;
import com.zking.zf.model.User;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBizImpl implements IUserBiz {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void del(User user) {
        userMapper.deleteByPrimaryKey(user.getUserId());
    }

    @Override
    public void edit(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public User load(User user) {
        return userMapper.selectByPrimaryKey(user.getUserId());
    }

    @Override
    public List<User> list(User user, PageBean pageBean) {
        return userMapper.list(user);
    }

    @Override
    public User doLogin(User user) {
        return userMapper.doLogin(user);
    }
}
