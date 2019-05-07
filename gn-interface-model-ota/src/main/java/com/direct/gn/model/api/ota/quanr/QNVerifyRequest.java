package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class QNVerifyRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3591204870737351036L;
	private String cid;         //接口身份标识用户名（渠道唯一标识）
	private String tripType;    //行程类型， 1：单程； 2：往返； 3：多程； 
	private Integer adultNum;   //1. 没有该字段时，默认乘客类型为成人，乘机总人 数为1 （即：1个成人） 2. 有该字段时，代表乘客类型为成人的乘机总人数
	private Integer childNum;   //1. 没有该字段时，默认为0个儿童 2. 有该字段时，代表乘客类型为儿童的乘机总人数 
	private QNRouteVo routing;  //报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息  不包含cabinclass 
	
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
	public QNRouteVo getRouting() {
		return routing;
	}
	public void setRouting(QNRouteVo routing) {
		this.routing = routing;
	}

	
	
}
