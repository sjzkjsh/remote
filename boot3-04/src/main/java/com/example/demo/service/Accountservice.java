package com.example.demo.service;

import com.example.demo.POJO.user;
import com.example.demo.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;
//实现事件监听
@Service//继承ApplicationListener<>，来监听事件里面写LoginSuccessEvent，表示只监听LoginSuccessEvent事件
public class Accountservice implements ApplicationListener<LoginSuccessEvent> {

    public void add(user user){
        System.out.println(user.getName()+"用户登陆成功");
    }

    //还有一种方法不需要写接口
    //@EventListener
//    public void OnApplicationEvent(LoginSuccessEvent event){
//        System.out.println("事件监听器收到事件："+event.getSource());
//    }
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        System.out.println("事件监听器收到事件："+event.getSource());
    }
}
