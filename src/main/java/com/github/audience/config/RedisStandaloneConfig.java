package com.github.audience.config;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author audience7510
 * @Date 2022/7/12
 * @ClassName RedisConfig
 * @Description 单机版配置，使用时放开注释，并在application.yml开启单机
 * @Version 1.0
 */
//@Configuration
//@EnableAutoConfiguration
//public class RedisStandaloneConfig {
//
//    @Value("${spring.redis.host}")
//    private String host;
//
//    @Value("${spring.redis.port}")
//    private String port;
//
//    @Value("${spring.redis.password}")
//    private String password;
//
//    @Value("${spring.redis.jedis.pool.max-active}")
//    private int maxTotal;
//
//    @Value("${spring.redis.jedis.pool.max-idle}")
//    private int maxIdle;
//
//    @Value("${spring.redis.jedis.pool.min-idle}")
//    private int minIdle;
//
//    @Value("${spring.redis.jedis.pool.max-wait}")
//    private int maxWait;
//
//    @Bean
//    public RedisStandaloneConfiguration redisSentinelConfiguration(){
//        RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
//        configuration.setHostName(host);
//        configuration.setPort(Integer.parseInt(port));
//        configuration.setPassword(password);
//        return configuration;
//    }
//
//    /**
//     * @Author audience7510
//     * @Date 2022/7/12
//     * @Param []
//     * @return JedisPoolConfig
//     * @Description jedis连接池实例化
//    **/
//    @Bean
//    public JedisPoolConfig jedisPoolConfig(){
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(maxIdle);
//        jedisPoolConfig.setMaxTotal(maxTotal);
//        jedisPoolConfig.setMinIdle(minIdle);
//        jedisPoolConfig.setMaxWaitMillis(maxWait);
//        jedisPoolConfig.setTestOnBorrow(true);
//        return jedisPoolConfig;
//    }
//
//    /**
//     * @Author audience7510
//     * @Date 2022/7/12
//     * @Param [jedisPoolConfig, sentinelConfig]
//     * @return JedisConnectionFactory
//     * @Description jedis连接工厂实例化，需要使用到哨兵和jedis连接池实例化好的bean
//    **/
//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig jedisPoolConfig,RedisStandaloneConfiguration standaloneConfiguration) {
//        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(standaloneConfiguration);
//        return jedisConnectionFactory;
//    }
//
//    /**
//     * @Author audience7510
//     * @Date 2022/7/12
//     * @Param [jedisConnectionFactory]
//     * @return RedisTemplate<String, Object>
//     * @Description 初始化RedisTemplate，需要使用到jedis工厂
//    **/
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory) {
//        // 定义redis模板
//        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//        redisTemplate.setConnectionFactory(jedisConnectionFactory);
//
//        // 创建序列号对象
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
////        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
//        GenericFastJsonRedisSerializer genericFastJsonRedisSerializer = new GenericFastJsonRedisSerializer();
//        // 设置序列化器
//        redisTemplate.setKeySerializer(stringRedisSerializer);
//        redisTemplate.setValueSerializer(genericFastJsonRedisSerializer);
//        redisTemplate.setHashKeySerializer(stringRedisSerializer);
//        redisTemplate.setHashValueSerializer(genericFastJsonRedisSerializer);
//        redisTemplate.afterPropertiesSet();
//        return redisTemplate;
//    }
//}
