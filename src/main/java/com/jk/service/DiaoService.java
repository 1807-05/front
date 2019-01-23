package com.jk.service;

import com.jk.bean.Login;

public interface DiaoService {

    //登陆
    Login getUserInfoByLoginNumber(String loginacct);
}
