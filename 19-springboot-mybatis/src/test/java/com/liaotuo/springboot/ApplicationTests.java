package com.liaotuo.springboot;

import static org.hamcrest.core.StringContains.containsString;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @ClassRule
    public static OutputCapture out = new OutputCapture();

    @Test
    public void contextLoads() {
        out.expect(containsString("City{id=1, name='San Francisco', state='CA', country='US'}"));
    }
}
