package com.ly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SelfController {

    @RequestMapping("/ttt")
    public String testt(){
        return "self";
    }

}
