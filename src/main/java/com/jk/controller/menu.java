package com.jk.controller;

import com.jk.bean.Week;
import com.jk.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.swing.text.View;
import java.util.List;

@Controller
@RequestMapping("view")
public class menu {
    @RequestMapping("toview")
    public String toView(String view){

        return view;
    }

    @Autowired
    private MenuService menuService;

    @RequestMapping("getImgs")
    @ResponseBody
    public List<Week> getImgs(String flog){


        return   menuService.getImgs(flog);
    }
}
