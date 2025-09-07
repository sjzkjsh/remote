package com.example.demo.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

//事件发布器
@Service
public class Eventpublisher implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;
    //发送事件,所有事件都可以发送
    public void sendEvent(LoginSuccessEvent event){
        //调用底层API，来发布事件
        applicationEventPublisher.publishEvent(event);
    }
    @Override//利用Springboot的监听器，来监听事件，系统会自动调用这个方法，会把真正发事件的底层组件注入进来
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
