package com.lnjhhhh;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import java.util.List;

/**
 * @Author lnjhhhh
 * @CreateDate 2020/10/19 20:18
 * @Version 1.0
 */

public class TestRedisTransaction {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.56.100", 6379);
        Transaction multi = jedis.multi();
        Response<String> set = multi.set("name", "zhangsan");
        System.out.println(set);
        multi.set("age", "20");
        multi.set("gender", "man");
        //执行事物
        List<Object> exec = multi.exec();
        System.out.println(exec);
        multi.close();
        jedis.close();
    }

}
