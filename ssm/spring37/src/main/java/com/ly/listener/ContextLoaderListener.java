package com.ly.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    //上下文初始化后的方法
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();
        //获取ServletContext域
        //读取web.xml中的全局参数(通过name来获取对应value
        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(contextConfigLocation);
        //将spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("context",context);
        System.out.println("spring容器创建完毕...");//在用之前就创建了
    }

    @Override
    //上下文销毁后的方法
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
