package com.liaotuo.springboot;

import com.liaotuo.springboot.exception.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 18070959
 * @create 2018-12-05 9:09 PM
 * @desc 异常统一处理
 **/

/***
 * 参考资料: http://blog.didispace.com/springbootexception/
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String exception() {
        throw new ServiceException(1, "系统繁忙");
    }
}