package com.lnjhhhh;

import redis.clients.jedis.Jedis;

/**
 * @Author lnjhhhh
 * @CreateDate 2020/10/19 19:53
 * @Version 1.0
 */

public class TestRedisConnection {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.56.100", 6379);
        System.out.println(jedis.ping());
    }

}
