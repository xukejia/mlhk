package com.direct.gn.model.api.gw.order;

import java.io.Serializable;

public class GwOrderResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2409258227496103544L;
	private String status;
	private String msg;
	private String pnr;

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

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
}
