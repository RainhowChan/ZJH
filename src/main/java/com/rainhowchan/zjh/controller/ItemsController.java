package com.rainhowchan.zjh.controller;

import com.rainhowchan.zjh.po.Dept;
import com.rainhowchan.zjh.service.RegisterUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private RegisterUser registerUser;

    @RequestMapping(value = "/register")
    public ModelAndView handleRequest(Dept dept) throws Exception {
        System.out.println(registerUser);
        if (registerUser.addUser(dept) == 1) {
            return new ModelAndView("test", "Dept", dept);
        } else
            return new ModelAndView("test", "error", "没有相关信息");

    }
}
