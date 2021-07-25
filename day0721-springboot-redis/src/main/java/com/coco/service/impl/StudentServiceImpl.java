package com.coco.service.impl;

import com.coco.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author cocoLin
 * @create 2021-07-21 18:19
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void put(String key, String value) {
            redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String get(String key) {
        String value = (String) redisTemplate.opsForValue().get(key);
        return value;
    }
}
