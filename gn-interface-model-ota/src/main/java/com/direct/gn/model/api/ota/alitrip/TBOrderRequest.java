package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TBOrderRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7258456878529270656L;
	private String cid;           //接口身份标识用户名（渠道唯一标识）
	private String tripType;      //行程类型， 1：单程； 2：往返； 3：多程； 
	private String sessionId;     //会话标识：标记服务接口调用的唯一标识，相应的 调用结果中会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private TBRouteVo routing;       //报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息.不包含CabinClass
    private List<TBPassengerVo> passengers;  //乘机人信息，参考下面的Passenger Element 
	private TBContactVo contact;             //联系人信息，参考下面的Contact Element
	

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
	public List<TBPassengerVo> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<TBPassengerVo> passengers) {
		this.passengers = passengers;
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
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public TBRouteVo getRouting() {
		return routing;
	}
	public void setRouting(TBRouteVo routing) {
		this.routing = routing;
	}

	public TBContactVo getContact() {
		return contact;
	}
	public void setContact(TBContactVo contact) {
		this.contact = contact;
	}

	
}
