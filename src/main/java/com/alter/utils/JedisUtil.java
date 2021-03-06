package com.alter.utils;

import org.apache.commons.lang.StringUtils;

import redis.clients.jedis.Jedis;

/**
 * @author liaoqiqi
 * @version 2014-6-17
 */
public class JedisUtil {

    public static Jedis createJedis() {
        Jedis jedis = new Jedis("192.168.198.130");
        return jedis;
    }

    public static Jedis createJedis(String host, int port) {
        Jedis jedis = new Jedis(host, port);

        return jedis;
    }

    public static Jedis createJedis(String host, int port, String password) {
        Jedis jedis = new Jedis(host, port);

        if (!StringUtils.isNotBlank(password)) {
            jedis.auth(password);
        }

        return jedis;
    }
}
