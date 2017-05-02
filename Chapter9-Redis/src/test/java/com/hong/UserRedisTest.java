package com.hong;


import com.hong.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author
 * @version v1.1
 * @ClassName: UserRedisTest
 * @Description: (redis测试存储对象)
 * @date 2017/5/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserRedisTest {

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    @Test
    public void test(){
        // 保存对象
        User user = new User("zhangsan", 20);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        user = new User("lisi", 30);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        user = new User("wangwu", 40);
        redisTemplate.opsForValue().set(user.getUsername(), user);
        Assert.assertEquals(20, redisTemplate.opsForValue().get("zhangsan").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("lisi").getAge().longValue());
        Assert.assertEquals(40, redisTemplate.opsForValue().get("wangwu").getAge().longValue());

    }

}
