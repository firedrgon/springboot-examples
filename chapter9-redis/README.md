# spring boot 整合redis 

*  本例测试时需检查application.properties redis 连接信息是否正常。

##总结
* Spring boot并不支持直接使用,需要我们实现RedisSerializer<T>接口对传入的对象进行序列号和反序列化
* 使用Redis，private RedisTemplate redisTemplate;
* 在spring boot使用测试@SpringBootTest,@RunWith(SpringJunit4ClassRunner.class)
* StringRedisTemplate.opsForValue.set