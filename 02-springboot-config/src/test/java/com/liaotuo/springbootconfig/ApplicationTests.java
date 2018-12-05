package com.liaotuo.springbootconfig;

import com.liaotuo.springbootconfig.config.MyProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private MyProperties myProperties;

    @Test
    public void contextLoads() {
        Assert.assertEquals("Clannad汐", myProperties.getName());
        Assert.assertEquals("https://blog.csdn.net/c1481118216", myProperties.getUrl());
        Assert.assertEquals("Clannad的CSND博客地址https://blog.csdn.net/c1481118216", myProperties.getDesc());
    }
}
