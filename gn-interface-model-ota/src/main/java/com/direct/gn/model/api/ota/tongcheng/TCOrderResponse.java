package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

public class TCOrderResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9197175041686431630L;

	// C0 成功 C100 舱位已售完 C101 余位不足 C103 特殊产品预订限制 C104 同程请求参数错误 C105 请求接口频繁 C106
	// 内部程序异常 C107 其他失败原因
	private String status;
	// 提示信息，长度小于 64
	private String msg;
	// 会话标识：标记服务接口调用的唯一标识，相应的调用结果中会原值返回。数字或字母，长度小于 50 个字符，且不能为空。
	private String sessionId;
	// 三方订单号，最大 100 个字符(待出票订单捞取时会返回)
	private String orderNo;
	// PNR 编码，最大 30 个字符
	private String pnrCode;
	// 报价信息，参考搜索返回结果中的 RoutingElements。
	private TCRouteVo routing;
	// 增值服务预定结果，参考下单请求报文的AuxOrderResult Element ；1.当下单请求时存在增值服务商品，此节点必须返回；
	// 2.若不返回平台判定为，增值服务商品下单失败； 3.一种增值服务商品返回一个结果；一种增值服务商品返回多个结果，平台判断为增值服务商品下单失败
	// 4.机票下单失败，平台则自动判定增值服务商品也下单失败，不再关心增值服务商品下单结果。
	private List<TCAuxOrderResultVo> auxOrderResult;

	public TCOrderResponse(String status, String msg) {
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

	public TCRouteVo getRouting() {
		return routing;
	}

	public void setRouting(TCRouteVo routing) {
		this.routing = routing;
	}

	public List<TCAuxOrderResultVo> getAuxOrderResult() {
		return auxOrderResult;
	}

	public void setAuxOrderResult(List<TCAuxOrderResultVo> auxOrderResult) {
		this.auxOrderResult = auxOrderResult;
	}

}
