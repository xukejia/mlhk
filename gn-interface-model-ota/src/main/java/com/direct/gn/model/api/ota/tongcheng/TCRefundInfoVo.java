package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * refundInfo Element
 */
public class TCRefundInfoVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3628314887438200879L;

	// 退票类型0：客票全部未使用；1：客票部分使用（1 仅往返程可使用）
	private Integer refundType;
	// 退票标识 T：不可退 H：有条件退 F：免费退E：退改签规则以航空公司为准；
	private String refundStatus;
	// 退票金额，当 refundStatus =H,必须赋值；如果 refundStatus =T/F,则此字段可不赋值
	private Integer refundFee;
	// 退票费币种，当 refundStatus =H，必须赋值。 IATA 标准币种编码,（目前仅限和Routing 报价币种一致）
	private String currency;
	// 乘客类型，0 成人/1 儿童
	private Integer passengerType;
	// 是否允许 NoShow 退票，T：不可退，E：按航司客规为准，H：有条件退，F：免费退
	private String refNoshow;
	// NoShow 时限，即起飞前多久算 NoShow；单位：小时 ；如不赋值则认为航班起飞时间算 NoShow 时间节点
	private Integer refNoShowConditionno;
	// NoShow 后退票费用，即算上 NoShow 罚金后的退票费用；当 NoShow=H，必须赋值
	private Integer refNoshowFee;
	// 退票备注，最长 500 个字符长度
	private String refRemark;

	public Integer getRefundType() {
		return refundType;
	}

	public void setRefundType(Integer refundType) {
		this.refundType = refundType;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public Integer getRefundFee() {
		return refundFee;
	}

	public void setRefundFee(Integer refundFee) {
		this.refundFee = refundFee;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(Integer passengerType) {
		this.passengerType = passengerType;
	}

	public String getRefNoshow() {
		return refNoshow;
	}

	public void setRefNoshow(String refNoshow) {
		this.refNoshow = refNoshow;
	}

	public Integer getRefNoShowConditionno() {
		return refNoShowConditionno;
	}

	public void setRefNoShowConditionno(Integer refNoShowConditionno) {
		this.refNoShowConditionno = refNoShowConditionno;
	}

	public Integer getRefNoshowFee() {
		return refNoshowFee;
	}

	public void setRefNoshowFee(Integer refNoshowFee) {
		this.refNoshowFee = refNoshowFee;
	}

	public String getRefRemark() {
		return refRemark;
	}

	public void setRefRemark(String refRemark) {
		this.refRemark = refRemark;
	}

}
