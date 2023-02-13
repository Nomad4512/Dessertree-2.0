package com.dessertree.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/hello") // 테스트
    public static String hello(){

        return "hello";
    }
}
