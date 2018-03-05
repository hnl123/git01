package com.zking.zf.controller;

import com.zking.zf.model.HouseType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/kfc")
public class HelloSpringMvc {

    @RequestMapping("/add")
    public String add(HouseType houseType, String uname, HttpServletRequest request, Model model){
        System.out.println("Hello SpringMvc");
        System.out.println(houseType);
        System.out.println(uname);
        request.setAttribute("msg","Hello Hnl");
        model.addAttribute("zs", "张三");
        return "add";
    }

    @RequestMapping("/hello")
    public String hello(HouseType houseType,String uname) {
        System.out.println("Hello hnl");
        System.out.println(houseType);
        System.out.println(uname);

        return null;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(){
        System.out.println("dddddddddd");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ls", "李四");
        modelAndView.setViewName("add");
        return modelAndView;
    }
}
