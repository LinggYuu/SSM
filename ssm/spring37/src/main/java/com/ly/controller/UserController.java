package com.ly.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ly.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(value="/user",method = RequestMethod.GET)//如果只有一个value的话可以把value=省略
//,params = "username"
//method = RequestMethod.GET指定请求方式
//params用于限定请求参数，规定在请求是必须要携带或不懈怠什么参数
//        params = {"accountName"}，表示请求参数必须有accountName
//        params = {"moeny!100"}，表示请求参数中money不能是100
//params = "username"在请求时必须要携带参数username
//http://localhost:8080/spring37_war/user/quick?username=lingyu这样就行了
public class UserController {
    @RequestMapping("/quick")
    //替代了web.xml的mapping
    public String save(){
        System.out.println("Controller save running...");
        //return的是要跳转的视图
//        return "/success.jsp";
        //在web.xml配置了内部资源解释器
//        return "/jsp/success2.jsp";
        return "success2";
//        return "forward:/success.jsp";//代表转发，不会改地址
//          return "redirect:/success.jsp";//代表重定向，会改地址，默认就是redirect
        /*
        如果前面什么都没写，就一个"success.jsp"
        这个地址是相对地址，相对当前资源所在地址
        而现在的地址是http://localhost:8080/spring37_war/user/quick
        就意味着所在的地址就是前面这块：http://localhost:8080/spring37_war/user

        加了requestMapping(“/user”)后
        为了找到该资源
        加一个/代表从当前web应用下找这个资源
         */
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        ModelAndView modelAndView = new ModelAndView();
        /*
        Model:模型用于封装数据
        View:视图用于展示数据
         */

        //设置模型数据,下面相当于将名为username的数据放到req域中
        modelAndView.addObject("username","yazan");
//        modelAndView.addObject("asd", new UserDaoImpl());
        //可以add各种Object
        //设置视图名称
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("name","lingyu");

        modelAndView.setViewName("index");
        return modelAndView;
    }


    @RequestMapping("/quick4")
    public String save4(Model model){
        //这里视图部分直接用return了
        //只用Model就行
        model.addAttribute("password","123456");
        return "index";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        //与刚刚的model方式差不多
//     model是springmvc封装好的对象，而request是web原生的那个对象
        //原生的不常用
        request.setAttribute("myname","凌宇");
        return "index";

    }

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello world");
    }


    @RequestMapping("/quick7")
    @ResponseBody//告知springmvc不要进行页面跳转，直接数据回写
    public String save7() throws IOException {
        //这里字符串它以为是一个视图名，要告诉它这只是一个字符串

        return "hello ,yazan";
    }


    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() throws IOException {
//json格式对象
        return "{\"username\":\"ling\",\"age\":18}";
    }

    //quick8借助第三方转换工具
    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws IOException {
        User user = new User();
        user.setUsername("lingyu1");
        user.setAge(18);
        //转成json返回，使用json转换工具将对象转换成json格式字符串再返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        //上述的方法，springmvc有机制搞定，看userController2.java


        return json;
    }




}
