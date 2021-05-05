package com.ly.controller;

import com.ly.config.SpringConfiguration;
import com.ly.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;


@Controller
public class UserController {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //用下面这个不会调用初始化方法，可能是因为不会调用构造函数来构造
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) context.getBean("userService");
        userService.save();
        context.close();

    }

}
