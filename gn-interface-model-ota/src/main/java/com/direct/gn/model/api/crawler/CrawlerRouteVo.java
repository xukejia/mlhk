package com.direct.gn.model.api.crawler;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 旅行信息
 */
public class CrawlerRouteVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -304679368619579615L;
	private String carrier;  //航司  AK
	private String fromCity; //出发地   KUL
	private String toCity;   //到达地    DMK
	private String fromDate; //出发日期   2013-07-29
	private List<Flight> flights=new ArrayList<Flight>(); //航班信息
	
	private String createtime;//抓取时间
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
	
	
	public String getCarrier() {
		return carrier;
	}


	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}


	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}


	public String getCreatetime() {
		return createtime;
	}


	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	
}






