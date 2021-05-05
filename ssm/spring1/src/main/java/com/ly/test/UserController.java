package com.ly.test;


import com.ly.dao.PersonDao;
import com.ly.dao.impl.PersonDaoImpl;
import com.ly.service.UserService;
import com.ly.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//假装的web层
public class UserController {
    public static void main(String[] args) {
//        UserService service = new UserServiceImpl();
//        service.save();
        //classpathxml找的是resource下的
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\cms\\ssm\\spring1\\src\\main\\resources\\applicationContext.xml");
        //        UserService userService = (UserService) context.getBean("UserService4");
//        userService.save();
        /*
        UserService uu = new UserServiceImpl();
        uu.save();
        会报空指针，因为这里的uu是new的，而不是从容器中拿的，因而它没有UserDao
         */

        PersonDao bean = context.getBean(PersonDaoImpl.class);
        bean.print2();
        //如果通过上面这种getBean则不用强转
//        PersonDao personDao = (PersonDao) context.getBean("PersonDao");
//        personDao.print2();
        //用第二种的话允许出现相同类型的bean，因为id具有唯一性
        //但是第一种就不行
    }
}
