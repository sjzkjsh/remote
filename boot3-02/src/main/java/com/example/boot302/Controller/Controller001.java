package com.example.boot302.Controller;

import com.example.boot302.POJO.person;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller001 {



    @GetMapping("/")
    public person hello(){
       person person=new person();
       person.setName("zhangsan");
       person.setAge(12);
       person.setSex("男");
        return person;
    }
    @GetMapping("/hello")
    public String hello2(){
        return "";
    }

}
