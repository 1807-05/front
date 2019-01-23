package com.jk.controller;

import com.jk.bean.Login;
import com.jk.service.DiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private DiaoService diaoService;

    //跳转登录
    @RequestMapping("login")
    public String login(){

        return "login";
    }

    //登陆
    @RequestMapping("getLogin")
    @ResponseBody
    public HashMap<String, String> login(Login login, HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();
        HttpSession session = request.getSession();
        //根据账号查询用户信息
        Login userInfo = diaoService.getUserInfoByLoginNumber(login.getLoginacct());
        if (userInfo == null) {
            result.put("code", "1");
            result.put("msg", "用户名错误");
            return result;
        }
        //判断密码是否正确
        if(!userInfo.getUserpswd().equals(login.getUserpswd())) {
            result.put("code", "2");
            result.put("msg", "密码错误");
            return result;
        }
        session.setAttribute("userInfo",userInfo);
        session.setAttribute(session.getId(), userInfo);
        result.put("code", "0");
        result.put("msg", "登录成功");
        return result;
    }


}
