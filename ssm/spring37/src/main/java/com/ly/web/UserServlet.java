package com.ly.web;

import com.ly.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过监听器
        ServletContext servletContext = this.getServletContext();
//        ApplicationContext context = (ApplicationContext) servletContext.getAttribute("context");
//        ApplicationContext context = WebApplicationContextUtils.getWebApplication(servletContext);
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);//多态，反射
//        ppt 03 p7

        UserService userservice = (UserService) context.getBean(UserService.class);
        userservice.save();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
