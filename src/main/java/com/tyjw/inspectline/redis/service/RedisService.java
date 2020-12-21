package com.tyjw.inspectline.redis.service;

import org.springframework.data.redis.core.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName：RedisService
 * @Description：redis操作Dao:依赖spring-data-redis1.8.3,jedis2.9.0
 */

public interface RedisService<K,V,HK> {


    /**
     * 判断key是否存在
     *
     * @param key
     * @return
     */
    public boolean hasKey(K key);

    /**
     * 设置 String 类型 key-value
     *
     * @param key
     * @param value
     */
    public void set(K key, V value);

    /**
     * 获取 String 类型 key-value
     *
     * @param key
     * @return
     */
    public V get(K key);

    /**
     * 设置 String 类型 key-value 并添加过期时间 (毫秒单位)
     *
     * @param key
     * @param value
     * @param time  过期时间,毫秒单位
     */
    public void setForTimeMS(K key, V value, long time);

    /**
     * 设置 String 类型 key-value 并添加过期时间 (分钟单位)
     *
     * @param key
     * @param value
     * @param time  过期时间,分钟单位
     */
    public void setForTimeMIN(K key, V value, long time);

    /**
     * 设置 String 类型 key-value 并添加过期时间 (分钟单位)
     *
     * @param key
     * @param value
     * @param time  过期时间,分钟单位
     */
    public void setForTimeCustom(K key, V value, long time, TimeUnit type);

    /**
     * 如果 key 存在则覆盖,并返回旧值. 如果不存在,返回null 并添加
     *
     * @param key
     * @param value
     * @return
     */
    public V getAndSet(K key, V value);

    /**
     * 批量添加 key-value (重复的键会覆盖)
     *
     * @param keyAndValue
     */
    public void batchSet(Map<K, V> keyAndValue);

    /**
     * 批量添加 key-value 只有在键不存在时,才添加 map 中只要有一个key存在,则全部不添加
     *
     * @param keyAndValue
     */
    public void batchSetIfAbsent(Map<K, V> keyAndValue);

    /**
     * 对一个 key-value 的值进行加减操作, 如果该 key 不存在 将创建一个key 并赋值该 number 如果 key 存在,但 value
     * 不是长整型 ,将报错
     *
     * @param key
     * @param number
     */
    public Long increment(K key, long number);

    /**
     * 对一个 key-value 的值进行加减操作, 如果该 key 不存在 将创建一个key 并赋值该 number 如果 key 存在,但 value 不是
     * 纯数字 ,将报错
     *
     * @param key
     * @param number
     */
    public Double increment(K key, double number);

    /**
     * 给一个指定的 key 值附加过期时间
     *
     * @param key
     * @param time
     * @param type
     * @return
     */
    public boolean expire(K key, long time, TimeUnit type);

    /**
     * 移除指定key 的过期时间
     *
     * @param key
     * @return
     */
    public boolean persist(K key);

    /**
     * 获取指定key 的过期时间
     *
     * @param key
     * @return
     */
    public Long getExpire(K key);

    /**
     * 修改 key
     *
     * @param key
     * @return
     */
    public void rename(K key, K newKey);

    /**
     * 删除 key-value
     *
     * @param key
     * @return
     */
    public void delete(K key);

    // -------------------------hash操作-----------------------------------

    /**
     * 添加 Hash 键值对
     *
     * @param key
     * @param hashKey
     * @param value
     */
    public void put(K key, HK hashKey, V value);

    /**
     * 批量添加 hash 的 键值对 有则覆盖,没有则添加
     *
     * @param key
     * @param map
     */
    public void putAll(K key, Map<HK, V> map);

    /**
     * 添加 hash 键值对. 不存在的时候才添加
     *
     * @param key
     * @param hashKey
     * @param value
     * @return
     */
    public boolean putIfAbsent(K key, HK hashKey, V value);

    /**
     * 删除指定 hash 的 HashKey
     *
     * @param key
     * @param hashKeys
     * @return 删除成功的 数量
     */
    public Long delete(K key, HK... hashKeys);

    /**
     * 给指定 hash 的 hashkey 做增减操作
     *
     * @param key
     * @param hashKey
     * @param number
     * @return
     */
    public Long increment(K key, HK hashKey, long number);

