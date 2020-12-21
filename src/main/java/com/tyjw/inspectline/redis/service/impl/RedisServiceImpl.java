package com.tyjw.inspectline.redis.service.impl;

import com.tyjw.inspectline.redis.configuration.MyRedisTemplate;
import com.tyjw.inspectline.redis.service.RedisService;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Carey 2018年1月23日
 * <p>
 * redis 操作工具类
 *
 */
@Service("redisService")
public class RedisServiceImpl<K,V,HK> implements RedisService<K,V,HK> {

    @Resource
    private MyRedisTemplate<K, V> myRedisTemplate;

    public MyRedisTemplate<K, V> getInstance() {
        return myRedisTemplate;
    }

    /**
     * 判断key是否存在
     *
     * @param key
     * @return
     */
    @Override
    public boolean hasKey(K key) {
        return myRedisTemplate.hasKey(key);
    }


    /**
     * 设置 String 类型 key-value
     *
     * @param key
     * @param value
     */
    @Override
    public void set(K key, V value) {
        myRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * 获取 String 类型 key-value
     *
     * @param key
     * @return
     */
    @Override
    public V get(K key) {
        return myRedisTemplate.opsForValue().get(key);
    }

    /**
     * 设置 String 类型 key-value 并添加过期时间 (毫秒单位)
     *
     * @param key
     * @param value
     * @param time  过期时间,毫秒单位
     */
    @Override
    public void setForTimeMS(K key, V value, long time) {
        myRedisTemplate.opsForValue().set(key, value, time, TimeUnit.MILLISECONDS);
    }

    /**
     * 设置 String 类型 key-value 并添加过期时间 (分钟单位)
     *
     * @param key
     * @param value
     * @param time  过期时间,分钟单位
     */
    @Override
    public void setForTimeMIN(K key, V value, long time) {
        myRedisTemplate.opsForValue().set(key, value, time, TimeUnit.MINUTES);
    }

    /**
     * 设置 String 类型 key-value 并添加过期时间 (分钟单位)
     *
     * @param key
     * @param value
     * @param time  过期时间,分钟单位
     */
    @Override
    public void setForTimeCustom(K key, V value, long time, TimeUnit type) {
        myRedisTemplate.opsForValue().set(key, value, time, type);
    }

    /**
     * 如果 key 存在则覆盖,并返回旧值. 如果不存在,返回null 并添加
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public V getAndSet(K key, V value) {
        return myRedisTemplate.opsForValue().getAndSet(key, value);
    }

    /**
     * 批量添加 key-value (重复的键会覆盖)
     *
     * @param keyAndValue
     */
    @Override
    public void batchSet(Map<K, V> keyAndValue) {
        myRedisTemplate.opsForValue().multiSet(keyAndValue);
    }

    /**
     * 批量添加 key-value 只有在键不存在时,才添加 map 中只要有一个key存在,则全部不添加
     *
     * @param keyAndValue
     */
    @Override
    public void batchSetIfAbsent(Map<K, V> keyAndValue) {
        myRedisTemplate.opsForValue().multiSetIfAbsent(keyAndValue);
    }

    /**
     * 对一个 key-value 的值进行加减操作, 如果该 key 不存在 将创建一个key 并赋值该 number 如果 key 存在,但 value
     * 不是长整型 ,将报错
     *
     * @param key
     * @param number
     */
    @Override
    public Long increment(K key, long number) {
        return myRedisTemplate.opsForValue().increment(key, number);
    }

    /**
     * 对一个 key-value 的值进行加减操作, 如果该 key 不存在 将创建一个key 并赋值该 number 如果 key 存在,但 value 不是
     * 纯数字 ,将报错
     *
     * @param key
     * @param number
     */
    @Override
    public Double increment(K key, double number) {
        return myRedisTemplate.opsForValue().increment(key, number);
    }

    /**
     * 给一个指定的 key 值附加过期时间
     *
     * @param key
     * @param time
     * @param type
     * @return
     */
    @Override
    public boolean expire(K key, long time, TimeUnit type) {
        return myRedisTemplate.boundValueOps(key).expire(time, type);
    }

    /**
     * 移除指定key 的过期时间
     *
     * @param key
     * @return
     */
    @Override
    public boolean persist(K key) {
        return myRedisTemplate.boundValueOps(key).persist();
    }

    /**
     * 获取指定key 的过期时间
     *
     * @param key
     * @return
     */
    @Override
    public Long getExpire(K key) {
        return myRedisTemplate.boundValueOps(key).getExpire();
    }

    /**
     * 修改 key
     *
     * @param key
     * @return
     */
    @Override
    public void rename(K key, K newKey) {
        myRedisTemplate.boundValueOps(key).rename(newKey);
    }

    /**
     * 删除 key-value
     *
     * @param key
     * @return
     */
    @Override
    public void delete(K key) {
        myRedisTemplate.delete(key);
    }

    // hash操作

    /**
     * 添加 Hash 键值对
     *
     * @param key
     * @param hashKey
     * @param value
     */
    @Override
    public void put(K key, HK hashKey, V value) {
        myRedisTemplate.opsForHash().put(key, hashKey, value);
    }

    /**
     * 批量添加 hash 的 键值对 有则覆盖,没有则添加
     *
     * @param key
     * @param map
     */
    @Override
    public void putAll(K key, Map<HK, V> map) {
        myRedisTemplate.opsForHash().putAll(key, map);
    }

    /**
     * 添加 hash 键值对. 不存在的时候才添加
     *
     * @param key
     * @param hashKey
     * @param value
     * @return
     */
    @Override
    public boolean putIfAbsent(K key, HK hashKey, V value) {
        return myRedisTemplate.opsForHash().putIfAbsent(key, hashKey, value);
    }

    /**
     * 删除指定 hash 的 HashKey
     *
     * @param key
     * @param hashKeys
     * @return 删除成功的 数量
     */
    @Override
    public Long delete(K key, HK... hashKeys) {
        return myRedisTemplate.opsForHash().delete(key, hashKeys);
    }

    /**
     * 给指定 hash 的 hashkey 做增减操作
     *
     * @param key
     * @param hashKey
     * @param number
     * @return
     */
    @Override
    public Long increment(K key, HK hashKey, long number) {
        return myRedisTemplate.opsForHash().increment(key, hashKey, number);
    }

    /**
     * 给指定 hash 的 hashkey 做增减操作
     *
     * @param key
     * @param hashKey
     * @param number
     * @return
     */
    @Override
    public Double increment(K key, HK hashKey, Double number) {
        return myRedisTemplate.opsForHash().increment(key, hashKey, number);
    }

    /**
     * 获取指定 key 下的 hashkey
     *
     * @param key
     * @param hashKey
     * @return
     */
    @Override
    public Object getHashKey(K key, HK hashKey) {
        return myRedisTemplate.opsForHash().get(key, hashKey);
    }

    /**
     * 获取 key 下的 所有 hashkey 和 value
     *
     * @param key
     * @return
     */
    @Override
    public Map<Object, Object> getHashEntries(K key) {
        return myRedisTemplate.opsForHash().entries(key);
    }

    /**
     * 验证指定 key 下 有没有指定的 hashkey
     *
     * @param key
     * @param hashKey
     * @return
     */
    @Override
    public boolean hashKey(K key, HK hashKey) {
        return myRedisTemplate.opsForHash().hasKey(key, hashKey);
    }

    /**
     * 获取 key 下的 所有 hashkey 字段名
     *
     * @param key
     * @return
     */
    @Override
    public Set<Object> hashKeys(K key) {
        return myRedisTemplate.opsForHash().keys(key);
    }

    /**
     * 获取指定 hash 下面的 键值对 数量
     *
     * @param key
     * @return
     */
    @Override
    public Long hashSize(K key) {
        return myRedisTemplate.opsForHash().size(key);
    }

    // List 操作

    /**
     * 指定 list 从左入栈
     *
     * @param key
     * @return 当前队列的长度
     */
    @Override
    public Long leftPush(K key, V value) {
        return myRedisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 指定 list 从左出栈 如果列表没有元素,会堵塞到列表一直有元素或者超时为止
     *
     * @param key
     * @return 出栈的值
     */
    @Override
    public Object leftPop(K key) {
        return myRedisTemplate.opsForList().leftPop(key);
    }

    /**
     * 从左边依次入栈 导入顺序按照 Collection 顺序 如: a b c => c b a
     *
     * @param key
     * @param values
     * @return
     */
    @Override
    public Long leftPushAll(K key, Collection<V> values) {
        return myRedisTemplate.opsForList().leftPushAll(key, values);
    }

    /**
     * 指定 list 从右入栈
     *
     * @param key
     * @return 当前队列的长度
     */
    @Override
    public Long rightPush(K key, V value) {
        return myRedisTemplate.opsForList().rightPush(key, value);
    }

    /**
     * 指定 list 从右出栈 如果列表没有元素,会堵塞到列表一直有元素或者超时为止
     *
     * @param key
     * @return 出栈的值
     */
    @Override
    public V rightPop(K key) {
        return myRedisTemplate.opsForList().rightPop(key);
    }

    /**
     * 从右边依次入栈 导入顺序按照 Collection 顺序 如: a b c => a b c
     *
     * @param key
     * @param values
     * @return
     */
    @Override
    public Long rightPushAll(K key, Collection<V> values) {
        return myRedisTemplate.opsForList().rightPushAll(key, values);
    }

    /**
     * 根据下标获取值
     *
     * @param key
     * @param index
     * @return
     */
    @Override
    public V popIndex(K key, long index) {
        return myRedisTemplate.opsForList().index(key, index);
    }

    /**
     * 获取列表指定长度
     *
     * @param key
     * @param index
     * @return
     */
    @Override
    public Long listSize(K key) {
        return myRedisTemplate.opsForList().size(key);
    }

    /**
     * 获取列表 指定范围内的所有值
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public List<V> listRange(K key, long start, long end) {
        return myRedisTemplate.opsForList().range(key, start, end);
    }

    /**
     * 删除 key 中 值为 value 的 count 个数.
     *
     * @param key
     * @param count
     * @param value
     * @return 成功删除的个数
     */
    @Override
    public Long listRemove(K key, long count, V value) {
        return myRedisTemplate.opsForList().remove(key, count, value);
    }

    /**
     * 删除 列表 [start,end] 以外的所有元素
     *
     * @param key
     * @param start
     * @param end
     */
    @Override
    public void listTrim(K key, long start, long end) {
        myRedisTemplate.opsForList().trim(key, start, end);

    }

    /**
     * 将 key 右出栈,并左入栈到 key2
     *
     * @param key  右出栈的列表
     * @param key2 左入栈的列表
     * @return 操作的值
     */
    @Override
    public V rightPopAndLeftPush(K key, K key2) {
        return myRedisTemplate.opsForList().rightPopAndLeftPush(key, key2);

    }

    // set 操作 无序不重复集合

    /**
     * 添加 set 元素
     *
     * @param key
     * @param values
     * @return
     */
    @Override
    public Long add(K key, V... values) {
        return myRedisTemplate.opsForSet().add(key, values);
    }

    /**
     * 获取两个集合的差集
     *
     * @param key
     * @param key2
     * @return
     */
    @Override
    public Set<V> difference(K key, K otherkey) {
        return myRedisTemplate.opsForSet().difference(key, otherkey);
    }

    /**
     * 获取 key 和 集合 collections 中的 key 集合的差集
     *
     * @param key
     * @param collections
     * @return
     */
    @Override
    public Set<V> difference(K key, Collection<K> otherKeys) {
        return myRedisTemplate.opsForSet().difference(key, otherKeys);
    }

    /**
     * 将 key 与 otherkey 的差集 ,添加到新的 newKey 集合中
     *
     * @param key
     * @param otherkey
     * @param newKey
     * @return 返回差集的数量
     */
    @Override
    public Long differenceAndStore(K key, K otherkey, K newKey) {
        return myRedisTemplate.opsForSet().differenceAndStore(key, otherkey, newKey);
    }

    /**
     * 将 key 和 集合 collections 中的 key 集合的差集 添加到 newkey 集合中
     *
     * @param key
     * @param otherKeys
     * @param newKey
     * @return 返回差集的数量
     */
    @Override
    public Long differenceAndStore(K key, Collection<K> otherKeys, K newKey) {
        return myRedisTemplate.opsForSet().differenceAndStore(newKey, otherKeys, newKey);
    }

    /**
     * 删除一个或多个集合中的指定值
     *
     * @param key
     * @param values
     * @return 成功删除数量
     */
    @Override
    public Long remove(K key, V... values) {
        return myRedisTemplate.opsForSet().remove(key, values);
    }

    /**
     * 随机移除一个元素,并返回出来
     *
     * @param key
     * @return
     */
    @Override
    public V randomSetPop(K key) {
        return myRedisTemplate.opsForSet().pop(key);
    }

    /**
     * 随机获取一个元素
     *
     * @param key
     * @return
     */
    @Override
    public V randomSet(K key) {
        return myRedisTemplate.opsForSet().randomMember(key);
    }

    /**
     * 随机获取指定数量的元素,同一个元素可能会选中两次
     *
     * @param key
     * @param count
     * @return
     */
    @Override
    public List<V> randomSet(K key, long count) {
        return myRedisTemplate.opsForSet().randomMembers(key, count);
    }

    /**
     * 随机获取指定数量的元素,去重(同一个元素只能选择两一次)
     *
     * @param key
     * @param count
     * @return
     */
    @Override
    public Set<V> randomSetDistinct(K key, long count) {
        return myRedisTemplate.opsForSet().distinctRandomMembers(key, count);
    }

    /**
     * 将 key 中的 value 转入到 destKey 中
     *
     * @param key
     * @param value
     * @param destKey
     * @return 返回成功与否
     */
    @Override
    public boolean moveSet(K key, V value, K destKey) {
        return myRedisTemplate.opsForSet().move(key, value, destKey);
    }

    /**
     * 无序集合的大小
     *
     * @param key
     * @return
     */
    @Override
    public Long setSize(K key) {
        return myRedisTemplate.opsForSet().size(key);
    }

    /**
     * 判断 set 集合中 是否有 value
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public boolean isMember(K key, V value) {
        return myRedisTemplate.opsForSet().isMember(key, value);
    }

    /**
     * 返回 key 和 othere 的并集
     *
     * @param key
     * @param otherKey
     * @return
     */
    @Override
    public Set<V> unionSet(K key, K otherKey) {
        return myRedisTemplate.opsForSet().union(key, otherKey);
    }

    /**
     * 返回 key 和 otherKeys 的并集
     *
     * @param key
     * @param otherKey key 的集合
     * @return
     */
    @Override
    public Set<V> unionSet(K key, Collection<K> otherKeys) {
        return myRedisTemplate.opsForSet().union(key, otherKeys);
    }

    /**
     * 将 key 与 otherKey 的并集,保存到 destKey 中
     *
     * @param key
     * @param otherKey
     * @param destKey
     * @return destKey 数量
     */
    @Override
    public Long unionAndStoreSet(K key, K otherKey, K destKey) {
        return myRedisTemplate.opsForSet().unionAndStore(key, otherKey, destKey);
    }

    /**
     * 将 key 与 otherKey 的并集,保存到 destKey 中
     *
     * @param key
     * @param otherKeys
     * @param destKey
     * @return destKey 数量
     */
    @Override
    public Long unionAndStoreSet(K key, Collection<K> otherKeys, K destKey) {
        return myRedisTemplate.opsForSet().unionAndStore(key, otherKeys, destKey);
    }

    /**
     * 返回集合中所有元素
     *
     * @param key
     * @return
     */
    @Override
    public Set<V> members(K key) {
        return myRedisTemplate.opsForSet().members(key);
    }

    // Zset 根据 socre 排序 不重复 每个元素附加一个 socre double类型的属性(double 可以重复)

    /**
     * 添加 ZSet 元素
     *
     * @param key
     * @param value
     * @param score
     */
    @Override
    public boolean add(K key, V value, double score) {
        return myRedisTemplate.opsForZSet().add(key, value, score);
    }

    /**
     * 批量添加 Zset <br>
     * Set<TypedTuple<V>> tuples = new HashSet<>();<br>
     * TypedTuple<Object> objectTypedTuple1 = new
     * DefaultTypedTuple<Object>("zset-5",9.6);<br>
     * tuples.add(objectTypedTuple1);
     *
     * @param key
     * @param tuples
     * @return
     */
    @Override
    public Long batchAddZset(K key, Set<TypedTuple<V>> tuples) {
        return myRedisTemplate.opsForZSet().add(key, tuples);
    }

    /**
     * Zset 删除一个或多个元素
     *
     * @param key
     * @param values
     * @return
     */
    @Override
    public Long removeZset(K key, V... values) {
        return myRedisTemplate.opsForZSet().remove(key, values);
    }

    /**
     * 对指定的 zset 的 value 值 , socre 属性做增减操作
     *
     * @param key
     * @param value
     * @param score
     * @return
     */
    @Override
    public Double incrementScore(K key, V value, double score) {
        return myRedisTemplate.opsForZSet().incrementScore(key, value, score);
    }

    /**
     * 获取 key 中指定 value 的排名(从0开始,从小到大排序)
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public Long rank(K key, V value) {
        return myRedisTemplate.opsForZSet().rank(key, value);
    }

    /**
     * 获取 key 中指定 value 的排名(从0开始,从大到小排序)
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public Long reverseRank(K key, V value) {
        return myRedisTemplate.opsForZSet().reverseRank(key, value);
    }

    /**
     * 获取索引区间内的排序结果集合(从0开始,从小到大,带上分数)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set<TypedTuple<V>> rangeWithScores(K key, long start, long end) {
        return myRedisTemplate.opsForZSet().rangeWithScores(key, start, end);
    }

    /**
     * 获取索引区间内的排序结果集合(从0开始,从小到大,只有列名)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set<V> range(K key, long start, long end) {
        return myRedisTemplate.opsForZSet().range(key, start, end);
    }

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从小到大,只有列名)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public Set<V> rangeByScore(K key, double min, double max) {
        return myRedisTemplate.opsForZSet().rangeByScore(key, min, max);
    }

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从小到大,集合带分数)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public Set<TypedTuple<V>> rangeByScoreWithScores(K key, double min, double max) {
        return myRedisTemplate.opsForZSet().rangeByScoreWithScores(key, min, max);
    }

    /**
     * 返回 分数范围内 指定 count 数量的元素集合, 并且从 offset 下标开始(从小到大,不带分数的集合)
     *
     * @param key
     * @param min
     * @param max
     * @param offset 从指定下标开始
     * @param count  输出指定元素数量
     * @return
     */
    @Override
    public Set<V> rangeByScore(K key, double min, double max, long offset, long count) {
        return myRedisTemplate.opsForZSet().rangeByScore(key, min, max, offset, count);
    }

    /**
     * 返回 分数范围内 指定 count 数量的元素集合, 并且从 offset 下标开始(从小到大,带分数的集合)
     *
     * @param key
     * @param min
     * @param max
     * @param offset 从指定下标开始
     * @param count  输出指定元素数量
     * @return
     */
    @Override
    public Set<TypedTuple<V>> rangeByScoreWithScores(K key, double min, double max, long offset, long count) {
        return myRedisTemplate.opsForZSet().rangeByScoreWithScores(key, min, max, offset, count);
    }

    /**
     * 获取索引区间内的排序结果集合(从0开始,从大到小,只有列名)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set<V> reverseRange(K key, long start, long end) {
        return myRedisTemplate.opsForZSet().reverseRange(key, start, end);
    }

    /**
     * 获取索引区间内的排序结果集合(从0开始,从大到小,带上分数)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Set<TypedTuple<V>> reverseRangeWithScores(K key, long start, long end) {
        return myRedisTemplate.opsForZSet().reverseRangeWithScores(key, start, end);
    }

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从大到小,集合不带分数)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public Set<V> reverseRangeByScore(K key, double min, double max) {
        return myRedisTemplate.opsForZSet().reverseRangeByScore(key, min, max);
    }

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从大到小,集合带分数)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public Set<TypedTuple<V>> reverseRangeByScoreWithScores(K key, double min, double max) {
        return myRedisTemplate.opsForZSet().reverseRangeByScoreWithScores(key, min, max);
    }

    /**
     * 返回 分数范围内 指定 count 数量的元素集合, 并且从 offset 下标开始(从大到小,不带分数的集合)
     *
     * @param key
     * @param min
     * @param max
     * @param offset 从指定下标开始
     * @param count  输出指定元素数量
     * @return
     */
    @Override
    public Set<V> reverseRangeByScore(K key, double min, double max, long offset, long count) {
        return myRedisTemplate.opsForZSet().reverseRangeByScore(key, min, max, offset, count);
    }

    /**
     * 返回 分数范围内 指定 count 数量的元素集合, 并且从 offset 下标开始(从大到小,带分数的集合)
     *
     * @param key
     * @param min
     * @param max
     * @param offset 从指定下标开始
     * @param count  输出指定元素数量
     * @return
     */
    @Override
    public Set<TypedTuple<V>> reverseRangeByScoreWithScores(K key, double min, double max, long offset,
                                                                 long count) {
        return myRedisTemplate.opsForZSet().reverseRangeByScoreWithScores(key, min, max, offset, count);
    }

    /**
     * 返回指定分数区间 [min,max] 的元素个数
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public long countZSet(K key, double min, double max) {
        return myRedisTemplate.opsForZSet().count(key, min, max);
    }

    /**
     * 返回 zset 集合数量
     *
     * @param key
     * @return
     */
    @Override
    public long sizeZset(K key) {
        return myRedisTemplate.opsForZSet().size(key);
    }

    /**
     * 获取指定成员的 score 值
     *
     * @param key
     * @param value
     * @return
     */
    @Override
    public Double score(K key, V value) {
        return myRedisTemplate.opsForZSet().score(key, value);
    }

    /**
     * 删除指定索引位置的成员,其中成员分数按( 从小到大 )
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    @Override
    public Long removeRange(K key, long start, long end) {
        return myRedisTemplate.opsForZSet().removeRange(key, start, end);
    }

    /**
     * 删除指定 分数范围 内的成员 [main,max],其中成员分数按( 从小到大 )
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    @Override
    public Long removeRangeByScore(K key, double min, double max) {
        return myRedisTemplate.opsForZSet().removeRangeByScore(key, min, max);
    }

    /**
     * key 和 other 两个集合的并集,保存在 destKey 集合中, 列名相同的 score 相加
     *
     * @param key
     * @param otherKey
     * @param destKey
     * @return
     */
    @Override
    public Long unionAndStoreZset(K key, K otherKey, K destKey) {
        return myRedisTemplate.opsForZSet().unionAndStore(key, otherKey, destKey);
    }



    /**
     * key 和 otherKeys 多个集合的并集,保存在 destKey 集合中, 列名相同的 score 相加
     *
     * @param key
     * @param otherKeys
     * @param destKey
     * @return
     */
    @Override
    public Long unionAndStoreZset(K key, Collection<K> otherKeys, K destKey) {
        return myRedisTemplate.opsForZSet().unionAndStore(key, otherKeys, destKey);
    }

    /**
     * key 和 otherKey 两个集合的交集,保存在 destKey 集合中
     *
     * @param key
     * @param otherKey
     * @param destKey
     * @return
     */
    @Override
    public Long intersectAndStore(K key, K otherKey, K destKey) {
        return myRedisTemplate.opsForZSet().intersectAndStore(key, otherKey, destKey);
    }

    /**
     * key 和 otherKeys 多个集合的交集,保存在 destKey 集合中
     *
     * @param key
     * @param otherKeys
     * @param destKey
     * @return
     */
    @Override
    public Long intersectAndStore(K key, Collection<K> otherKeys, K destKey) {
        return myRedisTemplate.opsForZSet().intersectAndStore(key, otherKeys, destKey);
    }


    /**
     * 添加 Hash 键值对 Object
     *
     * @param key
     * @param hashKey
     * @param value
     */
    @Override
    public void hmSet(K key, HK hashKey, V value) {
        myRedisTemplate.opsForHash().put(key, hashKey, value);
    }


    public V hmGet(K key, HK hashKey) {
        HashOperations<K, HK, V> hash = myRedisTemplate.opsForHash();
        return hash.get(key, hashKey);
    }

    /**
     * 删除hash键
     *
     * @param key
     * @param hashKey
     */
    @Override
    public void hmDeleteKey(K key, HK hashKey) {
        HashOperations<K, HK, V> hash = myRedisTemplate.opsForHash();
        hash.delete(key, hashKey);
    }

   /* public Object getSession(String userName) {
        Object session = (Object) hmGet("Constants.FRAS_SESSION_KEY", userName);
        return session;
    }

    public void setSession(String userName, Object session, long dayTime) {
        hmSet("Constants.FRAS_SESSION_KEY", userName, session);
        expire("Constants.FRAS_SESSION_KEY" + ":" + userName, dayTime, TimeUnit.DAYS);
    }

    public void hmClear(K key, Object hashKey) {
        HashOperations<Object, Object, Object> hash = redisTemplate.opsForHash();
        hash.delete(key, hashKey);
    }

    public void clearSession(String username) {
        hmClear("Constants.FRAS_SESSION_KEY", username);
    }
*/
}