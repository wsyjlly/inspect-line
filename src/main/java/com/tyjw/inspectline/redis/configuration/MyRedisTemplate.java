package com.tyjw.inspectline.redis.configuration;

import org.springframework.data.redis.core.RedisTemplate;

/**
 * 自定义序列化反序列化 RedisTemplate
 * @param <K>
 * @param <V>
 */
public class MyRedisTemplate<K, V> extends RedisTemplate<K, V> {
}
