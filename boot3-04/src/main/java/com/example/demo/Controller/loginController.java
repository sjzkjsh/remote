package com.example.demo.Controller;


import com.example.demo.POJO.user;
import com.example.demo.event.Eventpublisher;
import com.example.demo.event.LoginSuccessEvent;
import com.example.demo.service.Accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired
    user user;
    @Autowired
    Accountservice accountservice;

    Eventpublisher eventpublisher;
    @RequestMapping("/login")
    public String login(@RequestParam("name") String name,@RequestParam("password") String password){
        accountservice.add(new user("zhangsan","123456"));

        //现在希望用eventpublisher发送一个事件，来万成业务
        //准备登陆成功事件
        LoginSuccessEvent event = new LoginSuccessEvent(new user("zhangsan", "123456"));
        //提交事件，让springboot的事件发布器发布事件
        eventpublisher.sendEvent(event);

        return "登陆成功";
    }



}
