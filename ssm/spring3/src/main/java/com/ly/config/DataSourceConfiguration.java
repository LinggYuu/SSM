package com.ly.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//<context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")

public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    //    <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
//        <!--这里的name是set方法后面的去大写的名称-->
//        <property name="driverClass" value="${jdbc.driver}"></property>
//        <property name="jdbcUrl" value="${jdbc.url}"></property>
//        <property name="user" value="${jdbc.username}"></property>
//        <property name="password" value="${jdbc.password}"></property>
//    </bean>
    @Bean("dataSource")//将方法返回的类对象注册到容器为一个bean，并命名为dataSource
    public DataSource getDataSource() throws Exception {
        ComboPooledDataSource source1 = new ComboPooledDataSource();
        source1.setDriverClass(driver);
        //上面这条语句需要抛出异常
        source1.setJdbcUrl(url);
        source1.setUser(username);
        source1.setPassword(password);
        return source1;
    }

}
