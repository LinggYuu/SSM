package com.ly.factory;

import com.ly.dao.UserDao;
import com.ly.dao.impl.UserDaoImpl;



//必须要先有工厂对象
public class DynamicFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
