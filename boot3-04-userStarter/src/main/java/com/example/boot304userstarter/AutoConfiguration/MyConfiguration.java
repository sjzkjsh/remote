package com.example.boot304userstarter.AutoConfiguration;

import com.example.boot304userstarter.Controller.UserController;
import com.example.boot304userstarter.POJO.User;
import com.example.boot304userstarter.UserService.userService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//这个是利用配置类实现自定义starter的底层实现
@Import({userService.class, UserController.class, User.class})
@Configuration
public class MyConfiguration {

}
