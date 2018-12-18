package com.liaotuo.springboot;

import com.liaotuo.springboot.entity.User;
import com.liaotuo.springboot.repo.UserRepository;
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
    private UserRepository userRepo;

    @Test
    public void test() {
        // 创建测试数据
        userRepo.save(new User("AAA", 10));
        userRepo.save(new User("BBB", 20));
        userRepo.save(new User("CCC", 30));
        userRepo.save(new User("DDD", 40));
        userRepo.save(new User("EEE", 50));
        userRepo.save(new User("FFF", 60));
        userRepo.save(new User("GGG", 70));
        userRepo.save(new User("HHH", 80));
        userRepo.save(new User("III", 90));
        userRepo.save(new User("JJJ", 100));

        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, userRepo.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepo.findByName("FFF").getAge().longValue());

        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, userRepo.findUser("FFF").getAge().longValue());

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", userRepo.findByNameAndAge("FFF", 60).getName());

        // 测试删除姓名为AAA的User
        userRepo.delete(userRepo.findByName("AAA"));

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, userRepo.findAll().size());
    }

}
