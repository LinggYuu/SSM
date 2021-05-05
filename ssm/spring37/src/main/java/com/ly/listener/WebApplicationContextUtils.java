package com.ly.listener;


//该工具类spring有提供
//下面写着玩


/*

该方法其实spring本身就有，用于获取ApplicationContext
参见UserServlet.java
 */



import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

//工具类
public class WebApplicationContextUtils {

    //static修饰方法,一般用于工具类中
    public static ApplicationContext getWebApplication(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("context");
    }

}
