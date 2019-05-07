package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;


public class QNPayResponse implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3234116317513303953L;
	private Integer status;              //0,成功；其他，失败
	private String msg;                  //提示信息，长度小于 64 
	private String sessionId;            //会话标识：标记服务接口调用的唯一标识，相应的调用结果中 会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private String orderNo;              //订单号，最大 100 个字符
	private String pnrCode;              //PNR 编码，最大 30 个字符 
	private QNRouteVo routing;           //报价信息，参考搜索返回结果中的 Routing Elements。
	private String currency;             //1：没有该字段时，默认为 RMB：currency："" 2：有currency字段时，需输入币种所对应的合法3位字母 （currency："RMB|CNY", “USD”, “ EUR”, 或“ IDR”等，大小 写任意）
	
	public QNPayResponse()
	{}
	
	public QNPayResponse(Integer code,String message)
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
	public QNRouteVo getRouting() {
		return routing;
	}
	public void setRouting(QNRouteVo routing) {
		this.routing = routing;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	

	public static void main(String[] args)
	{
		QNPayResponse qnpay=new QNPayResponse();
		qnpay.setMsg("success");
		qnpay.setStatus(0);
		qnpay.setSessionId("sessionid1233435");
		qnpay.setOrderNo("order_1232323");
		qnpay.setPnrCode("scfkei");
		qnpay.setRouting(QNRouteVo.init());
		System.out.println(JSON.toJSONString(qnpay));
	}
	
	public static QNPayResponse getDemo()
	{
		QNPayResponse qnpay=new QNPayResponse();
		qnpay.setMsg("success");
		qnpay.setStatus(0);
		qnpay.setSessionId("sessionid1233435");
		qnpay.setOrderNo("order_1232323");
		qnpay.setPnrCode("scfkei");
		qnpay.setRouting(QNRouteVo.init());
		return qnpay;
	}
}
