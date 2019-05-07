package com.direct.gn.model.api.gw;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GwSearchRequestVo implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1705699201828358430L;

    private String tripType; // 行程类型， 1：单程； 2：往返；
    private Integer adultNum = 1; // 1. 没有该字段时，默认乘客类型为成人，乘机总人 数为1 （即：1个成人） 2. 有该字段时，代表乘客类型为成人的乘机总人数
    private Integer childNum = 0; // 1. 没有该字段时，默认为0个儿童 2. 有该字段时，代表乘客类型为儿童的乘机总人数
    private String fromCity; // 出发地 IATA三字码代码
    private String toCity; // 到达地IATA三字码
    private String fromDate; // 去程，格式为 YYYYMMDD
    private String retDate; // 回程日期，格式为 YYYYMMDD（留空表示单程）
    private String exAirline;// 航司黑名单
    private String inAirline;// 航司白名单 多个用逗号分开 CA,CZ



	public String getInAirline() {
		return inAirline;
	}

	public void setInAirline(String inAirline) {
		this.inAirline = inAirline;
	}

	public GwSearchRequestVo()
    {
    }

    public GwSearchRequestVo(String tripType, String fromCity, String toCity, String fromDate, String retDate, Integer adultNum, Integer childNum)
    {
        this.tripType = tripType;
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.fromDate = fromDate;
        this.retDate = retDate;
        this.adultNum = adultNum;
        this.childNum = childNum;

    }

    public String getKey()
    {
        StringBuilder key = new StringBuilder();
        key.append(fromCity).append('-').append(toCity).append('-').append(fromDate);
        if (null != retDate && !"".equals(retDate.trim()))
        {
            key.append('-').append(retDate);
        }
        
        return key.toString();
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getTripType()
    {
        return tripType;
    }

    public void setTripType(String tripType)
    {
        this.tripType = tripType;
    }

    public Integer getAdultNum()
    {
        return adultNum;
    }

    public void setAdultNum(Integer adultNum)
    {
        this.adultNum = adultNum;
    }

    public Integer getChildNum()
    {
        return childNum;
    }

    public void setChildNum(Integer childNum)
    {
        this.childNum = childNum;
    }

    public String getFromCity()
    {
        return fromCity;
    }

    public void setFromCity(String fromCity)
    {
        this.fromCity = fromCity;
    }

    public String getToCity()
    {
        return toCity;
    }

    public void setToCity(String toCity)
    {
        this.toCity = toCity;
    }

    public String getFromDate()
    {
        return fromDate;
    }

    public void setFromDate(String fromDate)
    {
        this.fromDate = fromDate;
    }

    public String getRetDate()
    {
        return retDate;
    }

    public void setRetDate(String retDate)
    {
        this.retDate = retDate;
    }

    public static long getSerialversionuid()
    {
        return serialVersionUID;
    }
    
    public String getExAirline() {
		return exAirline;
	}

	public void setExAirline(String exAirline) {
		this.exAirline = exAirline;
	}


}
