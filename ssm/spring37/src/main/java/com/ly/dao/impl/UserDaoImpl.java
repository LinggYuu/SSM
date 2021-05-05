package com.ly.dao.impl;

import com.ly.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }


}
