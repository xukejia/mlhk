package com.direct.gn.model.api.cp;

import java.io.Serializable;

public class CpDataResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7053861076544684235L;
	private String status; // 0,成功；其他，失败
	private String msg; // 提示信息，长度小于64

	public CpDataResponse(String status, String msg) {
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
}
