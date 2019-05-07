package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TBPayRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5436467574769290464L;
	private String cid;            //接口身份标识用户名（渠道唯一标识）
	private String tripType;        //行程类型， 1：单程； 2：往返； 3：多程； 
	private String sessionId;       //会话标识：标记服务接口调用的唯一标识，相应的调用结 果中原值返回。数字或字母，长度小于50个字符，且不能 为空。
	private String orderNo;         //生成订单成功时返回的订单号
	private String pnrCode;         //生成订单成功时返回的 PNR 编码 
	private TBRouteVo  routing;     //报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息.不包含CabinClass 

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
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getPnrCode() {
		return pnrCode;
	}
	public void setPnrCode(String pnrCode) {
		this.pnrCode = pnrCode;
	}
	public TBRouteVo getRouting() {
		return routing;
	}
	public void setRouting(TBRouteVo routing) {
		this.routing = routing;
	}
	

	
}
