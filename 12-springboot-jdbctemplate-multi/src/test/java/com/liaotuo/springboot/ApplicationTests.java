package com.liaotuo.springboot;

import com.liaotuo.springboot.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
        // 测试之前清空user表
        userService.deleteAllUsers();
    }

    @Test
    public void test() {
        // 插入测试数据
        userService.create("张三", 20);
        userService.create("李四", 25);
        userService.create("王五", 30);
        userService.create("赵六", 35);
        userService.create("田七", 40);

        // 查数据库，应该有5个用户
        Assert.assertEquals(5, userService.getAllUsers().intValue());

        // 删除两个用户
        userService.deleteByName("张三");
        userService.deleteByName("李四");

        // 查数据库，剩余3个用户
        Assert.assertEquals(3, userService.getAllUsers().intValue());
    }

}
