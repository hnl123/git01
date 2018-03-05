package com.zking.zf.biz;

import com.zking.zf.model.User;
import com.zking.zf.util.PageBean;

import java.util.List;

public interface IUserBiz {

    void add(User user);

    void del(User user);

    void edit(User user);

    User load(User user);

    List<User> list(User user, PageBean pageBean);

    User doLogin(User user);
}
