package com.zking.zf.controller;

import com.zking.zf.biz.IHouseInfoBiz;
import com.zking.zf.biz.IHouseTypeBiz;
import com.zking.zf.model.HouseInfo;
import com.zking.zf.model.HouseType;
import com.zking.zf.model.User;
import com.zking.zf.util.EhcacheUtil;
import com.zking.zf.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/houseInfo")
public class HouseInfoController{

    @Autowired
    private IHouseInfoBiz houseInfoBiz;

    @Autowired
    private IHouseTypeBiz houseTypeBiz;

    private PageBean pageBean;

    @ModelAttribute
    public void init(Model model, HttpServletRequest request) {
        pageBean = new PageBean();
        pageBean.setRequest(request);
        HouseInfo houseInfo = new HouseInfo();
        model.addAttribute("houseInfo",houseInfo);
        model.addAttribute("user", new User());

        List<HouseInfo> houseInfoList = houseInfoBiz.list(houseInfo, null);
        //从缓存里面取值  房屋类型
//            Object cache = EhcacheUtil.get("houseTypeCache", new HouseType());
//            if(null==cache){
//            EhcacheUtil.put("houseTypeCache",);
//        }

        List<HouseType> houseTypeList = houseTypeBiz.list(new HouseType(), null);
        model.addAttribute("houseInfoList", houseInfoList);
        model.addAttribute("houseTypeList", houseTypeList);
        model.addAttribute("pageBean", pageBean);

    }

    @RequestMapping("/toListHouseInfo")
    public String toListHouseInfo() {
        return "admin/index";
    }

    @RequestMapping("/list")
    public String list(Model model,HouseInfo houseInfo) {
        List<HouseInfo> houseInfoList = houseInfoBiz.list(houseInfo, null);
        model.addAttribute("houseInfoList", houseInfoList);
        model.addAttribute("pageBean", pageBean);
        String path="";
        if (houseInfo.getForward()==1) {
            path="admin/index";
        }else  if (houseInfo.getForward()==2) {
            path="admin/index2";
        }
        return path;
    }

    @RequestMapping("/list2Json")
    @ResponseBody
    public List<HouseInfo> list2Json(Model model,HouseInfo houseInfo,HttpServletRequest request) {
//        List<HouseInfo> houseInfoList = houseInfoBiz.list(houseInfo, null);
//        model.addAttribute("houseInfoList", houseInfoList);
//        model.addAttribute("pageBean", pageBean);
//        String path="";
//        if (houseInfo.getForward()==1) {
//            path="admin/index";
//        }else  if (houseInfo.getForward()==2) {
//            path="admin/index2";
//        }
//        return path;
        PageBean pageBean = new PageBean();
        pageBean.setRequest(request);
        return houseInfoBiz.list(houseInfo, null);
    }


    @RequestMapping("/toAddHouseInfo")
    public String toAddHouseInfo() {

        return "admin/addFwxx";
    }

    @RequestMapping("/addHouseInfo")
    public String addHouseInfo(Model model, HouseInfo houseInfo, HttpSession session) {
        houseInfoBiz.add(houseInfo);
        session.setAttribute("message", "增加成功！");
        return "redirect:/user/toIndex2";
    }

    @RequestMapping("/delHouseInfo")
    public String delHouseInfo(HouseInfo houseInfo,HttpSession session) {
        houseInfoBiz.del(houseInfo);
        session.setAttribute("message", "删除成功！");
        return "redirect:/user/toListMyFwxx";
    }

    @RequestMapping("/editHouseInfo")
    public String editHouseInfo(Model model,HouseInfo houseInfo) {
        System.out.println("aaaa.....");
        HouseInfo h = houseInfoBiz.load(houseInfo);
        model.addAttribute("houseInfo", h);
        return "admin/editFwxx";
    }

    @RequestMapping("/edit")
    public String edit(HouseInfo houseInfo) {
        houseInfoBiz.edit(houseInfo);
        return "redirect:/user/toListMyFwxx";
    }

    @RequestMapping("/loadHouseInfo")
    public String loadHouseInfo(HouseInfo houseInfo,Model model) {
        HouseInfo  h = houseInfoBiz.load(houseInfo);
        model.addAttribute("houseInfo", h);
        return "admin/detailFwxx";
    }
}
