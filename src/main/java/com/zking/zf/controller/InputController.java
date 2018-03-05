package com.zking.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/input")
public class InputController {

    public InputController() {
        super();
    }

    @RequestMapping("/{dir}/{page}")
    public String forwardPage(@PathVariable String dir,
                              @PathVariable String page) {
        String path = dir + "/" + page;
        return path;
    }
}