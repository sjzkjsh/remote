package com.example.demo.event;

import com.example.demo.POJO.user;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;


//表示登陆成功事件
public class LoginSuccessEvent extends ApplicationEvent {
    public LoginSuccessEvent(user source) {//代表谁登陆成功了
        super(source);
    }

    public LoginSuccessEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
