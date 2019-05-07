package com.direct.gn.model.api.ota.xiecheng;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.direct.gn.model.api.ota.quanr.QNContactVo;
import com.direct.gn.model.api.ota.quanr.QNPassengerVo;
import com.direct.gn.model.api.ota.quanr.QNRouteVo;

import java.io.Serializable;
import java.util.List;


public class XCOrderRequest implements Serializable{

	private String cid;           //接口身份标识用户名（渠道唯一标识）
	private XCCtripOrderId ctripOrderId; // 携程订单号，参考下面的ctripOrderId Element
	private String referenceId;  // 携程关联ID
	private String tripType;      //行程类型， 1：单程； 2：往返； 3：多程；
	private String sessionId;     //会话标识：标记服务接口调用的唯一标识，相应的 调用结果中会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private XCRouteVo routing;       //报价信息，参考搜索返回结果中的 Routing Elements。 只含航班信息，不含价格信息.不包含CabinClass
    private List<XCPassengerVo> passengers;  //乘机人信息，参考下面的Passenger Element
	private XCContactVo contact;             //联系人信息，参考下面的Contact Element
    private List<XCPassengerBaggage> passengerbaggages; // 乘机人预订行李信息，参考下面的PassengerBaggage Element
    private List<XCCtripRefRevServiceFee> ctripRefRevServiceFee;  // 携程退改费用信息，参考下面的 CtripRefRevServiceFee Element
    private XCBookValueAddRequest valueAddRequest; // 增值服务请求信息，参考下面的 BookValueAddRequest Element【JSON示例未添加此项】


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
	public XCRouteVo getRouting() {
		return routing;
	}
	public void setRouting(XCRouteVo routing) {
		this.routing = routing;
	}

	public XCCtripOrderId getCtripOrderId() {
		return ctripOrderId;
	}

	public void setCtripOrderId(XCCtripOrderId ctripOrderId) {
		this.ctripOrderId = ctripOrderId;
	}

	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public List<XCPassengerVo> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<XCPassengerVo> passengers) {
		this.passengers = passengers;
	}

	public XCContactVo getContact() {
		return contact;
	}

	public void setContact(XCContactVo contact) {
		this.contact = contact;
	}

    public List<XCPassengerBaggage> getPassengerbaggages() {
        return passengerbaggages;
    }

    public void setPassengerbaggages(List<XCPassengerBaggage> passengerbaggages) {
        this.passengerbaggages = passengerbaggages;
    }

    public List<XCCtripRefRevServiceFee> getCtripRefRevServiceFee() {
        return ctripRefRevServiceFee;
    }

    public void setCtripRefRevServiceFee(List<XCCtripRefRevServiceFee> ctripRefRevServiceFee) {
        this.ctripRefRevServiceFee = ctripRefRevServiceFee;
    }

    public XCBookValueAddRequest getValueAddRequest() {
        return valueAddRequest;
    }

    public void setValueAddRequest(XCBookValueAddRequest valueAddRequest) {
        this.valueAddRequest = valueAddRequest;
    }
}
