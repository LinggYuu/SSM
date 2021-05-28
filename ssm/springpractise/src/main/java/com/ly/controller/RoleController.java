package com.ly.controller;

import com.ly.entity.Role;
import com.ly.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @RequestMapping("/list")
    public ModelAndView list(){
        ModelAndView mav =new ModelAndView();
        List<Role> roleList = roleService.list();
        //指定模型
        mav.addObject("roleList",roleList);
        //指定视图
        mav.setViewName("role-list");
        return mav;
    }
}
