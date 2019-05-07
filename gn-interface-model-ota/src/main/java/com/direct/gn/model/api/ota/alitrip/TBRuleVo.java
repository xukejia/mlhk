package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

public class TBRuleVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2988807981849079994L;
	private String refund ;     //退票规定，最⼤大 300 个字符 ，输入格式：10%-72-30%-48-50%-0-*
	private String endorse ;    //改签规定，最⼤大 300 个字符 ，输入格式：10%-72-30%-48-50%-0-*
	private String baggage ;    //行李额规定，最⼤大 300 个字符
	private String other ;      //其他说明，最⼤大 300 个字符
	
	private String hasRefund;//是否允许退票，0不允许，1允许
	private String refundCurrency;//退票费使用的货币单位，CNY是人民币；为空默认为CNY（非必须）
	private String partRefund="0";//是否允许部分未使用退票，0不允许，1允许；单程直飞为0
	private String partRefundCurrency;//部分退票费使用的货币单位，为空默认为CNY（非必须）
	private String partRefundPrice;//部分未使用退票费用（partRefund=1必填）（非必须）
	private String partRefundSeg;//部分未使用退票费用按每个航段收还是全程收；ALL全程（默认），EACH每个航段；（非必须）
	private String hasEndorse;//是否允许改期，0不允许，1允许
	private String endorseCurrency;//改期使用的货币单位，CNY是人民币；为空默认为CNY（非必须）
	private String partEndorse="0";//是否允许部分改期，0不允许，1允许；单程直飞为0；当为往返时表示返程是否允许
	private String partEndorseCurrency;//部分改期使用的货币单位，为空默认为CNY（非必须）
	private String partEndorsePrice;//部分改期费用（非必须）
	private String endorsement="0";//是否支持签转，0不支持，1支持
	private String hasBaggage;//是否提供免费行李额，0不提供，1提供
	private String hasNoShow="0";//是否有noshow规则，0没有，1有
	private String noShowLimitTime="1";//noshow时限，输入正整数，单位小时
	private String noShowCurrency;//货币单位，为空默认为CNY（非必须）
	private String penalty="100%";//noshow罚金，输入正整数或百分比
	private String specialNoShow="3";//noshow特殊规则，0无，1 noshow时限内不允许退票，2 noshow时限内不允许改期，3 noshow时限内不允许退票和改期
	
	//全程未使用，退税规定，同 refund；非必填refundTax 和 refund 的金额节点允许不同（即退税使用绝对值，退票使用百分比）； refundTax 与refund 的时间节点需保持一致；若存在多个乘机人类型的时候，多个 refundtax 的时间节点需保持一致生效时间请等待运营通知。 
	private String refundTax;
	//部分未使用，退税规定，同 refund；非必填PartRefundTax 和 PartRefundPrice 的金额节点允许不同（即退税使用绝对值，退票使用百分比）；PartRefundTax 与 PartRefundPrice 的时间节点需保持一致；若存在多个乘机人类型的时候，多个PartRefundTax 的时间节点需保持一致生效时间请等待运营通知。 
	private String partRefundTax;
	//退改签适用乘客类型，0 成人/1 儿童/2 婴儿。对于多乘客类型的查询、验价，必须按乘客类型返回；如成人+儿童的查询，成人和儿童的退改签都要有；如 infantNumber>0, 要有婴儿的退改签定义。生效时间请等待运营通知。 
	private String passengerType;
	
	public String getRefundTax() {
		return refundTax;
	}
	public void setRefundTax(String refundTax) {
		this.refundTax = refundTax;
	}
	public String getPartRefundTax() {
		return partRefundTax;
	}
	public void setPartRefundTax(String partRefundTax) {
		this.partRefundTax = partRefundTax;
	}
	public String getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
	public String getRefund() {
		return refund;
	}
	public void setRefund(String refund) {
		this.refund = refund;
	}
	public String getEndorse() {
		return endorse;
	}
	public void setEndorse(String endorse) {
		this.endorse = endorse;
	}
	public String getBaggage() {
		return baggage;
	}
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getHasRefund() {
		return hasRefund;
	}
	public void setHasRefund(String hasRefund) {
		this.hasRefund = hasRefund;
	}
	public String getRefundCurrency() {
		return refundCurrency;
	}
	public void setRefundCurrency(String refundCurrency) {
		this.refundCurrency = refundCurrency;
	}
	public String getPartRefund() {
		return partRefund;
	}
	public void setPartRefund(String partRefund) {
		this.partRefund = partRefund;
	}
	public String getPartRefundCurrency() {
		return partRefundCurrency;
	}
	public void setPartRefundCurrency(String partRefundCurrency) {
		this.partRefundCurrency = partRefundCurrency;
	}
	public String getPartRefundPrice() {
		return partRefundPrice;
	}
	public void setPartRefundPrice(String partRefundPrice) {
		this.partRefundPrice = partRefundPrice;
	}
	public String getPartRefundSeg() {
		return partRefundSeg;
	}
	public void setPartRefundSeg(String partRefundSeg) {
		this.partRefundSeg = partRefundSeg;
	}
	public String getHasEndorse() {
		return hasEndorse;
	}
	public void setHasEndorse(String hasEndorse) {
		this.hasEndorse = hasEndorse;
	}
	public String getEndorseCurrency() {
		return endorseCurrency;
	}
	public void setEndorseCurrency(String endorseCurrency) {
		this.endorseCurrency = endorseCurrency;
	}
	public String getPartEndorse() {
		return partEndorse;
	}
	public void setPartEndorse(String partEndorse) {
		this.partEndorse = partEndorse;
	}
	public String getPartEndorseCurrency() {
		return partEndorseCurrency;
	}
	public void setPartEndorseCurrency(String partEndorseCurrency) {
		this.partEndorseCurrency = partEndorseCurrency;
	}
	public String getPartEndorsePrice() {
		return partEndorsePrice;
	}
	public void setPartEndorsePrice(String partEndorsePrice) {
		this.partEndorsePrice = partEndorsePrice;
	}
	public String getEndorsement() {
		return endorsement;
	}
	public void setEndorsement(String endorsement) {
		this.endorsement = endorsement;
	}
	public String getHasBaggage() {
		return hasBaggage;
	}
	public void setHasBaggage(String hasBaggage) {
		this.hasBaggage = hasBaggage;
	}
	public String getHasNoShow() {
		return hasNoShow;
	}
	public void setHasNoShow(String hasNoShow) {
		this.hasNoShow = hasNoShow;
	}
	public String getNoShowLimitTime() {
		return noShowLimitTime;
	}
	public void setNoShowLimitTime(String noShowLimitTime) {
		this.noShowLimitTime = noShowLimitTime;
	}
	public String getNoShowCurrency() {
		return noShowCurrency;
	}
	public void setNoShowCurrency(String noShowCurrency) {
		this.noShowCurrency = noShowCurrency;
	}
	public String getPenalty() {
		return penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public String getSpecialNoShow() {
		return specialNoShow;
	}
	public void setSpecialNoShow(String specialNoShow) {
		this.specialNoShow = specialNoShow;
	}
	
	public static TBRuleVo init()
	{
		TBRuleVo tbrule=new TBRuleVo();
		tbrule.setBaggage("根据境外系统出票为准");
		tbrule.setEndorse("改签费用:rmb:220");
		tbrule.setRefund("退票费用：rmb:2000");
		tbrule.setEndorse("*-72-*-48-*-0-*");
		tbrule.setRefund("*-72-*-48-*-0-*");
		tbrule.setOther("退改签需要提前三个工作日联系客服");
		
		tbrule.setHasRefund("0");
		tbrule.setRefundCurrency("CNY");
		tbrule.setPartRefund("0");
		tbrule.setPartRefundCurrency("CNY");
//		tbrule.setPartRefundPrice("");
		tbrule.setPartRefundSeg("ALL");
		tbrule.setHasEndorse("0");
		tbrule.setEndorseCurrency("CNY");
		tbrule.setPartEndorse("0");
		tbrule.setPartEndorseCurrency("CNY");
//		tbrule.setPartEndorsePrice("");
		tbrule.setEndorsement("0");
		tbrule.setHasBaggage("0");
		tbrule.setHasNoShow("0");
		tbrule.setNoShowLimitTime("1");//这个要考虑是啥
		tbrule.setNoShowCurrency("CNY");
		tbrule.setPenalty("100%");
		tbrule.setSpecialNoShow("3");
		
		return tbrule;
	}
	
}
