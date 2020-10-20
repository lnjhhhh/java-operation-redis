package com.lnjhhhh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;

import java.util.List;

@SpringBootTest
public class RedisSpringBootApplicationTests {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;


    @Test
    void contextLoads() {
        BoundValueOperations<Object, Object> name = redisTemplate.boundValueOps("name");
        BoundStreamOperations<Object, Object, Object> age = redisTemplate.boundStreamOps("age");
        redisTemplate.multi();
        redisTemplate.exec();
        ValueOperations<Object, Object> valueOperations = redisTemplate.opsForValue();
    }

    @Test
    public void testBoundXxxOps() {
        //获取一个绑定数据类型为String，并且key为name的操作对象
        BoundValueOperations<Object, Object> name = redisTemplate.boundValueOps("name");
        //因为上面已经设置了key为name，所以这里只需要传递值即可
        name.set("zhangsan");
        /*
            boundValueOps(T key)：获取一个操作String类型的绑定key对象
            boundGeoOps(T key)：获取一个操作Geo类型的绑定key对象
            boundHashOps(T key)：获取一个操作Hash类型的绑定key对象
            boundListOps(T key)：获取一个操作List类型的绑定key对象
            boundSetOps(T key)：获取一个操作Set类型的绑定key对象
            boundZSetOps(T key)：获取一个操作ZSet类型的绑定Key对象
         */
    }

    @Test
    public void testXxxOps() {
        ValueOperations<Object, Object> value = redisTemplate.opsForValue();
        value.set("name", "lisi");
        /*
            opsForValue()：获取一个操作String类型的对象
            opsForGeo()：获取一个操作Geo类型的对象
            opsForHash()：获取一个操作Hash类型的对象
            opsForList()：获取一个操作List类型的对象
            opsForSet()：获取一个操作Set类型的对象
            opsForZSet()：获取一个操作ZSet类型的对象
            opsForHyperLogLog()：获取一个操作HyperLogLog类型的对象
         */
    }

}
