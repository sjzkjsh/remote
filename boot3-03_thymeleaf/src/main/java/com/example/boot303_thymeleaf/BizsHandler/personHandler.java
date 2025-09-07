package com.example.boot303_thymeleaf.BizsHandler;

import com.example.boot303_thymeleaf.POJO.person;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

@Service
public class personHandler {

    public ServerResponse GetHandler(ServerRequest request) throws Exception {
            // 业务逻辑处理
            person person= new person("zhangsan",18);//表示Get查到的用户
            // 处理请求
            return ServerResponse.ok().body(person);//.ok()表示请求成功，.body()表示返回响应体

    }
}
