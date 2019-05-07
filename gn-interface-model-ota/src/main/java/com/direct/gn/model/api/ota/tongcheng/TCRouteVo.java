package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

/**
 * Routing Element
 */
public class TCRouteVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7169451255831149707L;

	// 可保存必要信息，之后生单按原值回转。最大 1000 个字符
	private String data;
	// 【公布运价强校验】成人公布价，不含税,当 productType=0 时必须返回，此项同程将做公布运价校验用，其他类型允许返回默认值 0
	private Integer publishPrice;
	// 成人单价，不含税【正整数】
	private Integer adultPrice;
	// 成人税费【整数，最小为 0】
	private Integer adultTax;
	// 【公布运价强校验】儿童公布价，不含税，若无法提供请返回默认值 0
	private Integer childPublishPrice;
	// 儿童公布价，不含税【成人+儿童时必须返回】，若无法提供请返回默认值 0
	private Integer childPrice;
	// 儿童税费，【成人+儿童时必须返回】，若无法提供请返回默认值 0
	private Integer childTax;
	// 报价币种，默认要返回 CNY，表示报价为人民币币种；若需使用外币币种进行报价，需提前沟通同程，否则报价将被过滤！
	private String currency = "CNY";
	// 乘客国籍类型:0.表示没有国籍限制，1.表示仅适用，2.表示不适用若无法提供请返回默认值 0
	private Integer nationalityType;
	// 乘客国籍，可以为空，若输入则为标准国家二字码，多个用,逗号‘，’分隔， 例如 CN,US；最大长度 100 个字符。 若无法提供请返回默认值’’。
	private String nationality;
	// 成人适用年龄区间，使用“-”表示“至”，例如*-12，表示 12 岁及以下；若无表示无限制，仅支持录入一个年龄段；最大长度 10 个字符,
	// 暂时不支持有年龄限制的行程。 若无法提供请返回默认值’’。
	private String adultAgeRestriction;
	// 报销凭证类型： 0 行程单/1 旅行发票,
	private Integer ticketInvoiceType;
	// 【公布运价强校验】订座系统：GW 使用 IATA 标准 2 字代码 1E：TravelSky 1A：Amadeus 1B：Abacus 1S：Sabre
	// 1P：WorldSpan 1G：Galileo航司官网使用 IATA标准航司 2字代码标示，如 MU：东航官网运价类型为 GW
	// 公布运价时，此项为必须项，其他选填。
	private String reservationType;
	// 【公布运价强校验】运价基础，每航段 1
	// 个，使用“/”分割。同程做公布运价校验用，productType=1时此处不能为空，其他产品类型时允许返回空串，不允许返回 null；最大长度100
	// 个字符
	private String fareBasis;
	// 【公布运价强校验】出票航司，整个行程只能赋一个航司；如不赋值会取行程第一航段的 carrier 作为出票航司，productType=0
	// 将做公布运价校验;
	private String validatingCarrier;
	// 出票类型(productType=4 或 productCode=2 时必传): 1:通知后出票，2:起飞前出票
	private Integer ticketType;
	// 出票时限：1-10080（以分钟为单位）(productType=4 或 productCode=2 时必传)
	private Integer ticketTimeLimit;
	// 最小出行人数【默认要返回 1】productCode=1 时，最小值为 2
	private Integer minPassengerCount;
	// 最大出行人数【默认要返回 9】
	private Integer maxPassengerCount;
	// 产品标识：0-普通产品，1-小团产品，2-极速产品，3-留学生产品，4-组合产品
	private Integer productCode;
	// 运价类型：0: GW 私有运价 1:GW 公布运价 (此场景下字段 farebasis 不能为空)2:航司官网产品
	// 3:廉价航司产品4:特价产品若无法提供请返回默认值 0
	private Integer productType;
	// 规则信息，参考 Rule Element
	private TCRuleVo rule;
	// 去程航段按顺序返回，数据结构参考下面的 Segment Element ；如果为多程第一程、第二程的信息，全输出到此节点。
	private List<TCSegmentVo> fromSegments;
	// 回程航段按顺序返回，数据结构参考下面的 Segment Element ；如果为多程第一程、第二程的信息，全输出到此节点。（单程搜索为空）
	private List<TCSegmentVo> retSegments;

	private String policyId;
	private String ext;
	private String seatCount;

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getPublishPrice() {
		return publishPrice;
	}

	public void setPublishPrice(Integer publishPrice) {
		this.publishPrice = publishPrice;
	}

	public Integer getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(Integer adultPrice) {
		this.adultPrice = adultPrice;
	}

	public Integer getAdultTax() {
		return adultTax;
	}

	public void setAdultTax(Integer adultTax) {
		this.adultTax = adultTax;
	}

	public Integer getChildPublishPrice() {
		return childPublishPrice;
	}

	public void setChildPublishPrice(Integer childPublishPrice) {
		this.childPublishPrice = childPublishPrice;
	}

	public Integer getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(Integer childPrice) {
		this.childPrice = childPrice;
	}

	public Integer getChildTax() {
		return childTax;
	}

	public void setChildTax(Integer childTax) {
		this.childTax = childTax;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getNationalityType() {
		return nationalityType;
	}

	public void setNationalityType(Integer nationalityType) {
		this.nationalityType = nationalityType;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAdultAgeRestriction() {
		return adultAgeRestriction;
	}

	public void setAdultAgeRestriction(String adultAgeRestriction) {
		this.adultAgeRestriction = adultAgeRestriction;
	}

	public Integer getTicketInvoiceType() {
		return ticketInvoiceType;
	}

	public void setTicketInvoiceType(Integer ticketInvoiceType) {
		this.ticketInvoiceType = ticketInvoiceType;
	}

	public String getReservationType() {
		return reservationType;
	}

	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}

	public String getFareBasis() {
		return fareBasis;
	}

	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

	public String getValidatingCarrier() {
		return validatingCarrier;
	}

	public void setValidatingCarrier(String validatingCarrier) {
		this.validatingCarrier = validatingCarrier;
	}

	public Integer getTicketType() {
		return ticketType;
	}

	public void setTicketType(Integer ticketType) {
		this.ticketType = ticketType;
	}

	public Integer getTicketTimeLimit() {
		return ticketTimeLimit;
	}

	public void setTicketTimeLimit(Integer ticketTimeLimit) {
		this.ticketTimeLimit = ticketTimeLimit;
	}

	public Integer getMinPassengerCount() {
		return minPassengerCount;
	}

	public void setMinPassengerCount(Integer minPassengerCount) {
		this.minPassengerCount = minPassengerCount;
	}

	public Integer getMaxPassengerCount() {
		return maxPassengerCount;
	}

	public void setMaxPassengerCount(Integer maxPassengerCount) {
		this.maxPassengerCount = maxPassengerCount;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public TCRuleVo getRule() {
		return rule;
	}

	public void setRule(TCRuleVo rule) {
		this.rule = rule;
	}

	public List<TCSegmentVo> getFromSegments() {
		return fromSegments;
	}

	public void setFromSegments(List<TCSegmentVo> fromSegments) {
		this.fromSegments = fromSegments;
	}

	public List<TCSegmentVo> getRetSegments() {
		return retSegments;
	}

	public void setRetSegments(List<TCSegmentVo> retSegments) {
		this.retSegments = retSegments;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

}
