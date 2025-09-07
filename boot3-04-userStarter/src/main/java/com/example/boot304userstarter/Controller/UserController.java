package com.example.boot304userstarter.Controller;

import com.example.boot304userstarter.POJO.User;
import com.example.boot304userstarter.UserService.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    userService userservice;
    @RequestMapping("/user")
    public String user(){
        userservice.add(new User("zhangsan","123456"));

        return "user";
    }
}
