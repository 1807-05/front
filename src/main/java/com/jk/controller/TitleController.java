package com.jk.controller;

import com.jk.bean.Title;
import com.jk.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("title")
@Controller
public class TitleController {

    @Autowired
    private TitleService titleService;

    @RequestMapping("queryTitle")
    @ResponseBody
    public List<Title> queryTitle(){
        List<Title> queryTitle = titleService.queryTitle();
        return queryTitle;
    }





}
