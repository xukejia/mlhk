package com.direct.gn.model.api.request;

import java.io.Serializable;

public class CommParamRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long timestamp;

	private String json;// domain参数

	private String sgn;// MD5(json+user+jmkey+serviceName+当天日期)

	private String serviceName;// 服务名称

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getSgn() {
		return sgn;
	}

	public void setSgn(String sgn) {
		this.sgn = sgn;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
