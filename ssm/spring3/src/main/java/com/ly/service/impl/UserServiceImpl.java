package com.ly.service.impl;

import com.ly.dao.UserDao;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


//    <bean id="userService" class="com.ly.service.impl.UserServiceImpl">
//        <property name="userDao" ref="userDao"></property>
//    </bean>

@Service("userService")
@Scope("singleton")//spring容器只生成一个bean
//@Scope("prototype")spring容器生成多个bean
public class UserServiceImpl implements UserService {


    @Value("${jdbc.driver}")//${}直接从容其中找key，若找到把value赋值给变量
    private String name;
//    private String name="yazan";


//    @Autowired
//    @Qualifier("userDao")//注入的bean的id
    @Resource(name="userDao")//相当于上面两个注释
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        System.out.println(name);
        userDao.save();
    }

    @PostConstruct//构造器执行之后执行下面的方法
    public void init(){
        System.out.println("初始化...");
    }

    @PreDestroy//销毁前执行下面的方法
    public void destroy(){
        System.out.println("销毁...");
    }
}
