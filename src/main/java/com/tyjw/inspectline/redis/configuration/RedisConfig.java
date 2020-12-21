package com.tyjw.inspectline.redis.configuration;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@SuppressWarnings("ALL")
@Configuration
@EnableCaching
public class RedisConfig<K,V> extends CachingConfigurerSupport {

    private static final StringRedisSerializer STRING_SERIALIZER = new StringRedisSerializer();
    private static final Jackson2JsonRedisSerializer VALUE_SERIALIZER = new Jackson2JsonRedisSerializer<>(Object.class);

    @Bean
    public MyRedisTemplate<K, V> redisTemplate( RedisConnectionFactory redisConnectionFactory) {
        MyRedisTemplate<K, V> myRedisTemplate = new MyRedisTemplate<K, V>();
        myRedisTemplate.setConnectionFactory(redisConnectionFactory);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        //key序列化
        myRedisTemplate.setKeySerializer(STRING_SERIALIZER); // key的序列化类型
        //value序列化
        VALUE_SERIALIZER.setObjectMapper(objectMapper);
        myRedisTemplate.setValueSerializer(VALUE_SERIALIZER); // value的序列化类型
        //hashKey序列化
        myRedisTemplate.setHashKeySerializer(STRING_SERIALIZER);
        //hashValue序列化
        myRedisTemplate.setHashValueSerializer(VALUE_SERIALIZER);
        return myRedisTemplate;
    }
}
