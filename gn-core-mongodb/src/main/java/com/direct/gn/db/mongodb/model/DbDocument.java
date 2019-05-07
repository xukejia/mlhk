package com.direct.gn.db.mongodb.model;

import java.io.Serializable;


public class DbDocument<T> implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    String key;

    T value;

    Long time;

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public Long getTime()
    {
        return time;
    }

    public void setTime(Long time)
    {
        this.time = time;
    }

    @Override
    public String toString()
    {
        return "DbDocument [key=" + key + ", time=" + time + "]" + ", value=" + value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {

        if (this == obj)
        {
            return true;
        }

        if (this.key == null || obj == null || !(this.getClass().equals(obj.getClass())))
        {
            return false;
        }

        @SuppressWarnings("rawtypes")
        DbDocument that = (DbDocument) obj;

        return this.key.equals(that.getKey());
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return key == null ? 0 : key.hashCode();
    }
}
