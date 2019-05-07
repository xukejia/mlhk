package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

public class TBBaggageVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5418470936287330743L;
	
	// 行李总件数。有效值为 3、 2、 1、 0、 -2。-2 表示计重制，weight 必传。计重制生效时间请等待运营通知。
	private Integer pc;
	// 行李重量，当 allWeight 为是的时候行李重量描述所有件数的总重量，单位固定为：KG当行李总件数不为 0 时必须传。有效值为 0-50，当 pc=-2 时重量为必传项，此项生效时间请等待运营通知。
	private Integer weight;
	// 是否所有行李重量当行李总件数不为 0 时必须传。
	private Boolean isAllWeight;
	// 单件行李长度限制，单位厘米。
	private Integer length;
	// 单件行李宽度限制，单位厘米。
	private Integer width;
	// 单件行李高度限制，单位厘米。
	private Integer height;
	// 行李额适用乘客类型，0 成人/1 儿童/2
	// 婴儿对于多乘客类型的查询，必须按乘客类型返回；如成人+儿童的查询，成人和儿童的行李额都要有；如infantNumber>0,
	// 要有婴儿的退改签定义。生效时间请等待运营通知。
	private Integer passengerType;

	public Integer getPc() {
		return pc;
	}

	public void setPc(Integer pc) {
		this.pc = pc;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Boolean getIsAllWeight() {
		return isAllWeight;
	}

	public void setIsAllWeight(Boolean isAllWeight) {
		this.isAllWeight = isAllWeight;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(Integer passengerType) {
		this.passengerType = passengerType;
	}

}
