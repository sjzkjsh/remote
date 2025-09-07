package com.example.day001002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = "com.example")//自定义扫描包路径
//@SpringBootApplication由@SpringBootConfiguration、@EnableAutoConfiguration、@ComponentScan组成


//@SpringBootConfiguration：是 Spring Boot 中的注解，它的本质上是一个组合注解，
// 由@Configuration、@EnableAutoConfiguration和@ComponentScan组成。
// 这意味着使用@SpringBootConfiguration标注的类，既具备配置类的功能（因为包含了@Configuration），
// 又开启了 Spring Boot 的自动配置功能（@EnableAutoConfiguration），
// 还能扫描指定包及其子包下的组件（@ComponentScan，如果不指定扫描范围，默认扫描标注该注解的类所在包及其子包 ）。

//@EnableAutoConfiguration：是SpringBoot中开启自动配置的核心
//是由@Import({AutoConfigurationImportSelector.class})提供功能：批量给容器导入组件
//springboot会默认加载142个组件，来自spring-boot-autoconfigure包下的META-INF中指定的所有组件XXXAutoConfiguration
//XXXAutoConfiguration为自动配置类,每个自动配置类可能都有@EnableAutoConfigurationproperties注解，
//@EnableAutoConfigurationproperties(xxx.class)注解用来将配置文件中以xxx为前缀的属性封装到xxxproperties属性类中，

public class Day001002Application {

	public static void main(String[] args) {
		SpringApplication.run(Day001002Application.class, args);
	}

}
