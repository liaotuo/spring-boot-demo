package com.liaotuo.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 18070959
 * @create 2018-12-07 5:20 PM
 * @desc
 **/
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 添加测试属性
        map.addAttribute("github", "https://github.com/liaotuo");
        // 返回字符串 为对应模板文件名 example: src/main/resources/templates/index.html
        return "index";
    }
}