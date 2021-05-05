package com.ly.test;


import com.ly.config.DataSourceConfiguration;
import com.ly.config.SpringConfiguration;
import com.ly.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
//上下两句效果一样
//@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringJunitTest {

    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test(){
        userService.save();
    }

    @Test
    public void test2() throws SQLException {
        System.out.println(dataSource.getConnection());
    }


}
