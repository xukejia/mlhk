package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class QNOrderRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2174087238178150562L;

	private String cid;           //接口身份标识用户名（渠道唯一标识）
	
	private Integer orderSource;  //订单来源：“1”为抢单池订单
	private String tripType;      //行程类型， 1：单程； 2：往返； 3：多程； 
	private String sessionId;     //会话标识：标记服务接口调用的唯一标识，相应的 调用结果中会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private QNRouteVo routing;       //报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息.不包含CabinClass
    private List<QNPassengerVo> passengers;  //乘机人信息，参考下面的Passenger Element 
	private QNContactVo contact;             //联系人信息，参考下面的Contact Element
	
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
	public Integer getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(Integer orderSource) {
		this.orderSource = orderSource;
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
	public QNRouteVo getRouting() {
		return routing;
	}
	public void setRouting(QNRouteVo routing) {
		this.routing = routing;
	}

	public List<QNPassengerVo> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<QNPassengerVo> passengers) {
		this.passengers = passengers;
	}
	public QNContactVo getContact() {
		return contact;
	}
	public void setContact(QNContactVo contact) {
		this.contact = contact;
	}

	
}
