package com.example.demo;

import com.example.boot304userstarter.EnableUserStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableUserStarter//开启自定义starter
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        //下面是上面的底层实现，自定义springApplication的底层设置
        SpringApplication application = new SpringApplication(DemoApplication.class);
        //也可以根据application来配置一些参数，但是在配置文件的配置优先级高于代码的配置（现在的配置）
//        application.setBanner();等等
        application.run(args);


        //还可以通过流式方法来配置
        new SpringApplicationBuilder()
                .main(DemoApplication.class)
                .run(args);

    }

}
