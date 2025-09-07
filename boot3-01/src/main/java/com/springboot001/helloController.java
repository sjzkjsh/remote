package com.springboot001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller,控制器，处理http请求
//@ResponseBody//返回的是字符串，不是页面，返回jason数据
//@RestController是@Controller和@ResponseBody的结合体，
@RestController
public class helloController {

    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }
}
