package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;


public class TBVerifyResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7189343322756670413L;
	private String status ;            //0,成功；其他，失败
	private String msg;                 //提示信息，长度小于64
	private String sessionId;           //会话标识：标记服务接口调用的唯一标识，相应的调用结果 中会原值返回。数字或字母，长度小于 50 个字符,且不能为 空。
	private String maxSeats ;          //可预订的座位数，最大为 9
	private TBRouteVo  routing;         //报价信息，参考搜索返回结果中的 Routing Elements。 
	private TBRuleVo rule;              //退改签信息，参考 Rule Element 
	
	
	public TBVerifyResponse()
	{}
	
	public TBVerifyResponse(String code,String message)
	{
		this.status=code;
		this.msg=message;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public String getMaxSeats() {
		return maxSeats;
	}
	public void setMaxSeats(String maxSeats) {
		this.maxSeats = maxSeats;
	}
	public TBRouteVo getRouting() {
		return routing;
	}
	public void setRouting(TBRouteVo routing) {
		this.routing = routing;
	}
	public TBRuleVo getRule() {
		return rule;
	}
	public void setRule(TBRuleVo rule) {
		this.rule = rule;
	}

	public static void main(String[] args)
	{
		TBVerifyResponse tbver=new TBVerifyResponse();
		tbver.setMsg("success");
		tbver.setStatus("0");
		tbver.setSessionId("sessionid1233435");
		tbver.setMaxSeats("9");
		tbver.setRule(TBRuleVo.init());
		tbver.setRouting(TBRouteVo.init());
		System.out.println(JSON.toJSONString(tbver));
	}
	
	public static TBVerifyResponse getDemo()
	{
		TBVerifyResponse tbver=new TBVerifyResponse();
		tbver.setMsg("success");
		tbver.setStatus("0");
		tbver.setSessionId("sessionid1233435");
		tbver.setMaxSeats("9");
		tbver.setRule(TBRuleVo.init());
		tbver.setRouting(TBRouteVo.init());
		return tbver;
	}
}
