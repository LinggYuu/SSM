package com.ly.service.impl;

import com.ly.dao.UserDao;
import com.ly.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //以下用于构造方法注入

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }//有参构造

    public UserServiceImpl() {
    }//无参构造



    //以下用于set方法注入
//    public UserDao getUserDao() {
//        return userDao;
//    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    public void save(){
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao user = (UserDao) context.getBean("User");
//        user.save();
        userDao.save();
    }
}
