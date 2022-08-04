package com.example.redis.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {
    @Value("${redis-timeout}")
    private Long redisTimeout;
    //缓存管理器
    @Bean
    public CacheManager cacheManager(RedisTemplate redisTemplate){
        RedisCacheManager cacheManager=new RedisCacheManager(redisTemplate);
        //设置缓存过期时间
        cacheManager.setDefaultExpiration(redisTimeout);;
    }
}
