package com.ly.dao.impl;

import com.ly.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


//    <bean id="userDao" class="com.ly.dao.impl.UserDaoImpl">
//    </bean>
// 上述的使用注解来做

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
