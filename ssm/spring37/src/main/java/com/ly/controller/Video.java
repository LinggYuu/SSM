package com.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
public class Video {

    @ResponseBody
    @RequestMapping("/quick177")
    public void save16(@RequestParam(value = "name") String username) throws IOException {
//        public void save16(@RequestParam("name") String username)也行
        //p69 当提交参数名不一致时，使用@RequestParm

//        value：与请求参数名称,如果参数只有一个的话就可以省略value=
//required：此在指定的请求参数是否必须包括，默认是true，提交时如果没有此参数则报错
//defaultValue：当没有指定请求参数时，则使用指定的默认值赋值
        //客户端在访问时提交的参数有username，自动封到形参的位置
        System.out.println(username);
    }


//    video70
    @ResponseBody
//    @RequestMapping(value = "/quick17/{name}",method = RequestMethod.PUT),配合method指定请求类型
    @RequestMapping("/quick17/{name}")
    public void save17(@PathVariable("name") String myname)throws IOException{
        System.out.println(myname);
    }

    //    video71自动类型转换器转换日期，创建converter包
    @ResponseBody
    @RequestMapping("/quick18")
    public void save18(Date date)throws IOException{
        System.out.println(date);
    }

    //    video72 调用Servlet API
    @ResponseBody
    @RequestMapping("/quick19")
    public void save19(String name, HttpServletRequest request, HttpServletResponse response,
                       HttpSession session)throws IOException {
        System.out.println("request:" + request);
        System.out.println("response" + response);
        System.out.println("session:" + session);
        //catalina都是tomcat的。传给springmvc框架，引用的传递
    }

        //    video73 请求头信息获取
        @ResponseBody
        @RequestMapping("/quick20")
        //required=false代表不带这个头也能允许访问资源，不是必须的
        public void save20(@RequestHeader(value = "Host",required = false) String  user_host
                           ,@RequestHeader("User-Agent") String user_Agent
        )throws IOException{
            System.out.println(user_host);
            System.out.println(user_Agent);
    }


    @ResponseBody
    @RequestMapping("/quick21")
    //获得cookie
    public void save21(@CookieValue("JSESSIONID") String jsessionID)throws IOException{
        System.out.println(jsessionID);
    }

    @ResponseBody
    @RequestMapping("/quick22")
//    形参名称与jsp中name的属性要一致
    public void save22(@RequestParam("username") String name, MultipartFile uploadFile)throws IOException{
        System.out.println(name);
        System.out.println(uploadFile);
        System.out.println(uploadFile.getName());//代表获得上传文件的表单项的名称，不是我们所需要的
        //获得上传文件的名称如下方法
        String filename = uploadFile.getOriginalFilename();
        System.out.println(filename);
        uploadFile.transferTo(new File("D:\\github\\upload\\"+filename));//文件转移到哪
    }

//    @ResponseBody
//    @RequestMapping("/quick23")
////    形参名称与jsp中name的属性要一致
//    public void save23(@RequestParam("username") String name, MultipartFile uploadFile1,MultipartFile uploadFile2)throws IOException{
//
//        String filename1 = uploadFile1.getOriginalFilename();
//        String filename2 = uploadFile2.getOriginalFilename();
//        uploadFile1.transferTo(new File("D:\\github\\upload\\"+filename1));//文件转移到哪
//        uploadFile2.transferTo(new File("D:\\github\\upload\\"+filename2));
//    }

    //p71
    //    如果表单中文件属性名则可以用数组遍历取出
    @ResponseBody
    @RequestMapping("/quick23")
//    形参名称与jsp中name的属性要一致
    public void save23(@RequestParam("username") String name, MultipartFile[] uploadFiles)throws IOException{

        for (MultipartFile uploadFile : uploadFiles) {
            String filename = uploadFile.getOriginalFilename();
            uploadFile.transferTo(new File("D:\\github\\upload\\"+filename));
        }


    }




}