    /**
     * 给指定 hash 的 hashkey 做增减操作
     *
     * @param key
     * @param hashKey
     * @param number
     * @return
     */
    public Double increment(K key, HK hashKey, Double number);

    /**
     * 获取指定 key 下的 hashkey
     *
     * @param key
     * @param hashKey
     * @return
     */
    public Object getHashKey(K key, HK hashKey);

    /**
     * 获取 key 下的 所有 hashkey 和 value
     *
     * @param key
     * @return
     */
    public Map<Object, Object> getHashEntries(K key);

    /**
     * 验证指定 key 下 有没有指定的 hashkey
     *
     * @param key
     * @param hashKey
     * @return
     */
    public boolean hashKey(K key, HK hashKey);

    /**
     * 获取 key 下的 所有 hashkey 字段名
     *
     * @param key
     * @return
     */
    public Set<Object> hashKeys(K key);

    /**
     * 获取指定 hash 下面的 键值对 数量
     *
     * @param key
     * @return
     */
    public Long hashSize(K key);

    // --------------------------------------List 操作---------------------------------------------

    /**
     * 指定 list 从左入栈
     *
     * @param key
     * @return 当前队列的长度
     */
    public Long leftPush(K key, V value);

    /**
     * 指定 list 从左出栈 如果列表没有元素,会堵塞到列表一直有元素或者超时为止
     *
     * @param key
     * @return 出栈的值
     */
    public Object leftPop(K key);

    /**
     * 从左边依次入栈 导入顺序按照 Collection 顺序 如: a b c => c b a
     *
     * @param key
     * @param values
     * @return
     */
    public Long leftPushAll(K key, Collection<V> values);

    /**
     * 指定 list 从右入栈
     *
     * @param key
     * @return 当前队列的长度
     */
    public Long rightPush(K key, V value);

    /**
     * 指定 list 从右出栈 如果列表没有元素,会堵塞到列表一直有元素或者超时为止
     *
     * @param key
     * @return 出栈的值
     */
    public V rightPop(K key);

    /**
     * 从右边依次入栈 导入顺序按照 Collection 顺序 如: a b c => a b c
     *
     * @param key
     * @param values
     * @return
     */
    public Long rightPushAll(K key, Collection<V> values);

    /**
     * 根据下标获取值
     *
     * @param key
     * @param index
     * @return
     */
    public V popIndex(K key, long index);

    /**
     * 获取列表指定长度
     *
     * @param key
     * @param index
     * @return
     */
    public Long listSize(K key);

    /**
     * 获取列表 指定范围内的所有值
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public List<V> listRange(K key, long start, long end);

    /**
     * 删除 key 中 值为 value 的 count 个数.
     *
     * @param key
     * @param count
     * @param value
     * @return 成功删除的个数
     */
    public Long listRemove(K key, long count, V value);

    /**
     * 删除 列表 [start,end] 以外的所有元素
     *
     * @param key
     * @param start
     * @param end
     */
    public void listTrim(K key, long start, long end);

    /**
     * 将 key 右出栈,并左入栈到 key2
     *
     * @param key  右出栈的列表
     * @param key2 左入栈的列表
     * @return 操作的值
     */
    public V rightPopAndLeftPush(K key, K key2);

    // set 操作 无序不重复集合

    /**
     * 添加 set 元素
     *
     * @param key
     * @param values
     * @return
     */
    public Long add(K key, V... values);

    /**
     * 获取两个集合的差集
     *
     * @param key
     * @param key2
     * @return
     */
    public Set<V> difference(K key, K otherkey);

    /**
     * 获取 key 和 集合 collections 中的 key 集合的差集
     *
     * @param key
     * @param collections
     * @return
     */
    public Set<V> difference(K key, Collection<K> otherKeys);

    /**
     * 将 key 与 otherkey 的差集 ,添加到新的 newKey 集合中
     *
     * @param key
     * @param otherkey
     * @param newKey
     * @return 返回差集的数量
     */
    public Long differenceAndStore(K key, K otherkey, K newKey);

    /**
     * 将 key 和 集合 collections 中的 key 集合的差集 添加到 newkey 集合中
     *
     * @param key
     * @param otherKeys
     * @param newKey
     * @return 返回差集的数量
     */
    public Long differenceAndStore(K key, Collection<K> otherKeys, K newKey);

