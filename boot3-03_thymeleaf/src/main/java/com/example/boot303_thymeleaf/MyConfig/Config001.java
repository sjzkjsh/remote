package com.example.boot303_thymeleaf.MyConfig;

/**
 * 场景: User RESTFul - CRUD
 *  GET /user/1 获取1号用户
 *  GET /users 获取所有用户
 *  POST /user 请求体携带JSON，新增一个用户
 *  PUT /user/1 请求体携带JSON，修改1号用户
 *  DELETE /user/1 删除1号用户
 */

import com.example.boot303_thymeleaf.BizsHandler.personHandler;
import com.example.boot303_thymeleaf.POJO.person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.*;


@Configuration
public class Config001 {
    /**
 * 函数式Web:
 * 1、给容器中放一个Bean: 类型是 RouterFunction<ServerResponse>
 *
 * 核心四大对象:
 * 1、RouterFunction: 定义路由信息。发什么请求，谁来处理
 * 2、RequestPredicate:定义请求的匹配条件，如请求方式、请求路径，请求参数等
 * 3、ServerRequest: 封装完整请求数据信息
 * 4、ServerResponse: 封装完整响应数据信息
 */
    @Bean//如果参数是一个对象，那么会默认从容器中获取这个对象，会自动注入
    public RouterFunction<ServerResponse> routerFunction(personHandler personHandler) {
        /**
         * 通过GET请求方式访问/user/{id}路径的请求。
         * accept(MediaType.ALL) 表示接受所有类型的请求。
         *
         */

//        RouterFunctions.route().GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), request-> {
//            // 业务逻辑处理
//            person person= new person("zhangsan",18);//表示Get查到的用户
//            // 处理请求
//            return ServerResponse.ok().body(person);//.ok()表示请求成功，.body()表示返回响应体
//        }).build();
        /**
         * 也可以这样写,可以将业务处理单独写在一个类中
         */
        RouterFunction<ServerResponse> build = RouterFunctions.route()
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), personHandler::GetHandler)
                /*.add()还可以继续加业务处理
                .DELETE()
                .POST()
                */.build();


        return build;
    }
}
