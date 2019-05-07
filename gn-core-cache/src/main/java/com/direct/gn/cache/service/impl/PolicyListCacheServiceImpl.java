/**
 * com.direct.gn
 */
package com.direct.gn.cache.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.direct.gn.cache.service.AbstractRedisCacheService;

/**
 * @author cc
 *
 */
public class PolicyListCacheServiceImpl<T extends Serializable> extends AbstractRedisCacheService<T>
{
	@Resource
	private RedisTemplate<String, T> redisCacheTemplatePolicyList;

	@Override
	protected RedisConnectionFactory getJedisConnectionFactory()
	{
		return null;
	}

	@Override
	public void init()
	{
	}

	@Override
	protected RedisTemplate<String, T> getRedisTemplate()
	{
		return this.redisCacheTemplatePolicyList;
	}

}
