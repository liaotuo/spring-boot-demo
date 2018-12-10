package com.liaotuo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 18070959
 * @create 2018-12-10 9:42 AM
 * @desc
 **/
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "/index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "/hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "/login";
    }
}