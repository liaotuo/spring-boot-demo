package com.liaotuo.springboot.controller;

import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.liaotuo.springboot.entity.User;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author 18070959
 * @create 2018-12-05 10:29 PM
 * @desc swagger RestfulAPI demo
 **/

/***
 * 参考资料:
 * http://blog.didispace.com/springbootswagger2/
 * https://www.cnblogs.com/xu-lei/p/7803062.html
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    // 创建线程安全的Map
    private static Map<Long, User> users = Collections.synchronizedMap(new HashMap<>());

    @ApiOperation(value = "获取用户列表")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        return new ArrayList<>(users.values());
    }

    @ApiOperation(value = "创建用户", notes = "添加一个新用户")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ApiParam(name = "user", value = "用户详细实体user", required = true) @ModelAttribute User user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);

        return "success";
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return users.get(id);
    }

    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable Long id,
                          @ApiParam(name = "user", value = "用户详细实体user", required = true) @ModelAttribute User user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@ApiParam(name = "id", value = "用户ID", required = true) @PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }
}