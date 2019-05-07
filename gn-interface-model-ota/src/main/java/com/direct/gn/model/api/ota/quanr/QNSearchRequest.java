package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class QNSearchRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5585480537829673834L;
	private String cid; 
	private String tripType;   //行程类型， 1：单程； 2：往返； 3：多程； 4：往返中推荐多程（消费者往返的请求，我们会推荐多 程的结果信息，推荐的原则为行程的出发或到达出现在 第二程中，比如消费者搜索A-B的往返，我们会推荐 A-B,B-C或者A-B,C-A,不推荐A-B,C-D
	private Integer adultNum ; //1. 没有该字段时，默认乘客类型为成人，乘机总人	数为1 （即：1个成人） 2. 有该字段时，代表乘客类型为成人的乘机总人数
	private Integer childNum ; //1. 没有该字段时，默认为0个儿童 2. 有该字段时，代表乘客类型为儿童的乘机总人数
	private String fromCity ; //出发地 IATA三字码代码 如果为多程，会按照 PEK/HKG，HKG/SHA格式请求， 第一程为北京->香港，第二程为香港->上海
	private String toCity ;   //到达地IATA三字码
	private String fromDate ; //去程，格式为 YYYYMMDD，YYYYMMDD 如果为多程，20130729, 20130804方式传输数据 
	private String retDate ;  //回程日期，格式为 YYYYMMDD（留空表示单程）
	
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
	public Integer getAdultNum() {
		return adultNum;
	}
	public void setAdultNum(Integer adultNum) {
		this.adultNum = adultNum;
	}
	public Integer getChildNum() {
		return childNum;
	}
	public void setChildNum(Integer childNum) {
		this.childNum = childNum;
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
	
//	
//	    单程： { 
//		"cid": "test", "tripTpye":"1",  "adultNum": 2, "childNum": 1, "fromCity": "BJS", "toCity": "HKG", "fromDate": "20130729", "retDate": "" 
//		} 
//	    往返： { 
//		"cid": "test", "tripTpye":"2",  "adultNum": 2, "childNum": 1, "fromCity": "SHA", "toCity": "HKG", "fromDate": "20130729", "retDate": "20130804" 
//		} 
//	    多程： { 
//		"cid": "test", "tripTpye":"3",  "adultNum": 2, "childNum": 1, "fromCity": "PEK/HKG,HKG/SHA",  "toCity":null,  "fromDate": "20130729, 20130804",  "retDate": ""  
//		} 
	
}
