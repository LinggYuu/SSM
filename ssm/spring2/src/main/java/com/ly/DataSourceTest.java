package com.ly;


import java.sql.Connection;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DataSourceTest {

    @Test
    public void test1() throws Exception {
        ComboPooledDataSource source1 = new ComboPooledDataSource();
        source1.setDriverClass("com.mysql.jdbc.Driver");
        //上面这条语句需要抛出异常
        source1.setJdbcUrl("jdbc:mysql://localhost:3306/school");
        source1.setUser("root");
        source1.setPassword("123456");
        Connection c1 = source1.getConnection();
        System.out.println(c1);
        c1.close();
    }

    @Test
    public void test2() throws Exception {
        DruidDataSource source2 = new DruidDataSource();
        source2.setDriverClassName("com.mysql.jdbc.Driver");
        source2.setUrl("jdbc:mysql://localhost:3306/school");
        source2.setUsername("root");
        source2.setPassword("123456");
        DruidPooledConnection c2 = source2.getConnection();
        System.out.println(c2);
        c2.close();
    }

    @Test
    //加载properties配置文件形式
    public void test3() throws Exception {
        //读取配置文件,参数为基本名称，相对于类加载路径（在开发环境下相对于resource下的
        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        //只要基本名称，即省略.properties
        String driver = bundle.getString("jdbc.driver");
        String url = bundle.getString("jdbc.url");
        String username = bundle.getString("jdbc.username");
        String password = bundle.getString("jdbc.password");
        //创建数据源对象 设置连接参数
        DruidDataSource source3 = new DruidDataSource();
        source3.setDriverClassName(driver);
        source3.setUrl(url);
        source3.setUsername(username);
        source3.setPassword(password);
        DruidPooledConnection c3 = source3.getConnection();
        System.out.println(c3);
        c3.close();
    }


    @Test
    public void test4() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection c = dataSource.getConnection();
        System.out.println(c);
        c.close();
    }




}
