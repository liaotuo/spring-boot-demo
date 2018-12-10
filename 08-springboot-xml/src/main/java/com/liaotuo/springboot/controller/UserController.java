package com.liaotuo.springboot.controller;

import com.liaotuo.springboot.entity.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 18070959
 * @create 2018-12-08 5:28 PM
 * @desc 处理xml的Controller
 **/
@Controller
public class UserController {
    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public User create(@RequestBody User user) {
        user.setName("liaotuo.github: " + user.getName());
        user.setAge(user.getAge() + 100);
        return user;
    }
}