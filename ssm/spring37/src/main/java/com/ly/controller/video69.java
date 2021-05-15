package com.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class video69 {

    @ResponseBody
    @RequestMapping("/quick17")
    public void save16(@RequestParam("name") String username) throws IOException {

        //p69 当提交参数名不一致时，使用@RequestParm

//        value：与请求参数名称,如果参数只有一个的话就可以省略value=
//required：此在指定的请求参数是否必须包括，默认是true，提交时如果没有此参数则报错
//defaultValue：当没有指定请求参数时，则使用指定的默认值赋值
        //客户端在访问时提交的参数有username，自动封到形参的位置
        System.out.println(username);
    }

}
