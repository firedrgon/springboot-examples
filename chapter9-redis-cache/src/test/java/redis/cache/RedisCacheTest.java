package redis.cache;

import com.hong.domain.City;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * Created by sheny on 2017/12/9.
 */
@SpringBootTest
public class RedisCacheTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test1() {
        ValueOperations<String, City> valueOperations = redisTemplate.opsForValue();
        City city = valueOperations.get("city");
        Boolean hasKey = redisTemplate.hasKey("city");
    }
}
