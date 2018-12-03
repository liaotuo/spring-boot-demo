package com.liaotuo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18070959
 * @create 2018-12-03 10:18 PM
 * @desc
 **/
@RestController
public class MybatisController {

    @GetMapping("/boot/list")
    public Object list(){
        return null;
    }
}