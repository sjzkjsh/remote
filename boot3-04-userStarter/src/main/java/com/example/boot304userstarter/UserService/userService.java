package com.example.boot304userstarter.UserService;

import com.example.boot304userstarter.POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    User user;
    public void add(User user){
        System.out.println(user.getName()+"用户登陆成功");
    }

}
