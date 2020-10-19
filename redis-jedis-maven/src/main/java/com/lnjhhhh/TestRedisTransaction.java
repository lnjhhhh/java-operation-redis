package com.lnjhhhh;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * @Author lnjhhhh
 * @CreateDate 2020/10/19 20:18
 * @Version 1.0
 */

public class TestRedisTransaction {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.56.100", 6379);
        Transaction multi = jedis.multi();

    }

}
