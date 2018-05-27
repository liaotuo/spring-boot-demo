package com.lt.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControll {
    @RequestMapping("/boot/hello")
    @ResponseBody
    public  String hello(){
        return "Hello Spring boot";
    }
}
