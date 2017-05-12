package com.hong;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import redis.clients.jedis.JedisCluster;

/**
 * Created by hong on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes ={Application.class})
@WebAppConfiguration
public class TestRedisCluster {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private JedisCluster jedisCluster;

    @Autowired
    private RedisTemplate redisTemplate;


    @Test
    public void test(){
        jedisCluster.set("test_jedis_cluster","123456");
        Assert.assertEquals("123456",jedisCluster.get("test_jedis_cluster"));

        String value = (String) redisTemplate.opsForValue().get("test_jedis_cluster");
        logger.info(value);
    }
}
