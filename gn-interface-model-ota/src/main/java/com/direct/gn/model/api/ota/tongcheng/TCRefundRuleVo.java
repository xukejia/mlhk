package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * RefundRule Element
 */
public class TCRefundRuleVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4699833116274358383L;

	// 是否可退 true 可以，false 不可以
	private Boolean canRefund;
	// 是否可单独退 true 可以，false 不可以 当 canRefund=true 时此节点必传
	private Boolean canRefundIndependent;
	// 退规则,最多允许 200 个字符。
	private String refundRule;
	// 是否可改 true 可以，false 不可以
	private Boolean canModify;
	// 是否可单独改 true 可以，false 不可以 当 canModify=true 时此节点必传
	private Boolean canModifyIndependent;
	// 改规则,最多允许 200 个字符。
	private String modifyRule;

	public Boolean getCanRefund() {
		return canRefund;
	}

	public void setCanRefund(Boolean canRefund) {
		this.canRefund = canRefund;
	}

	public Boolean getCanRefundIndependent() {
		return canRefundIndependent;
	}

	public void setCanRefundIndependent(Boolean canRefundIndependent) {
		this.canRefundIndependent = canRefundIndependent;
	}

	public String getRefundRule() {
		return refundRule;
	}

	public void setRefundRule(String refundRule) {
		this.refundRule = refundRule;
	}

	public Boolean getCanModify() {
		return canModify;
	}

	public void setCanModify(Boolean canModify) {
		this.canModify = canModify;
	}

	public Boolean getCanModifyIndependent() {
		return canModifyIndependent;
	}

	public void setCanModifyIndependent(Boolean canModifyIndependent) {
		this.canModifyIndependent = canModifyIndependent;
	}

	public String getModifyRule() {
		return modifyRule;
	}

	public void setModifyRule(String modifyRule) {
		this.modifyRule = modifyRule;
	}

}
