package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

/**
 * BaggageInfo Element
 */
public class TCBaggageInfoVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -684018526699360295L;

	// 是否提供免费行李额：0表示不提供，1表示提供；当hasBaggage=0时，baggageRule要求必须返回空数组
	private Integer hasBaggage;
	// "baggagePieces":1"baggageAllowance":23"segmentNum":1表示A-B时，共1件，每件23KG；1.多段行程时，需按照航段顺序返回多个对象2."baggagePieces":0"baggageAllowance":Y(Y>0)当baggageAllowance>0但是baggagePieces=0时表示行李件数不限，但总重量不超过Y公斤。3."baggagePieces":Y(Y>0)"baggageAllowance":0当baggagePieces>0但是baggageAllowance=0,表示总共Y件4.baggagePieces":0"baggageAllowance":0表示该段无免费行李额
	private List<TCBaggageRuleVo> baggageRules;

	public Integer getHasBaggage() {
		return hasBaggage;
	}

	public void setHasBaggage(Integer hasBaggage) {
		this.hasBaggage = hasBaggage;
	}

	public List<TCBaggageRuleVo> getBaggageRules() {
		return baggageRules;
	}

	public void setBaggageRules(List<TCBaggageRuleVo> baggageRules) {
		this.baggageRules = baggageRules;
	}

}
