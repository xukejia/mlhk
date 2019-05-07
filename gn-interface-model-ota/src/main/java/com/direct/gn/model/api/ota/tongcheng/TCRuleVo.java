package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

/**
 * Rule Element
 */
public class TCRuleVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1312368025938550881L;

	// 退 票 规 定 ， 参 考 下 面 的 RefundInfoElement
	private List<TCRefundInfoVo> refundInfos;
	// 改签规定 ， 参 考 下 面 的 ChangeInfoElement
	private List<TCChangeInfoVo> changeInfos;
	// 行李额规定，参考下面的 BaggageInfoElement
	private TCBaggageInfoVo baggageInfo;
	// 备注信息，最大 300 字符
	private String note;

	public List<TCRefundInfoVo> getRefundInfos() {
		return refundInfos;
	}

	public void setRefundInfos(List<TCRefundInfoVo> refundInfos) {
		this.refundInfos = refundInfos;
	}

	public List<TCChangeInfoVo> getChangeInfos() {
		return changeInfos;
	}

	public void setChangeInfos(List<TCChangeInfoVo> changeInfos) {
		this.changeInfos = changeInfos;
	}

	public TCBaggageInfoVo getBaggageInfo() {
		return baggageInfo;
	}

	public void setBaggageInfo(TCBaggageInfoVo baggageInfo) {
		this.baggageInfo = baggageInfo;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
