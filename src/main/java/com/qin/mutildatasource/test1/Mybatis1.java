package com.qin.mutildatasource.test1;

import com.qin.mutildatasource.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注释：
 * 作者：秦盟
 * 时间：2018-12-15 22:40
 */
@RestController
public class Mybatis1 {
    @Autowired
    MybatisService1 service;

    @Transactional(value = "test1TransactionManager")
    @RequestMapping("add1")
    public String addUser(int age, String name) {
        System.out.println("hell");
        User user = new User();
        user.setAge(age);
        user.setName(name);
        service.insertUser(user.getAge(), user.getName());
        int i = 1 / age;
        return "zbq";
    }


}