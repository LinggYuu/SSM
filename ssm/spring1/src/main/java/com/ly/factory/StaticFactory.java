package com.ly.factory;

import com.ly.dao.UserDao;
import com.ly.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
