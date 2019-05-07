package com.direct.gn.model.api.gw.order;

import java.io.Serializable;

import com.direct.gn.model.api.gw.GwOrderVo;

public class GwOrderRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -947519149375301801L;
	
	private String branchId;
	private String gwType;
	private GwOrderVo order;

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getGwType() {
		return gwType;
	}

	public void setGwType(String gwType) {
		this.gwType = gwType;
	}

	public GwOrderVo getOrder() {
		return order;
	}

	public void setOrder(GwOrderVo order) {
		this.order = order;
	}
}
