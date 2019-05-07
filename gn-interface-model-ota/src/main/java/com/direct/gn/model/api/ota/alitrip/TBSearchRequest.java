package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TBSearchRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5044734558801067919L;
	private String cid;        //接⼝口⾝身份标识⽤用户名（渠道唯⼀一标识）    
	private String tripType;   //行程类型， 1：单程； 2：往返；
	private String fromCity ; //出发地 IATA三字码代码 如果为多程，会按照 PEK/HKG，HKG/SHA格式请求， 第一程为北京->香港，第二程为香港->上海
	private String toCity ;   //到达地IATA三字码
	private String fromDate ; //去程，格式为 YYYYMMDD，YYYYMMDD 如果为多程，20130729, 20130804方式传输数据 
	private String retDate ;  //回程日期，格式为 YYYYMMDD（留空表示单程）
	//成人人数， 1-9，供应商需按照实际请求出行人数返回相关运价数据生效时间请等待运营通知。 
	private String adultNumber;
	//儿童人数， 0-9生效时间请等待运营通知。 
	private String childNumber;
	//婴儿人数， 0-9生效时间请等待运营通知。 
	private String infantNumber;
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
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
	public String getRetDate() {
		return retDate;
	}
	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}
	public String getAdultNumber() {
		return adultNumber;
	}
	public void setAdultNumber(String adultNumber) {
		this.adultNumber = adultNumber;
	}
	public String getChildNumber() {
		return childNumber;
	}
	public void setChildNumber(String childNumber) {
		this.childNumber = childNumber;
	}
	public String getInfantNumber() {
		return infantNumber;
	}
	public void setInfantNumber(String infantNumber) {
		this.infantNumber = infantNumber;
	}

}
