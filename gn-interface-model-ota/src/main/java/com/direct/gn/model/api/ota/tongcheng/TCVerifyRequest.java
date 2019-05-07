package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

public class TCVerifyRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2745691844616114240L;

	// 接口身份标识用户名（渠道唯一标识）
	private String userName;
	// 行程类型，1：单程；2：往返；
	private String tripType;
	// 成人数，1-9
	private Integer adultNumber;
	// 儿童数，0-9
	private Integer childNumber;
	// 报价信息，参考搜索返回结果中的RoutingElements只含航班信息，不含价格信息和规则信息。
	private TCRouteVo routing;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public Integer getAdultNumber() {
		return adultNumber;
	}

	public void setAdultNumber(Integer adultNumber) {
		this.adultNumber = adultNumber;
	}

	public Integer getChildNumber() {
		return childNumber;
	}

	public void setChildNumber(Integer childNumber) {
		this.childNumber = childNumber;
	}

	public TCRouteVo getRouting() {
		return routing;
	}

	public void setRouting(TCRouteVo routing) {
		this.routing = routing;
	}

}
