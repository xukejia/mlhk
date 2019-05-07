package com.direct.gn.cache.service;

import com.direct.gn.cache.model.CacheModel;
import com.direct.gn.exception.CustomException;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


/**
 * 缓存组件-缓存接口
 *
 * @author hule
 */
public interface CacheService<T extends Serializable> {

    /**
     * 添加对象到缓存
     *
     * @param key     缓存key
     * @param value   缓存对象
     * @param minutes 过期时间
     * @throws CustomException
     */
    public void add(String key, T value, int minutes) throws CustomException;

    /**
     * 添加对象到缓存
     *
     * @param key   缓存key
     * @param value 缓存对象
     * @throws CustomException
     */
    public void add(String key, T value) throws CustomException;

    /**
     * 添加集合到缓存
     *
     * @param key    缓存key
     * @param values 缓存对象
     * @throws CustomException
     */
    public void addList(String key, Collection<T> values) throws CustomException;

    /**
     * 添加集合到缓存
     *
     * @param key     缓存key
     * @param values  缓存对象
     * @param minutes 过期时间
     * @throws CustomException
     */
    public void addList(String key, Collection<T> values, int minutes) throws CustomException;

    /**
     * 添加对象到缓存集合中
     *
     * @param key   缓存key
     * @param value 缓存对象
     * @throws CustomException
     */
    public void addOneToList(String key, T value) throws CustomException;

    /**
     * 获取缓存对象
     *
     * @param key 缓存key
     * @return
     * @throws CustomException
     */
    public T get(String key) throws CustomException;

    /**
     * 获取缓存列表
     *
     * @param key 缓存key
     * @return
     * @throws CustomException
     */
    public List<T> getList(String key) throws CustomException;

    /**
     * 获取缓存列表,带分页
     *
     * @param key 缓存key
     * @return
     * @throws CustomException
     */
    public QueryResult<CacheModel> getListByPage(String key, PageQuery page) throws CustomException;

    /**
     * 获取列表
     *
     * @param key
     * @return
     * @throws CustomException
     */
    public T getListFirstOne(String key) throws CustomException;

    /**
     * 获得缓存数量
     *
     * @param keyPrefix key前缀
     * @return
     * @throws CustomException
     */
    public long getCountLike(String keyPrefix) throws CustomException;

    /**
     * 删除缓存
     *
     * @param key 缓存key
     * @throws CustomException
     */
    public void remove(String key) throws CustomException;

    /**
     * 模糊删除缓存
     *
     * @param keyPrefix 缓存前缀
     * @throws CustomException
     */
    public void removeLike(String keyPrefix) throws CustomException;

    /**
     * @param key
     * @param value
     * @return
     */
    public Long increment(final String key, Long value) throws CustomException;

    /**
     * @param key
     * @return
     * @throws CustomException
     */
    public Long getIncrValue(String key) throws CustomException;

    void expire(String key, int minutes) throws CustomException;

    int getExpire(String key) throws CustomException;

    public boolean exists(final String key) throws CustomException;

    /**
     * 获取缓存列表，不分页
     *
     * @param keyPrefix
     * @return
     * @throws CustomException
     */
    public QueryResult<CacheModel> getListLike(String keyPrefix) throws CustomException;
}
