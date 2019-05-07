package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * BaggageRule Element
 */
public class TCBaggageRuleVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3491885972149164696L;
	
	// 行李件数，1表示1PC
	private Integer baggagePieces;
	// 行李额限重，1表示单件限重1KG
	private Integer baggageAllowance;
	// 行李备注，仅9C资源可传；示例文案：包含可携带进客舱的手提行李仅限1件，且重量不超过5KG，体积不超过20*30*40CM；对于超出允许免费携带进入客舱行李要求的行李，按行李件数收取，单件行李不超过20KG，将按当地货币收取约为人民币700元/件的超规行李费，单件行李重量超过20KG（不含）并且在32KG（含）以内，将按当地货币收取约为人民币1400元/件的超规行李费；
	private String baggageRemark;
	// 航段序号：从1至行程总段数的数值
	private Integer segmentNum;

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

	public String getBaggageRemark() {
		return baggageRemark;
	}

	public void setBaggageRemark(String baggageRemark) {
		this.baggageRemark = baggageRemark;
	}

	public Integer getSegmentNum() {
		return segmentNum;
	}

	public void setSegmentNum(Integer segmentNum) {
		this.segmentNum = segmentNum;
	}

}
