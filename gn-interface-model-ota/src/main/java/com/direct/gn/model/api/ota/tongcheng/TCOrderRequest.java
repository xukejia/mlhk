package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

public class TCOrderRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7273662117339860462L;

	// 接口身份标识用户名（渠道唯一标识）
	private String userName;
	// 行程类型，1：单程；2：往返；
	private String tripType;
	// 会话标识：标记服务接口调用的唯一标识，相应的调用结果中会原值返回。数字或字母，长度小于 50个字符，且不能为空。
	private String sessionId;
	// 参考搜索返回结果中的 routingElements。只含航班信息，不含价格信息
	private TCRouteVo routing;
	// 乘机人信息，参考下面 的 passengerElement
	private List<TCPassengerVo> passengers;
	// 联系人信息，参考下面的 contact Element
	private List<TCContactVo> contacts;
	// 乘机人购买增值扩展服务信息，参考下面的PassengerAuxElement；仅客人预订销售类型为一次销售的增值服务产品时，会传值。
	private List<TCPassengerAuxVo> passengerAuxes;

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

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public TCRouteVo getRouting() {
		return routing;
	}

	public void setRouting(TCRouteVo routing) {
		this.routing = routing;
	}

	public List<TCPassengerVo> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<TCPassengerVo> passengers) {
		this.passengers = passengers;
	}

	public List<TCContactVo> getContacts() {
		return contacts;
	}

	public void setContacts(List<TCContactVo> contacts) {
		this.contacts = contacts;
	}

	public List<TCPassengerAuxVo> getPassengerAuxes() {
		return passengerAuxes;
	}

	public void setPassengerAuxes(List<TCPassengerAuxVo> passengerAuxes) {
		this.passengerAuxes = passengerAuxes;
	}

}
