package com.nacos.demo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.nacos.demo.model.User;
import com.nacos.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    //需要注意这里的注解和set方法
    @NacosValue(value = "${testname}",autoRefreshed = true)
    String testName;

    public void setTestName(String testName) {
        this.testName = testName;
    }

    /**
     * 测试数据库连接
     * @param id
     * @return
     */
    @RequestMapping(value = "/findUserById",method = RequestMethod.GET)
    @ResponseBody
    public User findUserById(int id){
        return userService.findById(id);
    }

    /**
     * 测试注解
     * @return
     */
    @RequestMapping(value = "/testname",method = RequestMethod.GET)
    @ResponseBody
    public String testname(){
        return testName;
    }

}
