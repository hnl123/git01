package com.zking.zf.controller;

import com.zking.zf.biz.IHouseInfoBiz;
import com.zking.zf.biz.IHouseTypeBiz;
import com.zking.zf.biz.IUserBiz;
import com.zking.zf.model.HouseInfo;
import com.zking.zf.model.HouseType;
import com.zking.zf.model.User;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private HouseInfo houseInfo = new HouseInfo();

    private PageBean pageBean;

    @Autowired
    private IUserBiz userBiz;

    @Autowired
    private IHouseInfoBiz houseInfoBiz;

    @Autowired
    private IHouseTypeBiz houseTypeBiz;

    @ModelAttribute
    public void init(Model model, HttpServletRequest request) {
        pageBean  = new PageBean();
        pageBean.setRequest(request);
        model.addAttribute("houseInfo", houseInfo);
        model.addAttribute("user", new User());

        List<HouseInfo> houseInfoList = houseInfoBiz.list(houseInfo, null);
        List<HouseType> houseTypeList = houseTypeBiz.list(new HouseType(), null);
        model.addAttribute("houseTypeList", houseTypeList);
        request.setAttribute("houseInfoList", houseInfoList);
    }

    @RequestMapping("/toAddUser")
    public String toAddUser() {

        return "admin/reg";
    }

    @RequestMapping("/login")
    public String login(Model model, HttpSession session,User user) {
        User u = userBiz.doLogin(user);
        System.out.println(u);
        session.setAttribute("user", u);
        session.setAttribute("userNo", u.getUserNo());
        String path="admin/index2";
        return path;
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.setAttribute("user", null);
        session.setAttribute("userNo", null);
        return "admin/index";
    }

    @RequestMapping("/toListMyFwxx")
    public String toListMyFwxx() {

        return "admin/listMyFwxx";
    }

    @RequestMapping("/toIndex2")
    public String toIndex2() {

        return "admin/index2";
    }

    //注册用户
    @RequestMapping("/doReg")
    public String doReg(User user,HttpServletRequest request) {
          userBiz.add(user);
//        RequestContext requestContext = new RequestContext(request);
//        String errorMsg = requestContext.getMessage("password.error.label");
//        System.out.println("errorMsg:" + errorMsg);
        return "redirect:/houseInfo/toListHouseInfo";
    }
}
