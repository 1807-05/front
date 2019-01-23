package com.jk.controller;

import com.jk.bean.Login;
import com.jk.bean.Result;
import com.jk.service.DiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private DiaoService diaoService;

    //跳转登录
    @RequestMapping("tologin")
    public String login(){

        return "login";
    }

    //登陆
    @RequestMapping("login")
    @ResponseBody
    public Result login(Login user, Model model) {

        Login userFromDB = diaoService.login(user);
        if (userFromDB == null) {
            return new Result(false, "登录失败!");
        } else {

            return new Result(true, "登录成功");
        }

}

    //登陆成功跳转首页
    @RequestMapping("index")
    public String index(){
        return "shouye";
    }


}
