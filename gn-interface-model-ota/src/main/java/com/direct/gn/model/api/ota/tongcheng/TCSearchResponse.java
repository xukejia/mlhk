package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

public class TCSearchResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1621972684403422730L;
	
	// A0 成功;A100 无此航线报价（如合作商不销售此航线、 no fare、 no flight、 no cabin）;A101 同程请求参数错误（如
	// username 有误，三字码不合法）;A102 请求接口频繁;A103 预订时间不在销售范围内;A104 内部程序异常;A105 其他失败原因
	private String status;
	// 提示信息，长度小于 64
	private String msg;
	// 报价信息，参考下面的 Routing Element
	private List<TCRouteVo> routings;

	public TCSearchResponse() {
	}

	public TCSearchResponse(String status, String msg) {
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

	public List<TCRouteVo> getRoutings() {
		return routings;
	}

	public void setRoutings(List<TCRouteVo> routings) {
		this.routings = routings;
	}

}
