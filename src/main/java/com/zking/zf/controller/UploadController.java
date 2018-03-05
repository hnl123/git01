package com.zking.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/uploads")
public class UploadController {

    String path="D:\\temp\\uploads\\";

    @RequestMapping("/toUpload")
    public String toUpload(MultipartFile img,HttpSession session) throws Exception{
        String fileName = img.getOriginalFilename();
        File f = new File(path+fileName);
        img.transferTo(f);
        session.setAttribute("msg","文件上传成功！");
        return "upload";
    }

}
