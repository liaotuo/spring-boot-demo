package com.liaotuo.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        User n = new User();
        n.setName("张三");
        n.setEmail("zhangsan@gmail.com");
        userRepository.save(n);
        Iterable<User> all = userRepository.findAll();
        all.forEach(System.out::println);
    }
}
