package com.example.day001002;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloTest002 {
    Logger logger = LoggerFactory.getLogger(helloTest002.class);
    @RequestMapping("/h")
    public String test(){
        //打印日志
        logger.info("哈哈哈哈");
//       如果写了@slf4j注解直接写log.info("哈哈哈哈");就可以
        return "hello";
    }
}
