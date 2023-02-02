package com.zxf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zxf.mapper")
public class MpApp {

    public static void main(String[] args) {
        SpringApplication.run(MpApp.class, args);
    }

}
