package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

public class TCVerifyResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1737690473610042814L;

	// B0 成功B100 舱位已售完B101 余位不足B102 价格校验失败（如 QTE 无结果、 no fare、no flight）B103
	// 请求接口频繁B104 内部程序异常 B105 其他失败原因
	private String status;
	// 提示信息，长度小于 64
	private String msg;
	// 会话标识：标记服务接口调用的唯一标识，相应的调用结果中会原值返回。数字或字母，长度小于 50 个字符,且不能为空。
	private String sessionId;
	// 报价信息，参考搜索返回结果中的 RoutingElement
	private TCRouteVo routing;
	// 规则信息，参考搜索返回结果中的 Rule Elemen
	private TCRuleVo rule;

	public TCVerifyResponse() {
		super();
	}

	public TCVerifyResponse(String status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
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

	public TCRouteVo getRouting() {
		return routing;
	}

	public void setRouting(TCRouteVo routing) {
		this.routing = routing;
	}

	public TCRuleVo getRule() {
		return rule;
	}

	public void setRule(TCRuleVo rule) {
		this.rule = rule;
	}

}
