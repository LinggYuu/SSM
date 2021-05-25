package com.ly.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ly.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

//返回对象或集合

@Controller

public class userContoller2 {

    @RequestMapping("/quick10")
    @ResponseBody
    //期望springmvc自动把User转成json格式字符串
    //需要配置
    /*
    <bean class="org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter">
        <property name="messageConverters">
             <list>
                <bean class="org.springframework.http.converter.json.MappingJackson2HttpMessageConverter">
                </bean>
            </list>
        </property></bean>
        或
        <mvc:annotation-driven/>
        ppt04-16
     */
    public User save9() throws IOException {
        User user = new User();
        user.setUsername("lingyu2");
        user.setAge(183);
        return user;
    }

}
