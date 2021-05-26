package com.ly.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

public class JdbcTemplateTest {

    //测试jdbc template 开发步骤
    @Test
    public void test1() throws PropertyVetoException {
        //1创建一个数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //1.1设置驱动类
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        //1.2设置jdbc url
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/account?useUnicode=true&characterEncoding=utf8");
        //1.3设置User
        dataSource.setUser("root");
        //1.4设置密码
        dataSource.setPassword("123456");
        //2.创建一个template对象,通过模板对象进行相应的sql操作
        JdbcTemplate template = new JdbcTemplate();
        //3.设置数据源 知道数据库在哪
        template.setDataSource(dataSource);
        //执行操作-更新  ?为占位符，?后面写实际参数
        int row = template.update("insert into account values (?,?)", "tom", 5000);
        System.out.println(row);
    }


    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = context.getBean(JdbcTemplate.class);
        int i = template.update("insert into account values (?,?)", "to22m2", 503200);
        System.out.println(i);
    }


}
