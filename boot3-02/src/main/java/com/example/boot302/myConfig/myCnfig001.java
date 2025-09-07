package com.example.boot302.myConfig;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;

public class myCnfig001 implements WebMvcConfigurer {
    @Override// 配置静态资源路径
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);// 继承默认配置，保存boot原有的配置
        //自己设置的静态资源路径
        //表示：如果请求的路径以/static/开头，就去classpath:/static/目录下找资源
        //设置缓存时间为1180
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/a/","classpath:/b/")
                .setCacheControl(CacheControl.maxAge(1180,TimeUnit.SECONDS));

    }


}
