package com.immigration.application.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company：途牛旅游
 *
 * @Auther: tao.zhang
 * @Date: 2019/9/7 15:45
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "welcome to immigration-application";
    }
}
