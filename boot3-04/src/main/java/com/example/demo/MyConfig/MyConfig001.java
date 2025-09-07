package com.example.demo.MyConfig;

import com.example.demo.POJO.cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


//或者在类上添加@Profile("dev")表明dev环境下MyConfig001类生效
@Configuration//表明这是一个配置类
public class MyConfig001 {

    @Profile("dev")//表明dev环境下生效
    @Bean
    cat cat(){
        return new cat();
    }


}
