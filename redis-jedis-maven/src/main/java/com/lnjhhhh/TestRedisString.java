package com.lnjhhhh;

import redis.clients.jedis.Jedis;

/**
 * @Author lnjhhhh
 * @CreateDate 2020/10/19 20:04
 * @Version 1.0
 * <p>
 * 测试操作Redis中的String类型数据
 */

public class TestRedisString {
    public static void main(String[] args) throws InterruptedException {
        Jedis jedis = new Jedis("192.168.56.100", 6379);
        System.out.println(jedis.set("name", "zhangsan"));
        System.out.println(jedis.setex("age", 10, "20"));
        System.out.println(jedis.get("age"));
        Thread.sleep(10000);
        System.out.println(jedis.get("age"));
    }
}
