package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class TBRouteVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3203901531933216677L;
	private String data;         //可保存必要信息，之后生单按原值回转。最大 1000 个字符 
	private String adultPrice;  //1：成人单价（以元为单位） 
	private String adultTax;    //1：成人税费（以元为单位）
	private String childPrice;  //1：儿童单价（以元为单位）
	private String childTax;    //1：儿童税费（以元为单位） 
    private String priceType;  //报价类型：0 普通价 / 1 留学生价
	private String applyType;   //报价类型：0 预定价 / 1 申请价/2 预约
	private String adultTaxType; //成人税费类型：0 未含税 / 1 已含税 
    private String childTaxType;  //儿童税费类型：0 未含税 / 1 已含税
	private TBRuleVo rule;            //退改签信息，参考 Rule Element 
	private String seatCount;
	private List<TBSegmentVo> fromSegments;  //去程航段按顺序，参考下面的 Segment Element 如果为多程第一程、第二程的信息，全输出到此节点。
	private List<TBSegmentVo> retSegments;   //回程航段按顺序，参考下面的 Segment Element（单程搜索 为空）
	
	private String nationalityType="0";//乘客国籍类型：0全部/1适用/2不适用
	private String nationality;//乘客国籍，可以为空，国家二字码
	private String suitAge;//适用乘客年龄，为空表示无限制，12-59表示12到59岁乘客可以预定
	private String minPassengerCount;//最小出行人数，无返回，默认为1
	private String maxPassengerCount;//最大出行人数，无返回，默认为9
	private String gvChildRule;//0表示儿童不算/1表示1个儿童算1个人/2-表示2个儿童算1个人
	
	private String outData;//第三方data
	private String policyId;//内部使用
	private String ext;//内部使用
	private String totalOrgPrice;//成人原始总价
	
	//1：该字段为空时，默认为 CNY 2：有 currency 字段时，需输入币种所对应的合法 3位字母（currency："CNY", “USD”, “ EUR”等，大小写任意），3：一次报价只允许返回一个 currency4：平台 shopping 报价统一为人民币报价，若提供非人民币报价，平台会使用统一汇率进行转换5：退改签中的非 CNY 报价平台不会进行统一转换生效时间请等待运营通知 
	private String currency = "CNY";
	//婴儿单价（以 CNY 为单位）；当 infantNumber>0 时必传；生效时间请等待运营通知。 
	private String infantPrice;
	//婴儿税费（以 CNY 为单位）当 infantNumber>0 时必传；生效时间请等待运营通知。 
	private String infantTax;
	//拼接定义为非运价直连报价，由商家自行组合的非联运航班组合，如：全服务+LCC0：表示非拼接报价 1：表示拼接报价生效时间请等待运营通知。生效之后，若商家提供的报价为拼接组合报价，则该字段必须为 1，否则由于过境签、行李直挂等拼接产品造成的特殊由商家自行承担责任 
	private String isCombine;
	//带乘客类型的退改签信息，参考 Rule Element生效时间请等待运营通知。 
	private List<TBRuleVo> rules;
	//行程单类型：3: 境外电子凭证 5:旅行发票 7:差额行程单发票 9:等额行程单。不传默认是 3: 境外电子凭证 
	private String invoiceType = "3";
	//公布运价集群码，只可填写数字和英文字符，不支持特殊字符
	private String taiff;
	//是否要使用飞猪平台退改签1：使用；0：不使用默认为不使用平台退改签，不传或者传其他值等同 0。当值为 1：优先使用平台退改签， fareFrom 和fareBasis 必传；平台无对应对改签则使用商家自定义的，参考值为 0 的逻辑。当值为 0：将根据 isAirFareRule 判别是否解析 rule，rules。生效时间请等待运营通知。 
	private String isUseFliggyRule = "0";
	//公布运价：PUB，私有运价：PRI，默认为公布运价，不传或者传其他值等同 PUB生效时间请等待运营通知。 
	private String fareFrom;
	//是否在搜索环节提供退改签，默认为在搜索环节提供退改签0：在搜索环节提供退改签。 必须有 rule 或 rules 节点，必须是符合规范的退改签数据。1：在 verify 环节提供退改签。 在搜索接口不解析rule 和 rules 节点不传或者传其他值等同 0。生效时间请等待运营通知。生效之后，商家可以选择在搜索或验价环节提供退改签，若选择在搜索环节提供退改签则保持现有流程不变，若选择在 verify 环节提供退改签则搜索环节展示平台默认退改签文案，并在 verify 接口返回报价，若verify 接口中无退改签信息，则会算作验价失败 
	private String isAirFareRule = "0";
	
	private String officeIdQuery;//查询OfficeID,内部使用
    private String officeIdOrder;//预订OfficeID,内部使用
    private String gwType;//GW类型,内部使用
	
	public String getOfficeIdQuery() {
		return officeIdQuery;
	}
	public void setOfficeIdQuery(String officeIdQuery) {
		this.officeIdQuery = officeIdQuery;
	}
	public String getOfficeIdOrder() {
		return officeIdOrder;
	}
	public void setOfficeIdOrder(String officeIdOrder) {
		this.officeIdOrder = officeIdOrder;
	}
	public String getGwType() {
		return gwType;
	}
	public void setGwType(String gwType) {
		this.gwType = gwType;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getInfantPrice() {
		return infantPrice;
	}
	public void setInfantPrice(String infantPrice) {
		this.infantPrice = infantPrice;
	}
	public String getInfantTax() {
		return infantTax;
	}
	public void setInfantTax(String infantTax) {
		this.infantTax = infantTax;
	}
	public String getIsCombine() {
		return isCombine;
	}
	public void setIsCombine(String isCombine) {
		this.isCombine = isCombine;
	}
	public List<TBRuleVo> getRules() {
		return rules;
	}
	public void setRules(List<TBRuleVo> rules) {
		this.rules = rules;
	}
	public String getInvoiceType() {
		return invoiceType;
	}
	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}
	public String getTaiff() {
		return taiff;
	}
	public void setTaiff(String taiff) {
		this.taiff = taiff;
	}
	public String getIsUseFliggyRule() {
		return isUseFliggyRule;
	}
	public void setIsUseFliggyRule(String isUseFliggyRule) {
		this.isUseFliggyRule = isUseFliggyRule;
	}
	public String getFareFrom() {
		return fareFrom;
	}
	public void setFareFrom(String fareFrom) {
		this.fareFrom = fareFrom;
	}
	public String getIsAirFareRule() {
		return isAirFareRule;
	}
	public void setIsAirFareRule(String isAirFareRule) {
		this.isAirFareRule = isAirFareRule;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	public String getTotalOrgPrice() {
		return totalOrgPrice;
	}
	public void setTotalOrgPrice(String totalOrgPrice) {
		this.totalOrgPrice = totalOrgPrice;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
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
	public String getAdultPrice() {
		return adultPrice;
	}
	public void setAdultPrice(String adultPrice) {
		this.adultPrice = adultPrice;
	}
	public String getAdultTax() {
		return adultTax;
	}
	public void setAdultTax(String adultTax) {
		this.adultTax = adultTax;
	}
	public String getChildPrice() {
		return childPrice;
	}
	public void setChildPrice(String childPrice) {
		this.childPrice = childPrice;
	}
	public String getChildTax() {
		return childTax;
	}
	public void setChildTax(String childTax) {
		this.childTax = childTax;
	}
	public String getPriceType() {
		return priceType;
	}
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	public String getApplyType() {
		return applyType;
	}
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}
	public String getAdultTaxType() {
		return adultTaxType;
	}
	public void setAdultTaxType(String adultTaxType) {
		this.adultTaxType = adultTaxType;
	}
	public String getChildTaxType() {
		return childTaxType;
	}
	public void setChildTaxType(String childTaxType) {
		this.childTaxType = childTaxType;
	}
	public TBRuleVo getRule() {
		return rule;
	}
	public void setRule(TBRuleVo rule) {
		this.rule = rule;
	}
	public List<TBSegmentVo> getFromSegments() {
		return fromSegments;
	}
	public void setFromSegments(List<TBSegmentVo> fromSegments) {
		this.fromSegments = fromSegments;
	}
	public List<TBSegmentVo> getRetSegments() {
		return retSegments;
	}
	public void setRetSegments(List<TBSegmentVo> retSegments) {
		this.retSegments = retSegments;
	}
	public String getNationalityType() {
		return nationalityType;
	}
	public void setNationalityType(String nationalityType) {
		this.nationalityType = nationalityType;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getSuitAge() {
		return suitAge;
	}
	public void setSuitAge(String suitAge) {
		this.suitAge = suitAge;
	}
	public String getMinPassengerCount() {
		return minPassengerCount;
	}
	public void setMinPassengerCount(String minPassengerCount) {
		this.minPassengerCount = minPassengerCount;
	}
	public String getMaxPassengerCount() {
		return maxPassengerCount;
	}
	public void setMaxPassengerCount(String maxPassengerCount) {
		this.maxPassengerCount = maxPassengerCount;
	}
	public String getGvChildRule() {
		return gvChildRule;
	}
	public void setGvChildRule(String gvChildRule) {
		this.gvChildRule = gvChildRule;
	}
	
	public String getOutData() {
		return outData;
	}
	public void setOutData(String outData) {
		this.outData = outData;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
	
	public static TBRouteVo init()
	{
		TBRouteVo tbroute=new TBRouteVo();
		tbroute.setData("3da0a93eba26c6e8f28955fe65f426fadbec03d9");
		tbroute.setAdultPrice("1200");
		tbroute.setAdultTax("200");
		tbroute.setChildPrice("800");
		tbroute.setChildTax("100");
		tbroute.setPriceType("0");
		tbroute.setApplyType("0");
		tbroute.setChildTaxType("1");
		tbroute.setAdultTaxType("1");
		tbroute.setRule(TBRuleVo.init());
		List<TBSegmentVo> list=new ArrayList<TBSegmentVo>();
		list.add(TBSegmentVo.init());
		List<TBSegmentVo> list1=new ArrayList<TBSegmentVo>();
		list1.add(TBSegmentVo.init());
		
		tbroute.setFromSegments(list);
		tbroute.setRetSegments(list1);
		
		tbroute.setNationalityType("0");
		tbroute.setNationality("");
		tbroute.setSuitAge("");
		tbroute.setMinPassengerCount("");
		tbroute.setMaxPassengerCount("");
		tbroute.setGvChildRule("0");
	
		return tbroute;
	}
	
	 
}
