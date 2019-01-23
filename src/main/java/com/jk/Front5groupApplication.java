package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.jk.mapper")
@SpringBootApplication
public class Front5groupApplication {

    public static void main(String[] args) {

        SpringApplication.run(Front5groupApplication.class, args);
    }

}

