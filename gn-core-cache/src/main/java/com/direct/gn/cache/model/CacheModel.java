/**
 * com.direct.gn
 */
package com.direct.gn.cache.model;

import java.io.Serializable;

/**
 * @author cc
 *
 */
public class CacheModel implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6373828069397466472L;

	private String key;

	private Object value;

	private String platform;
	
	public String getKey()
	{
		return this.key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}

	public Object getValue()
	{
		return this.value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	public String getPlatform()
	{
		return this.platform;
	}

	public void setPlatform(String platform)
	{
		this.platform = platform;
	}

	@Override
	public String toString()
	{
		return "CacheModel [key=" + this.key + ", value=" + this.value + ", platform=" + this.platform + "]";
	}
	
}
