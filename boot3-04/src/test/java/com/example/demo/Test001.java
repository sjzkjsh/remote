package com.example.demo;

import com.example.demo.POJO.Dog;
import com.example.demo.POJO.cat;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test001 {

    @Autowired
    Dog dog;
    cat cat;
    @DisplayName("测试1")//表示测试方法的名称
    @Test
    public void test001() {
        System.out.println("Hello World!");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each test");
    }

}
