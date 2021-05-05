package com.ly.service.impl;

import com.ly.dao.UserDao;
import com.ly.pojo.User;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

//
//    @Autowired
//    private User user;

    @Override
    public void save() {
        userDao.save();
    }

    @Override
    public User create(int age,String name){
        User au =new User();
        au.setUsername(name);
        au.setAge(age);
        return au;
    }

}
