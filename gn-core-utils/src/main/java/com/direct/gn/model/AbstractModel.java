package com.direct.gn.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractModel implements Serializable
{
	transient protected final Logger log = LoggerFactory.getLogger(this.getClass());
	/**
	 * 
	 */
	private static final long serialVersionUID = 534539712309020820L;

    private String queryStartDate;   // 查询开始时间
    private String queryEndDate;     // 查询结束时间
    ///
    
	public String getQueryStartDate()
	{
		return this.queryStartDate;
	}

	public void setQueryStartDate(String queryStartDate)
	{
		this.queryStartDate = queryStartDate;
	}

	public String getQueryEndDate()
	{
		return this.queryEndDate;
	}

	public void setQueryEndDate(String queryEndDate)
	{
		this.queryEndDate = queryEndDate;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		List<Field> fieldlist = new ArrayList<Field>();
		try
		{
			@SuppressWarnings("rawtypes")
			Class clazz = this.getClass();
			while (!AbstractModel.class.equals(clazz))
			{
				Field[] fieldArray = clazz.getDeclaredFields();
				for (int i = 0; i < fieldArray.length; i++)
				{
					if ("serialVersionUID".equals(fieldArray[i].getName()) || "log".equals(fieldArray[i].getName()))
					{
						continue;
					}

					fieldlist.add(fieldArray[i]);
				}
				clazz = clazz.getSuperclass();
			}

			sb.append('[').append(this.getClass()).append(']');
			sb.append('[');

			final int endCount = fieldlist.size() - 1;
			for (int i = 0; i < fieldlist.size(); i++)
			{
				fieldlist.get(i).setAccessible(true);
				sb.append(fieldlist.get(i).getName());
				sb.append(" = ");
				sb.append(fieldlist.get(i).get(this));
				if (i != endCount)
				{
					sb.append(" , ");
				}
			}
			sb.append(']');
		} catch (SecurityException e)
		{
			log.error(e.getMessage(), e);
		} catch (IllegalArgumentException e)
		{
			log.error(e.getMessage(), e);
		} catch (IllegalAccessException e)
		{
			log.error(e.getMessage(), e);
		}

		return sb.toString();
	}

	@SuppressWarnings("rawtypes")
	public void spaceConvertNull()
	{
		Class c = this.getClass();
		Field[] f = c.getDeclaredFields();
		try
		{
			for (int i = 0; i < f.length; i++)
			{
				f[i].setAccessible(true);
				if (f[i].getType().getName().indexOf("String") >= 0)
				{
					if (f[i].get(this) != null && f[i].get(this).equals(""))
					{
						f[i].set(this, null);
					}
				}
			}
		} catch (Exception e)
		{
			log.error(e.getMessage());
		}
	}
}
