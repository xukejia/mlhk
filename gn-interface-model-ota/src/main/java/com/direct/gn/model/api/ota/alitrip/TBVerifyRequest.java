package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TBVerifyRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 899371611143788729L;
	private String cid;         //接口身份标识用户名（渠道唯一标识）
	private String tripType;    //行程类型， 1：单程； 2：往返
	private TBRouteVo routing;  //报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息  不包含cabinclass 
	
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
	public TBRouteVo getRouting() {
		return routing;
	}
	public void setRouting(TBRouteVo routing) {
		this.routing = routing;
	}
	
	
	
}
