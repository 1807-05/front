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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
    public Result login(Login user, Model model, HttpServletRequest request, HttpServletResponse response) {

        Login userFromDB = diaoService.login(user);



        if (userFromDB == null) {//登录失败
            return new Result(false, "用户名或者密码错误!");
        } else{
            //将用户的账号放入cookie中
            Cookie cookieLoginacct= new Cookie("user_Loginacct",user.getLoginacct());
            //设置过期时间  保存七天
            cookieLoginacct.setMaxAge(604800);
            //当前应用任何目录下都能访问cookie
            cookieLoginacct.setPath("/");
            //此时cookie还在服务器上  要把cookie发送到浏览器上  通过相应对象
            response.addCookie(cookieLoginacct);
            //登陆成功,把用户信息放入session
            request.getSession().setAttribute("user",userFromDB.getLoginacct());
            return new Result(true, "登录成功");
        }


}

    //登陆成功跳转首页
    @RequestMapping("index")
    public String index(){
        return "shouye";
    }
    //注销
    @RequestMapping("remove")
    @ResponseBody
    public String remove(HttpSession session){
        session.invalidate();
        return null;
    }

}
