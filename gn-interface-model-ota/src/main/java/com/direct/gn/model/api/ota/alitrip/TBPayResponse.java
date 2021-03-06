package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

public class TBPayResponse implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6904613454086033738L;
	private String status;              //0,成功；其他，失败
	private String msg;                  //提示信息，长度小于 64 
	private String sessionId;            //会话标识：标记服务接口调用的唯一标识，相应的调用结果中 会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private String orderNo;              //订单号，最大 100 个字符
	private String pnrCode;              //PNR 编码，最大 30 个字符 
	private TBRouteVo routing;           //报价信息，参考搜索返回结果中的 Routing Elements。
	
	private String ticketingGw="OT";//预定的GW;用IATA标准2字代码:1E:TravelSky;1A:Amadeus;1B:Abacus;1S:Sabre;1P:WorldSpan;1G:Gelileo 航司官网使用用IATA标准官网2字代码标示,如：MU:东航；OT:未知订座系统来源
	
	public TBPayResponse()
	{}
	
	public TBPayResponse(String code,String message)
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
	
	public String getTicketingGw() {
		return ticketingGw;
	}

	public void setTicketingGw(String ticketingGw) {
		this.ticketingGw = ticketingGw;
	}

	public static void main(String[] args)
	{
		TBPayResponse tbpay=new TBPayResponse();
		tbpay.setMsg("success");
		tbpay.setStatus("0");
		tbpay.setSessionId("sessionid1233435");
		tbpay.setOrderNo("order_1232323");
		tbpay.setPnrCode("scfkei");
		tbpay.setRouting(TBRouteVo.init());
		System.out.println(JSON.toJSONString(tbpay));
	}
	
	
	public static TBPayResponse getDemo()
	{
		TBPayResponse tbpay=new TBPayResponse();
		tbpay.setMsg("success");
		tbpay.setStatus("0");
		tbpay.setSessionId("sessionid1233435");
		tbpay.setOrderNo("order_1232323");
		tbpay.setPnrCode("scfkei");
		tbpay.setTicketingGw("OT");
		tbpay.setRouting(TBRouteVo.init());
		return tbpay;
	}
	
}
