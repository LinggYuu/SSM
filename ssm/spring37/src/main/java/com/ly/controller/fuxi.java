package com.ly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//ppt3-16复习

public class fuxi {
    @RequestMapping("/fff1")
    public String fuxi1(){
        return"forward:/index.jsp";
    }

}
