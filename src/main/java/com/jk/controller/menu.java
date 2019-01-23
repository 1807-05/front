package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * @Description: 骚骚的🐏
 * @Author: 杨
 * @Date: 2019/1/23 14:42
 */
@Controller
@RequestMapping("view")
public class menu {
    @RequestMapping("toview")
    public String toView(String view){

        return view;
    }

}
