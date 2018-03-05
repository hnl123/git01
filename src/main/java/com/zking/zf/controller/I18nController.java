package com.zking.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpSession;
import java.util.Locale;

@Controller
@RequestMapping("/i18n")
public class I18nController {

    @RequestMapping("/toZh")
    public String toZh(HttpSession session) {
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);

        return "redirect:/houseInfo/toAddHouseInfo";
    }

    @RequestMapping("/toUs")
    public String toUs(HttpSession session) {
        session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.US);

        return "redirect:/houseInfo/toAddHouseInfo";
    }
}
