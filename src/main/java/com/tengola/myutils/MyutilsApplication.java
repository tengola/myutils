package com.tengola.myutils;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.ManagedBean;

@SpringBootApplication
@MapperScan("com.tengola.myutils.mapper")
public class MyutilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyutilsApplication.class, args);
    }

}
