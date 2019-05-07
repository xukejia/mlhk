package com.direct.gn.model.api.crawler;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;



/**
 * 航班信息
 */
public class Flight implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8277243711299574509L;
	private String seatCount;  //座位数   9
	private String childPrice;//儿童价   800   进位不要小数点
	private String childTax;  //儿童税费  100  进位不要小数点
	private String adultPrice;//成人价  1000  进位不要小数点
	private String adultTax;  //成人税费  100 进位不要小数点
	private String flightTime;//飞行时间
	private String flightType;//航程类型（1中转、0直飞，两程以上的中转）
	private String priceType;
	private String priceTypeCh;
    private List<Segment> segments=new ArrayList<Segment>(); //航程信息
    
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
	
    
	public String getPriceType() {
		return priceType;
	}


	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}


	public String getPriceTypeCh() {
		return priceTypeCh;
	}


	public void setPriceTypeCh(String priceTypeCh) {
		this.priceTypeCh = priceTypeCh;
	}


	public String getChildTax() {
		return childTax;
	}


	public void setChildTax(String childTax) {
		this.childTax = childTax;
	}


	public String getAdultTax() {
		return adultTax;
	}


	public void setAdultTax(String adultTax) {
		this.adultTax = adultTax;
	}


	public List<Segment> getSegments() {
		return segments;
	}
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}

	public String getSeatCount() {
		return seatCount;
	}


	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}


	public String getChildPrice() {
		return childPrice;
	}
	public void setChildPrice(String childPrice) {
		this.childPrice = childPrice;
	}
	public String getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(String adultPrice) {
		this.adultPrice = adultPrice;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}


}