    /**
     * 删除一个或多个集合中的指定值
     *
     * @param key
     * @param values
     * @return 成功删除数量
     */
    public Long remove(K key, V... values);

    /**
     * 随机移除一个元素,并返回出来
     *
     * @param key
     * @return
     */
    public V randomSetPop(K key);

    /**
     * 随机获取一个元素
     *
     * @param key
     * @return
     */
    public V randomSet(K key);

    /**
     * 随机获取指定数量的元素,同一个元素可能会选中两次
     *
     * @param key
     * @param count
     * @return
     */
    public List<V> randomSet(K key, long count);

    /**
     * 随机获取指定数量的元素,去重(同一个元素只能选择两一次)
     *
     * @param key
     * @param count
     * @return
     */
    public Set<V> randomSetDistinct(K key, long count);

    /**
     * 将 key 中的 value 转入到 destKey 中
     *
     * @param key
     * @param value
     * @param destKey
     * @return 返回成功与否
     */
    public boolean moveSet(K key, V value, K destKey);

    /**
     * 无序集合的大小
     *
     * @param key
     * @return
     */
    public Long setSize(K key);

    /**
     * 判断 set 集合中 是否有 value
     *
     * @param key
     * @param value
     * @return
     */
    public boolean isMember(K key, V value);

    /**
     * 返回 key 和 othere 的并集
     *
     * @param key
     * @param otherKey
     * @return
     */
    public Set<V> unionSet(K key, K otherkey);

    /**
     * 返回 key 和 otherKeys 的并集
     *
     * @param key
     * @param otherKey key 的集合
     * @return
     */
    public Set<V> unionSet(K key, Collection<K> otherKeys);

    /**
     * 将 key 与 otherKey 的并集,保存到 destKey 中
     *
     * @param key
     * @param otherKey
     * @param destKey
     * @return destKey 数量
     */
    public Long unionAndStoreSet(K key, K otherkey, K destKey);

    /**
     * 将 key 与 otherKey 的并集,保存到 destKey 中
     *
     * @param key
     * @param otherKeys
     * @param destKey
     * @return destKey 数量
     */
    public Long unionAndStoreSet(K key, Collection<K> otherKeys, K destKey);

    /**
     * 返回集合中所有元素
     *
     * @param key
     * @return
     */
    public Set<V> members(K key);

    // Zset 根据 socre 排序 不重复 每个元素附加一个 socre double类型的属性(double 可以重复)

    /**
     * 添加 ZSet 元素
     *
     * @param key
     * @param value
     * @param score
     */
    public boolean add(K key, V value, double score);

    /**
     * 批量添加 Zset <br>
     * Set<TypedTuple<Object>> tuples = new HashSet<>();<br>
     * TypedTuple<Object> objectTypedTuple1 = new
     * DefaultTypedTuple<Object>("zset-5",9.6);<br>
     * tuples.add(objectTypedTuple1);
     *
     * @param key
     * @param tuples
     * @return
     */
    public Long batchAddZset(K key, Set<ZSetOperations.TypedTuple<V>> tuples);

    /**
     * Zset 删除一个或多个元素
     *
     * @param key
     * @param values
     * @return
     */
    public Long removeZset(K key, V... values);

    /**
     * 对指定的 zset 的 value 值 , socre 属性做增减操作
     *
     * @param key
     * @param value
     * @param score
     * @return
     */
    public Double incrementScore(K key, V value, double score);

    /**
     * 获取 key 中指定 value 的排名(从0开始,从小到大排序)
     *
     * @param key
     * @param value
     * @return
     */
    public Long rank(K key, V value);

    /**
     * 获取 key 中指定 value 的排名(从0开始,从大到小排序)
     *
     * @param key
     * @param value
     * @return
     */
    public Long reverseRank(K key, V value);

