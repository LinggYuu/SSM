package com.ly.controller;


//用于测试SpringMVC获得请求数据
//https://www.bilibili.com/video/BV1WZ4y1P7Bp?p=62&spm_id_from=pageDriver

import com.ly.pojo.User;
import com.ly.pojo.VO;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/getParm")
public class UserController3 {

//    @Autowired
//    private UserService uu;



    //获得普通类型参数

    @ResponseBody//说明进行页面跳转，说明直接回写数据，但是返回void
    //ResponseBody是个空的
    @RequestMapping("/quick11")
    public void save11(String name,int age){
        System.out.println(name);
        System.out.println(age);
//        User user = uu.create(age, name);
//        System.out.println("uu的名字为"+user.getUsername());
//        System.out.println("uu的年龄为"+user.getAge());
    }



    //获得pojo类型参数

    @ResponseBody//说明进行页面跳转，说明直接回写数据，但是返回void
    //ResponseBody是个空的
    @RequestMapping("/quick12")
    public void save12(User user) throws IOException {
        System.out.println(user);
    }
//发现
//    http://localhost:8080/getParm/quick12?Username=ling&Age=18
//    http://localhost:8080/getParm/quick12?username=ling&age=18
    //两种都能获得


    //获取数组类型参数

    @ResponseBody//说明进行页面跳转，说明直接回写数据，但是返回void
    //ResponseBody是个空的
    @RequestMapping("/quick13")
    public void save13(String[] strs) throws IOException {
        System.out.println(strs);//数组打印的是地址
        //但是list打印就直接是值，所以把strs的类型转成list的话会清晰很多
        System.out.println(Arrays.asList(strs));
    }

    //获得集合类型参数
    @ResponseBody//说明进行页面跳转，说明直接回写数据，但是返回void
    //ResponseBody是个空的
    @RequestMapping("/quick14")
//    public void save14(List<User>userList){
      public void save14(VO vo){
        //得把集合包装到一个pojo对象中才能实现
        //参数名要是userList，是他的内部属性名
        //这个userList是个集合，且集合中每个元素都是User对象
        //需要再提交数据时进行相应文章
        //建一个jsp
        System.out.println(vo);
    }


    //获得集合类型参数2,可以直接参数接收，对应前端ajax.jsp
    @ResponseBody//说明进行页面跳转，说明直接回写数据，但是返回void
    //ResponseBody是个空的
    @RequestMapping("/quick15")
    public void save15(@RequestBody List<User>userList)throws IOException{
//            参数中的RequestBody意味着把请求体的内容直接封装到我的userList中
//           前提：客户端发送的是一个json格式的数据，contentType:"application/json;charset=utf-8"
        System.out.println(userList);
    }



    @ResponseBody
    @RequestMapping("/quick16")
    public void save16(String username) throws IOException{
        //客户端在访问时提交的参数有username，自动封到形参的位置
        System.out.println(username);
    }














}
