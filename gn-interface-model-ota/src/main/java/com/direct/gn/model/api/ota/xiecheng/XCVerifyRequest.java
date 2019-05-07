package com.direct.gn.model.api.ota.xiecheng;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.direct.gn.model.api.ota.quanr.QNRouteVo;

import java.io.Serializable;

public class XCVerifyRequest implements Serializable{
	private String cid;         //接口身份标识用户名（渠道唯一标识）
	private String referenceId;  // 携程关联ID；携程用来查问题用的。
	private String tripType;    //行程类型， 1：单程； 2：往返； 3：多程；
	private String requesttype = "1";  // 请求类型，全部为1：验价；
	private Integer adultNumber;   // 成⼈人数，1-9
	private Integer childNumber;   // ⼉童⼈数，0-9
	private Integer infantNumber;  // 婴儿人数，0-9
	private XCRouteVo routing;  // 报价信息，参考搜索返回结果中的 Routing Elements。 1）只含航班信息,航班信息不含经停城市/机场，机型； 2）不含价格信息、退改签信息、行李额信息等。


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
	public XCRouteVo getRouting() {
		return routing;
	}
	public void setRouting(XCRouteVo routing) {
		this.routing = routing;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getRequesttype() {
		return requesttype;
	}

	public void setRequesttype(String requesttype) {
		this.requesttype = requesttype;
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

	public Integer getInfantNumber() {
		return infantNumber;
	}

	public void setInfantNumber(Integer infantNumber) {
		this.infantNumber = infantNumber;
	}
}
