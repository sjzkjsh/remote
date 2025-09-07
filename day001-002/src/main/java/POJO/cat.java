package POJO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data//lombok注解，自动生成getter和setter方法
@NoArgsConstructor//lombok注解，自动生成无参构造方法
public class cat {
    private String name;
    private int age;

    private String test;

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
