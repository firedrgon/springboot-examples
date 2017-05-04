package com.hong.service.impl;

import com.hong.domain.City;
import com.hong.mapper.CityMapper;
import com.hong.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by hong on 2017/5/4.
 */
@Service
public class CityServiceImpl implements CityService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    private final String KEY_PREFIX = "city_";


    /**
     * 获取城市逻辑：
     * 如果缓存存在，从缓存中获取城市信息
     * 如果缓存不存在，从 DB 中获取城市信息，然后插入缓存
     */
    @Override
    public City findOneCity(Integer id) {
        ValueOperations<String, City> valueOperations = redisTemplate.opsForValue();

        //缓存存在
        String key =KEY_PREFIX+id;
        boolean hasKey =redisTemplate.hasKey(key);
        if(hasKey){
            City city =valueOperations.get(key);
            logger.info("CityServiceImpl.findOneCity() : 从缓存中获取了城市 >> " + city.toString());
            return  city;
        }

        //从mysql 数据库中获取数据
        City city= cityMapper.selectByPrimaryKey(id);

        //存入缓存中.
        valueOperations.set(key,city,10, TimeUnit.SECONDS);
        logger.info("CityServiceImpl.findOneCity() : 城市加入了缓存 >> " + city.toString());
        return city;
    }

}
