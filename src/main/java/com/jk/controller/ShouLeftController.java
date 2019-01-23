package com.jk.controller;

import com.jk.bean.Class1;
import com.jk.service.ShouLeftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: 骚骚的🐏
 * @Author: 杨
 * @Date: 2019/1/23 15:32
 */
@Controller
@RequestMapping("left")
public class ShouLeftController {

    @Autowired
    private ShouLeftService shouLeftService;


  @ResponseBody
  @RequestMapping("showLeft")
  public List<Class1> showLeft(){
      List<Class1> list= shouLeftService.showLeft();
      return list;
  }
}
