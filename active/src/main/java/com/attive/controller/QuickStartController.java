package com.attive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickStartController {
    @RequestMapping("/quick")
   @ResponseBody
    public String quick(){
        return "快速访问";
    }
    public void add(String id){
        System.out.println("你好啊");
    }
}
