package com.example.boot303_thymeleaf.Controller;

import com.example.boot303_thymeleaf.POJO.person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Controller002 {

    @RequestMapping("/person")
    public String index(Model model){
        List<person> list = Arrays.asList(new person("zhangsan",18)
                ,new person("lisi",19)
                ,new person("wangwu",20)
                ,new person("zhaoliu",21));
        model.addAttribute("list",list);
        return "person";
    }

    //表示处理所有异常
    //@ExceptionHandler可以处理这个类的所有异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(Exception e) {

        return "error 原因:"+e.getMessage();
//        Exception e是捕获到的异常对象，通过e.getMessage()可以获取异常的具体信息。
    }

}
