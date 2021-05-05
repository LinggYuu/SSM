package com.ly.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration//标志该类是Spring的核心配置类，用以替代applicationContext

//<context:component-scan base-package="com.ly.*"/>
@ComponentScan("com.ly")


//<import resource=""/>
@Import(DataSourceConfiguration.class)//其实参数是个数组用逗号分割加载多个.class
public class SpringConfiguration {



}
