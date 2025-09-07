package com.example.boot304userstarter;


import com.example.boot304userstarter.Controller.UserController;
import com.example.boot304userstarter.POJO.User;
import com.example.boot304userstarter.UserService.userService;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.AsyncConfigurationSelector;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({userService.class, UserController.class, User.class})
public @interface EnableUserStarter {
}
