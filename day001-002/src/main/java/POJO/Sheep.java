package POJO;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "sheep")//配置文件中属性前缀为Sheep的属性会自动封装到Sheep对象中,
// 获取以sheep为前缀的属性
//value=""不能与类名相同，否则会报错
public class Sheep {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
