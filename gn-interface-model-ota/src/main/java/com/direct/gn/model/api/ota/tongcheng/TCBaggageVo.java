package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * Baggage Elemen
 */
public class TCBaggageVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7130537935273542590L;
	
	// 行李件数，1 表示 1PC
	private Integer baggagePieces;
	// 行李额限重1.当 isAllWeight=true 时 表示所有件数的总重量2.当 isAllWeight=false 时 表示单件限重
	private Integer baggageAllowance;
	// 是否所有行李重量
	private Boolean isAllWeight;

	public Integer getBaggagePieces() {
		return baggagePieces;
	}

	public void setBaggagePieces(Integer baggagePieces) {
		this.baggagePieces = baggagePieces;
	}

	public Integer getBaggageAllowance() {
		return baggageAllowance;
	}

	public void setBaggageAllowance(Integer baggageAllowance) {
		this.baggageAllowance = baggageAllowance;
	}

	public Boolean getIsAllWeight() {
		return isAllWeight;
	}

	public void setIsAllWeight(Boolean isAllWeight) {
		this.isAllWeight = isAllWeight;
	}

}
