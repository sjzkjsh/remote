package Controller;

import POJO.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/redis")
public class RedisController {
    @Autowired
    StringRedisTemplate stringredisTemplate;
//如果要操作redis直接注入StringRedisTemplate即可
    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String hello() {
        //表示每访问和hello方法，hello的次数就会加1

        //redis的常见的五大数据类型
        //String、List、Set、Hash、ZSet
        //操作String
        //redisTemplate.opsForValue();
        //操作List
        //redisTemplate.opsForList();
        //操作Set
        //redisTemplate.opsForSet();
        //操作Hash
        //redisTemplate.opsForHash();
        //操作ZSet
        //redisTemplate.opsForZSet();
        Long hello = stringredisTemplate.opsForValue().increment("hello");
        return "【”+hello+“】次数";
    }
    @GetMapping("/hello2/save")
    public String hello2() {
        User user = new User("张三", "123456");
        //如果返回的是对象的话，需要序列化，直接导入redistemplate即可
        redisTemplate.opsForValue().set("User", user);
        return "ok";
    }
    @GetMapping("/hello2/get")
    public String hello3() {
        User user =(User) redisTemplate.opsForValue().get("User");
        return user.toString();
    }

}
