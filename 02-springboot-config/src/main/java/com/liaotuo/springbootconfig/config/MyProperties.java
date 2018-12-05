package com.liaotuo.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 18070959
 * @create 2018-12-05 9:37 PM
 * @desc 自定义配置属性类
 **/
@Component
public class MyProperties {
    @Value("${com.liaotuo.csdn.name}")
    private String name;

    @Value("${com.liaotuo.csdn.url}")
    private String url;

    @Value("${com.liaotuo.csdn.desc}")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}