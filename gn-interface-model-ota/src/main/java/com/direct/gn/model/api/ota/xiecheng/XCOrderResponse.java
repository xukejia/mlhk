package com.direct.gn.model.api.ota.xiecheng;

import com.alibaba.fastjson.JSON;
import com.direct.gn.model.api.ota.quanr.QNRouteVo;

import java.io.Serializable;
import java.util.List;


public class XCOrderResponse implements Serializable{
	private Integer status;              //0,成功；其他，失败
	private String msg;                  //提示信息，长度小于 64
	private String sessionId;            //会话标识：标记服务接口调用的唯一标识，相应的调用结果中 会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private String orderNo;              //订单号，最大 100 个字符
	private String pnrCode;              //PNR 编码，最大 30 个字符
	private Integer maxSeats;            //可预订的座位数，最大为 9
	private XCRouteVo routing;           //报价信息，参考搜索返回结果中的 Routing Elements。
	private String currency;             //1：没有该字段时，默认为 RMB：currency："" 2：有currency字段时，需输入币种所对应的合法3位字母 （currency："RMB|CNY", “USD”, “ EUR”, 或“ IDR”等，大小 写任意）
	private XCContactVo orderContact;    // 订位联系人信息，参考生单请求中的 Contact Element，需返回预订机票时所用邮箱及联系方式。【廉航票台必须返回】
	private List<XCPassengerBaggage> passengerbaggages; // 乘机人预订行李信息参考PassengerBaggage Element
	private XCBookValueAddResult valueAddResult; // 增值服务预定结果，参考下面的 BookValueAddResult Element 【JSON示例未添加此项】


	public XCOrderResponse()
	{}
	public XCOrderResponse(Integer code, String message)
	{
		this.status=code;
		this.msg=message;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
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
	public Integer getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(Integer maxSeats) {
		this.maxSeats = maxSeats;
	}
	public XCRouteVo getRouting() {
		return routing;
	}
	public void setRouting(XCRouteVo routing) {
		this.routing = routing;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public XCContactVo getOrderContact() {
		return orderContact;
	}

	public void setOrderContact(XCContactVo orderContact) {
		this.orderContact = orderContact;
	}

	public List<XCPassengerBaggage> getPassengerbaggages() {
		return passengerbaggages;
	}

	public void setPassengerbaggages(List<XCPassengerBaggage> passengerbaggages) {
		this.passengerbaggages = passengerbaggages;
	}

	public XCBookValueAddResult getValueAddResult() {
		return valueAddResult;
	}

	public void setValueAddResult(XCBookValueAddResult valueAddResult) {
		this.valueAddResult = valueAddResult;
	}

	public static void main(String[] args)
	{
		XCOrderResponse qnord=new XCOrderResponse();
		qnord.setMsg("success");
		qnord.setStatus(0);
		qnord.setSessionId("sessionid1233435");
		qnord.setMaxSeats(9);
		qnord.setOrderNo("order_1232323");
		qnord.setPnrCode("scfkei");
		qnord.setRouting(XCRouteVo.init());
		System.out.println(JSON.toJSONString(qnord));
	}
	
	public static XCOrderResponse getDemo()
	{
		XCOrderResponse qnord=new XCOrderResponse();
		qnord.setMsg("success");
		qnord.setStatus(0);
		qnord.setSessionId("sessionid1233435");
		qnord.setMaxSeats(9);
		qnord.setOrderNo("order_1232323");
		qnord.setPnrCode("scfkei");
		qnord.setRouting(XCRouteVo.init());
		return qnord;
	}
	
}
