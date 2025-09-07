package config;


import POJO.Dog;
import POJO.Sheep;
import POJO.cat;
import POJO.user;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@EnableConfigurationProperties(Sheep.class)//
//开启配置文件属性自动封装功能，默认从全局配置文件中获取属性,
// 导入第三方的配置类，springboot默认只扫描主程序文件中的包，需要导入第三方的配置类，才能扫描到第三方的包
//就算使用@Commponent以及@Configuration注解也无法扫描到第三方的包，需要使用EnableConfigurationProperties注解来开启配置文件属性自动封装功能
//@EnableConfigurationProperties相当于import和configuration的结合体，同时可以导入第三方的配置类

//@ConfigurationProperties(prefix = "Sheep")//配置文件中属性前缀为Sheep的属性会自动封装到Sheep对象中,
// 获取以Sheep为前缀的属性在类上使用，会将类中的属性封装到配置文件中
//@EnableAutoConfiguration

//@Import(user.class)//给容器导入指定组件，导入的组件默认是单实例的
@Configuration//代替spring中的bean.xml文件

public class TestUser_config {

    @Bean//代替spring中的bean标签，代替set，属性注入
    //@Bean("haha")组件在容器中的id，默认为方法名可以通过@Bean("haha")来修改组件的id
    public user user(){
        var user = new user();
        user.setName("zhangsan");
        user.setAge(18);
        return user;
    }
    @ConditionalOnClass(name = "org.springframework.boot")//判断容器中是否有指定的类，如果有，就会执行该方法
    @Bean
    public Dog dog001(){
        var dog = new Dog();
        dog.setName("wangcai");
        dog.setAge(18);
        return dog;
    }
    @ConditionalOnMissingClass(value = "org.springframework.boot")//判断容器中是否有指定的类，如果没有，就会执行该方法
    @Bean
    public cat cat001(){
        var cat = new cat();
        cat.setName("mimi");
        cat.setAge(18);
        return cat;
    }
    @ConditionalOnBean(value = Dog.class)//判断容器中是否有指定的组件，如果有，就会执行该方法
    @Bean
    public user user002(){
        var user = new user();
        user.setName("wangwu");
        user.setAge(18);
        return user;
    }
    @ConditionalOnMissingBean(cat.class)
    @Bean
    public user user003(){
        var user = new user();
        user.setName("lisi");
        user.setAge(18);
        return user;
    }
    @Bean
    public Sheep user004(){
       Sheep sheep = new Sheep();

        return sheep;
    }
    @Bean
   // @ConfigurationProperties(prefix = "sheep")可以在方法上使用，也可以在类上使用，但是在类上使用时
    public Sheep user005(){
        Sheep sheep = new Sheep();
        return sheep;
    }
}
