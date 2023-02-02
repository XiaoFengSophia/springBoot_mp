package com.zxf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:zxf
 * @create: 2023-01-30 09:08
 * @Description: 测试机哦
 * @Company: 白云信科·研发中心·研发三室
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){

        return "HELLO WORLD !!! ";
    }
}
