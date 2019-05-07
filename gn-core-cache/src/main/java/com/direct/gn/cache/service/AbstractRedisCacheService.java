package com.direct.gn.cache.service;

import com.direct.gn.cache.model.CacheModel;
import com.direct.gn.enums.CustomExceptionEnum;
import com.direct.gn.exception.CustomException;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;
import com.github.pagehelper.Page;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public abstract class AbstractRedisCacheService<T extends Serializable> implements CacheService<T> {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private RedisTemplate<String, T> template = null;

    @PostConstruct
    public void init() {
        StringRedisSerializer s = new StringRedisSerializer();
        template = new RedisTemplate<String, T>();
        template.setConnectionFactory(this.getJedisConnectionFactory());
        template.setKeySerializer(s);
        template.setHashKeySerializer(s);
        template.afterPropertiesSet();
    }

    protected abstract RedisConnectionFactory getJedisConnectionFactory();

    protected RedisConnectionFactory connectionFactory(String hostName, int port, String password, int maxIdle,
                                                       int maxTotal, int index, long maxWaitMillis, int timeout, boolean testOnBorrow) {
        JedisConnectionFactory jedis = new JedisConnectionFactory();
        jedis.setHostName(hostName);
        jedis.setPort(port);
        jedis.setTimeout(timeout);
        if (!StringUtils.isEmpty(password)) {
            jedis.setPassword(password);
        }
        if (index != 0) {
            jedis.setDatabase(index);
        }
        jedis.setPoolConfig(poolCofig(maxIdle, maxTotal, maxWaitMillis, testOnBorrow));
        // 初始化连接pool
        jedis.afterPropertiesSet();
        RedisConnectionFactory factory = jedis;

        return factory;
    }

    protected JedisPoolConfig poolCofig(int maxIdle, int maxTotal, long maxWaitMillis, boolean testOnBorrow) {
        JedisPoolConfig poolCofig = new JedisPoolConfig();
        poolCofig.setMaxIdle(maxIdle);
        poolCofig.setMaxTotal(maxTotal);
        poolCofig.setMaxWaitMillis(maxWaitMillis);
        poolCofig.setTestOnBorrow(testOnBorrow);
        return poolCofig;
    }

    protected RedisTemplate<String, T> getRedisTemplate() {
        return this.template;
    }

    /**
     * 判断缓存中是否有对应的value
     *
     * @param key
     * @return
     */
    public boolean exists(final String key) {
        return getRedisTemplate().hasKey(key);
    }

    @Override
    public Long increment(final String key, Long value) throws CustomException {
        Long result = 0L;
        try {
            Long operations = getRedisTemplate().opsForValue().increment(key, value);
            result = operations;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, e.getMessage());
        }
        return result;
    }

    @Override
    public Long getIncrValue(String key) throws CustomException {
        Long result = 0L;
        try {
            Long operations = getRedisTemplate().opsForValue().increment(key, 0L);
            result = operations;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, e.getMessage());
        }
        return result;
    }

    @Override
    public void add(String key, T value, int minutes) throws CustomException {
        try {
            getRedisTemplate().opsForValue().set(key, value, minutes, TimeUnit.MINUTES);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public void add(String key, T value) throws CustomException {
        try {
            getRedisTemplate().opsForValue().set(key, value);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }

    }

    @Override
    public void addList(String key, Collection<T> values) throws CustomException {
        try {
            if (values != null && values.size() > 0) {
                remove(key);
                // getRedisTemplate().opsForList().leftPushAll(key, values);
                for (T value : values) {
                    getRedisTemplate().opsForList().leftPush(key, value);
                }
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }

    }

    @Override
    public void addList(String key, Collection<T> values, int minutes) throws CustomException {
        try {
            remove(key);
            // getRedisTemplate().opsForList().leftPushAll(key, values);
            for (T value : values) {
                getRedisTemplate().opsForList().leftPush(key, value);
            }
            getRedisTemplate().expire(key, minutes, TimeUnit.MINUTES);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public void addOneToList(String key, T value) throws CustomException {
        try {
            getRedisTemplate().opsForList().leftPush(key, value);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public T get(String key) throws CustomException {
        try {
            return getRedisTemplate().opsForValue().get(key);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public List<T> getList(String key) throws CustomException {
        try {
            Long size = getRedisTemplate().opsForList().size(key);
            return getRedisTemplate().opsForList().range(key, 0, size);
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public T getListFirstOne(String key) throws CustomException {
        try {
            List<T> le = getRedisTemplate().opsForList().range(key, 0, 1);
            if (le != null && le.size() > 0) {
                return le.get(0);
            } else {
                return null;
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public long getCountLike(String keyPrefix) throws CustomException {
        try {
            if (StringUtils.isNotEmpty(keyPrefix)) {
                Set<String> matchedCacheKeys = getRedisTemplate().keys(keyPrefix + "*");
                return matchedCacheKeys.size();
            } else {
                return 0;
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public void remove(String key) throws CustomException {
        try {
            // getRedisTemplate().delete(getRedisTemplate().keys(key));
            if (exists(key)) {
                getRedisTemplate().delete(key);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }

    }

    @Override
    public void removeLike(String keyPrefix) throws CustomException {
        try {
            if (StringUtils.isNotEmpty(keyPrefix)) {
                Set<String> matchedCacheKeys = getRedisTemplate().keys(keyPrefix + "*");
                getRedisTemplate().delete(matchedCacheKeys);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }

    @Override
    public void expire(String key, int minutes) throws CustomException {
        try {
            getRedisTemplate().expire(key, minutes, TimeUnit.SECONDS);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, e.getMessage());
        }
    }

    @Override
    public QueryResult<CacheModel> getListByPage(String keyPrefix, PageQuery page) throws CustomException {
        QueryResult<CacheModel> result = new QueryResult<CacheModel>();
        try {
            Set<String> matchedCacheKeys = getRedisTemplate().keys(keyPrefix + '*');
            int count = matchedCacheKeys.size();
            Page<CacheModel> list = new Page<CacheModel>(page.getPageNum(), page.getPageSize());
            list.setTotal(count);
            if (count > 0) {
                String[] keys = matchedCacheKeys.toArray(new String[matchedCacheKeys.size()]);

                int totle = list.getEndRow() > count ? count : list.getEndRow();
                for (int i = list.getStartRow(); i < totle; i++) {

                    CacheModel vo = new CacheModel();
                    vo.setKey(keys[i]);
                    try {
                        vo.setValue(this.get(keys[i]));
                    } catch (Exception e) {
                        logger.error("redis key error key : " + keys[i]);
                        continue;
                    }
                    list.add(vo);
                }

                result.setResults(list);
            } else {
                result.setResults(new ArrayList<CacheModel>(0));
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return result;
    }

    @Override
    public QueryResult<CacheModel> getListLike(String keyPrefix) throws CustomException {
        QueryResult<CacheModel> result = new QueryResult<CacheModel>();
        try {
            Set<String> matchedCacheKeys = getRedisTemplate().keys(keyPrefix + '*');
            int count = matchedCacheKeys.size();
            if (count > 0) {
                List<CacheModel> list = new ArrayList<CacheModel>();
                String[] keys = matchedCacheKeys.toArray(new String[matchedCacheKeys.size()]);
                for (int i = 0; i < keys.length; i++) {
                    CacheModel vo = new CacheModel();
                    vo.setKey(keys[i]);
                    vo.setValue((Object) this.get(keys[i]));

                    list.add(vo);
                }
                result.setResults(list);
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return result;
    }

    @Override
    public int getExpire(String key) throws CustomException {
        try {
            return getRedisTemplate().getExpire(key, TimeUnit.MINUTES).intValue();
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            throw new CustomException(CustomExceptionEnum.EXC_CACHE_ERROR, ex.getMessage());
        }
    }
}