    /**
     * 获取索引区间内的排序结果集合(从0开始,从小到大,带上分数)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Set<ZSetOperations.TypedTuple<V>> rangeWithScores(K key, long start, long end);

    /**
     * 获取索引区间内的排序结果集合(从0开始,从小到大,只有列名)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Set<V> range(K key, long start, long end);

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从小到大,只有列名)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Set<V> rangeByScore(K key, double min, double max);

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从小到大,集合带分数)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Set<ZSetOperations.TypedTuple<V>> rangeByScoreWithScores(K key, double min, double max);

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
    public Set<V> rangeByScore(K key, double min, double max, long offset, long count);

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
    public Set<ZSetOperations.TypedTuple<V>> rangeByScoreWithScores(K key, double min, double max, long offset, long count);

    /**
     * 获取索引区间内的排序结果集合(从0开始,从大到小,只有列名)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Set<V> reverseRange(K key, long start, long end);

    /**
     * 获取索引区间内的排序结果集合(从0开始,从大到小,带上分数)
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Set<ZSetOperations.TypedTuple<V>> reverseRangeWithScores(K key, long start, long end);

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从大到小,集合不带分数)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Set<V> reverseRangeByScore(K key, double min, double max);

    /**
     * 获取分数范围内的 [min,max] 的排序结果集合 (从大到小,集合带分数)
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Set<ZSetOperations.TypedTuple<V>> reverseRangeByScoreWithScores(K key, double min, double max);

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
    public Set<V> reverseRangeByScore(K key, double min, double max, long offset, long count);

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
    public Set<ZSetOperations.TypedTuple<V>> reverseRangeByScoreWithScores(K key, double min, double max, long offset,
																		   long count);

    /**
     * 返回指定分数区间 [min,max] 的元素个数
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    public long countZSet(K key, double min, double max);

    /**
     * 返回 zset 集合数量
     *
     * @param key
     * @return
     */
    public long sizeZset(K key);

    /**
     * 获取指定成员的 score 值
     *
     * @param key
     * @param value
     * @return
     */
    public Double score(K key, V value);

    /**
     * 删除指定索引位置的成员,其中成员分数按( 从小到大 )
     *
     * @param key
     * @param start
     * @param end
     * @return
     */
    public Long removeRange(K key, long start, long end);

    /**
     * 删除指定 分数范围 内的成员 [main,max],其中成员分数按( 从小到大 )
     *
     * @param key
     * @param min
     * @param max
     * @return
     */
    public Long removeRangeByScore(K key, double min, double max);

    /**
     * key 和 other 两个集合的并集,保存在 destKey 集合中, 列名相同的 score 相加
     *
     * @param key
     * @param otherKey
     * @param destKey
     * @return
     */
    public Long unionAndStoreZset(K key, K otherkey, K destKey);

    /**
     * key 和 otherKeys 多个集合的并集,保存在 destKey 集合中, 列名相同的 score 相加
     *
     * @param key
     * @param otherKeys
     * @param destKey
     * @return
     */
    public Long unionAndStoreZset(K key, Collection<K> otherKeys, K destKey);

    /**
     * key 和 otherKey 两个集合的交集,保存在 destKey 集合中
     *
     * @param key
     * @param otherKey
     * @param destKey
     * @return
     */
    public Long intersectAndStore(K key, K otherkey, K destKey);

    /**
     * key 和 otherKeys 多个集合的交集,保存在 destKey 集合中
     *
     * @param key
     * @param otherKeys
     * @param destKey
     * @return
     */
    public Long intersectAndStore(K key, Collection<K> otherKeys, K destKey);


    /**
     * 添加 Hash 键值对 Object
     *
     * @param key
     * @param hashKey
     * @param value
     */
    public void hmSet(K key, HK hashKey, V value);


    public V hmGet(K key, HK hashKey);

    /**
     * 删除hash键
     *
     * @param key
     * @param hashKey
     */
    public void hmDeleteKey(K key, HK hashKey);

   /* public V getSession(String userName);

    public void setSession(String userName, V session, long dayTime) {
        hmSet(Constants.FRAS_SESSION_KEY, userName, session);
        expire(Constants.FRAS_SESSION_KEY + ":" + userName, dayTime, TimeUnit.DAYS);
    }

    public void hmClear(K key, HK hashKey) {
        HashOperations<Object, Object, Object> hash = redisTemplate.opsForHash();
        hash.delete(key, hashKey);
    }

    public void clearSession(String username) {
        hmClear(Constants.FRAS_SESSION_KEY, username);
    }*/


}
