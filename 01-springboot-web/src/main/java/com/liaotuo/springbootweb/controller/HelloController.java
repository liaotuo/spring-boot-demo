package com.liaotuo.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18070959
 * @create 2018-12-05 9:09 PM
 * @desc
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "<h1>Hello World</h1>";
    }
}