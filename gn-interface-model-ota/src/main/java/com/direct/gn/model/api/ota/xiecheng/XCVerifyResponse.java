package com.direct.gn.model.api.ota.xiecheng;

import com.alibaba.fastjson.JSON;
import com.direct.gn.model.api.ota.quanr.QNRouteVo;
import com.direct.gn.model.api.ota.quanr.QNRuleVo;

import java.io.Serializable;

public class XCVerifyResponse implements Serializable{

	private Integer status ;            //0,成功；其他，失败
	private String msg;                 //提示信息，长度小于64
	private String sessionId;           //会话标识：标记服务接口调用的唯一标识，相应的调用结果 中会原值返回。数字或字母，长度小于 50 个字符,且不能为 空。
	private Integer maxSeats;          //可预订的座位数，最大为 9
	private XCRouteVo routing;         //报价信息，参考搜索返回结果中的 Routing Elements。
	private XCRuleVo rule;              //退改签信息，参考 Rule Element

	public XCVerifyResponse()
	{}

	public XCVerifyResponse(Integer code, String message)
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

	public XCRuleVo getRule() {
		return rule;
	}

	public void setRule(XCRuleVo rule) {
		this.rule = rule;
	}

	public static void main(String[] args)
	{
		XCVerifyResponse qnver=new XCVerifyResponse();
		qnver.setMsg("success");
		qnver.setStatus(0);
		qnver.setSessionId("sessionid1233435");
		qnver.setMaxSeats(9);
		System.out.println(JSON.toJSONString(qnver));
	}
	
	public static XCVerifyResponse getDemo()
	{
		XCVerifyResponse qnver=new XCVerifyResponse();
		qnver.setMsg("success");
		qnver.setStatus(0);
		qnver.setSessionId("sessionid1233435");
		qnver.setMaxSeats(9);
		return qnver;
	}
}
