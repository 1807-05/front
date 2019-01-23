package com.jk.controller;

import com.jk.bean.Login;
import com.jk.bean.Result;
import com.jk.service.DiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private DiaoService diaoService;

    //跳转登录
    @RequestMapping("tologin")
    public String login() {
        return "login";
    }

    //登陆
    @RequestMapping("login")
    @ResponseBody
    public Result login(Login user, Model model, HttpServletResponse response) {

        Login userFromDB = diaoService.login(user);
        if (userFromDB == null) {
            return new Result(false, "登录失败!");
        } else if
            //密码正确
            //判断有没有勾选记住密码
           (user.getUserpswd() != null) {
            System.out.println(user.getRememberPswd());
            //勾选 --》记住
            Cookie cookie = new Cookie("wuzhu_zhanghao", userFromDB.getLoginacct());
            Cookie cookie1 = new Cookie("wuzhu_mima", userFromDB.getUserpswd());
            //设置过期时间 保存七天
            cookie.setMaxAge(604800);
            //当前应用任何目录下都能访问cookie
            cookie.setPath("/");
            //此时cookie还在服务器上 要发送到浏览器上
            response.addCookie(cookie);
            response.addCookie(cookie1);
        } else {
            //没有勾选清除密码
        }


        return new Result(true, "登录成功");



}

    //登陆成功跳转首页
    @RequestMapping("index")
    public String index(){
        return "shouye";
    }


}
