package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;

public class QNRuleVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8008958160965548349L;
	private Integer hasRefund ; //是否允许退票：0表示不允许，1表示允许
	private String refund ;     //可输入格式如：200-72-300-48-1000-0-*，代表72小时前 退票手续费200（单位以输入的币种为准）；48小时到72 小时之间，退票手续费300（单位以输入的币种为准）； 飞机起飞不足48小时，手续费1000（单位以输入的币种为 准）；起飞后不予退票（输入*），为空表示按航司规定
	private Integer partRefund; //部分退票规则，0表示不允许，1表示允许；单程直飞为0
	private Integer partRefundPrice ;//1：部分退票费用，为空或正整数，为空表示按航司规定执 行（单位以所输入的币种为准，如：USD, EUR, 或IDR等） 2： 当currency字段输入不合法，或输入不为支付中心支 持的币种符号，该字段不返回结 
	private Integer hasEndorse ;     //是否允许改期：0表示不允许，1表示允许 
	private String endorse;          //可输入格式如：200-72-300-48-1000-0-*，代表72小时前 改期手续费200（单位以输入的币种为准）；48小时到72 小时之间，改期手续费300（单位以输入的币种为准）； 飞机起飞不足48小时，手续费1000（单位以输入的币种为 准）；起飞后不予改期（输入*），为空表示按航司规定  
	private Integer partEndorse ;    //部分改期规则，0表示不允许，1表示允许；单程直飞为0
	private Integer partEndorsePrice ;//1：部分改期费用，为空或正整数，为空表示按航司规定执 行（单位以所输入的币种为准，如：USD, EUR, 或IDR等） 2： 当currency字段输入不合法，或输入不为支付中心支 持的币种符号，该字段不返回结果
	private Integer endorsement ;    //签转规则，0表示不支持，1表示支持 
	private Integer hasBaggage ;     //是否提供免费行李额：0表示不提供，1表示提供
	private String baggage ;         //单程直飞时，样例：1-23，表示1PC，23kg；单程中转和 往返直飞录入1-23;1-23，中间用分号隔开；往返中转录入 1-23;1-23;1-23;1-23。如某段为空表示按航空公司规定执 行，如“-;-;-;-”表示四段均按航司规定执行（其中分号不可 缺少）
	private Integer hasNoShow ;      //	是否有noshow规则，0表示没有规则限制，1表示有规则限 制 
	private Integer noShowLimitTime ;//Noshow时限，输入正整数
	private Integer penalty ;        //1：Noshow罚金，可为空，若输入则为正整数。输入为空 表示按照航司规定执行（单位以所输入的币种为准，如： USD, EUR, 或IDR等） 2： 当currency字段输入不合法，或输入不为支付中心支 持的币种符号，该字段不返回结果     
	private Integer specialNoShow ;  //Noshow特殊规则：0（无） 1（Noshow时限内不允许退 票） 2（Noshow时限内不允许改期） 3（Noshow时限内 不允许退票和改期）， 
	private String other;            //其他说明，最大 300 个字符 
	public Integer getHasRefund() {
		return hasRefund;
	}
	public void setHasRefund(Integer hasRefund) {
		this.hasRefund = hasRefund;
	}
	public String getRefund() {
		return refund;
	}
	public void setRefund(String refund) {
		this.refund = refund;
	}
	public Integer getPartRefund() {
		return partRefund;
	}
	public void setPartRefund(Integer partRefund) {
		this.partRefund = partRefund;
	}
	public Integer getPartRefundPrice() {
		return partRefundPrice;
	}
	public void setPartRefundPrice(Integer partRefundPrice) {
		this.partRefundPrice = partRefundPrice;
	}
	public Integer getHasEndorse() {
		return hasEndorse;
	}
	public void setHasEndorse(Integer hasEndorse) {
		this.hasEndorse = hasEndorse;
	}
	public String getEndorse() {
		return endorse;
	}
	public void setEndorse(String endorse) {
		this.endorse = endorse;
	}
	public Integer getPartEndorse() {
		return partEndorse;
	}
	public void setPartEndorse(Integer partEndorse) {
		this.partEndorse = partEndorse;
	}
	public Integer getPartEndorsePrice() {
		return partEndorsePrice;
	}
	public void setPartEndorsePrice(Integer partEndorsePrice) {
		this.partEndorsePrice = partEndorsePrice;
	}
	public Integer getEndorsement() {
		return endorsement;
	}
	public void setEndorsement(Integer endorsement) {
		this.endorsement = endorsement;
	}
	public Integer getHasBaggage() {
		return hasBaggage;
	}
	public void setHasBaggage(Integer hasBaggage) {
		this.hasBaggage = hasBaggage;
	}
	public String getBaggage() {
		return baggage;
	}
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}
	public Integer getHasNoShow() {
		return hasNoShow;
	}
	public void setHasNoShow(Integer hasNoShow) {
		this.hasNoShow = hasNoShow;
	}
	public Integer getNoShowLimitTime() {
		return noShowLimitTime;
	}
	public void setNoShowLimitTime(Integer noShowLimitTime) {
		this.noShowLimitTime = noShowLimitTime;
	}
	public Integer getPenalty() {
		return penalty;
	}
	public void setPenalty(Integer penalty) {
		this.penalty = penalty;
	}
	public Integer getSpecialNoShow() {
		return specialNoShow;
	}
	public void setSpecialNoShow(Integer specialNoShow) {
		this.specialNoShow = specialNoShow;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}


	public static QNRuleVo init()
	{
		QNRuleVo qnrule=new QNRuleVo();
		qnrule.setHasRefund(1);
		qnrule.setRefund("200-72-300-48-1000-0-*");
		qnrule.setPartRefund(1);
		qnrule.setPartRefundPrice(500);
		qnrule.setHasEndorse(1);
		qnrule.setEndorse("200-72-300-48-1000-*");
		qnrule.setPartEndorse(1);
		qnrule.setPartEndorsePrice(500);
		qnrule.setEndorsement(0);
		qnrule.setHasBaggage(0);
		qnrule.setBaggage("1-23;2-30");
		qnrule.setHasNoShow(1);
		qnrule.setNoShowLimitTime(48);
		qnrule.setPenalty(900);
		qnrule.setSpecialNoShow(0);
		qnrule.setOther("退改签需要提前三个工作日联系客服");
		return qnrule;
		
		
		
		
		
		
		
		
		
		
		
	}
}
