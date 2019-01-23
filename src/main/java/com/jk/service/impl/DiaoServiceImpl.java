package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import com.jk.bean.Login;
import com.jk.service.LoginService;
import com.jk.service.DiaoService;
@Service
public class DiaoServiceImpl implements DiaoService {

    @Reference
    LoginService loginService;

    //登陆
    @Override
    public Login login(Login user) {
        return loginService.login(user);
    }


    //登陸

}
