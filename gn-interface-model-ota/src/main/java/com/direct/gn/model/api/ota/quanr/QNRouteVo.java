package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


public class QNRouteVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5974718278382176646L;
	private String data;         //可保存必要信息，之后生单按原值回转。最大 1000 个字符
	private String currency;     //1：没有该字段时，默认为 RMB：currency："" 2：有currency字段时，需输入币种所对应的合法3位字母 （currency："RMB|CNY", “USD”, “ EUR”, 或“ IDR”等，大小写 任意） 
	private Integer adultPrice;  //1：成人单价（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价 
	private Integer adultTax;    //1：成人税费（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价
	private Integer childPrice;  //1：儿童单价（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价
	private Integer childTax;    //1：儿童税费（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价 
	private Integer nationalityType = 0; //乘客国籍类型:0 全部/1 适用/2 不适用
	private String nationality;  //乘客国籍，可以为空，若输入则为国家二字码，多个用,分隔， 最多支持五个国家或地区
	private String suitAge;      //适用乘客年龄，可以为空，输入格式为 12~59，表示适用于 12~59 岁的乘客预订，年龄限制范围为 12~99，仅支持录 入一个年龄段
	private Integer priceType;  //报价类型：0 普通价 / 1 留学生价
	private Integer applyType;   //报价类型：0 预定价 / 1 申请价/2 预约
	private Integer adultTaxType; //成人税费类型：0 未含税 / 1 已含税 
    private Integer childTaxType;  //儿童税费类型：0 未含税 / 1 已含税
	private Integer ticketTimeLimit = 10080;//出票速度：[1~10080] （以分钟为单位） 
	private Integer ticketInvoiceType;//报销凭证类型：0 行程单/1 旅行发票 如果该字段没有，或者为空，默认为行程单类型
	private String seatCount;
	private QNRuleVo rule;            //退改签信息，参考 Rule Element
	private List<QNSegmentVo> fromSegments;  //去程航段按顺序，参考下面的 Segment Element 如果为多程第一程、第二程的信息，全输出到此节点。
	private List<QNSegmentVo> retSegments;   //回程航段按顺序，参考下面的 Segment Element（单程搜索 为空）
	
	private String policyId;//内部使用
	private String outData;//第三方data
	private String totalOrgPrice;//成人原始总价
	private String ext;//内部使用
	
	private String officeIdQuery;//查询OfficeID,内部使用
    private String officeIdOrder;//预订OfficeID,内部使用
    private String gwType;//GW类型,内部使用
	
	public String getGwType() {
		return gwType;
	}
	public void setGwType(String gwType) {
		this.gwType = gwType;
	}
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
	public String getOutData() {
		return outData;
	}
	public void setOutData(String outData) {
		this.outData = outData;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public String getSuitAge() {
		return suitAge;
	}
	public void setSuitAge(String suitAge) {
		this.suitAge = suitAge;
	}
	public Integer getPriceType() {
		return priceType;
	}
	public void setPriceType(Integer priceType) {
		this.priceType = priceType;
	}
	public Integer getApplyType() {
		return applyType;
	}
	public void setApplyType(Integer applyType) {
		this.applyType = applyType;
	}
	public Integer getAdultTaxType() {
		return adultTaxType;
	}
	public void setAdultTaxType(Integer adultTaxType) {
		this.adultTaxType = adultTaxType;
	}
	public Integer getChildTaxType() {
		return childTaxType;
	}
	public void setChildTaxType(Integer childTaxType) {
		this.childTaxType = childTaxType;
	}
	public Integer getTicketTimeLimit() {
		return ticketTimeLimit;
	}
	public void setTicketTimeLimit(Integer ticketTimeLimit) {
		this.ticketTimeLimit = ticketTimeLimit;
	}
	public Integer getTicketInvoiceType() {
		return ticketInvoiceType;
	}
	public void setTicketInvoiceType(Integer ticketInvoiceType) {
		this.ticketInvoiceType = ticketInvoiceType;
	}
	public QNRuleVo getRule() {
		return rule;
	}
	public void setRule(QNRuleVo rule) {
		this.rule = rule;
	}
	public List<QNSegmentVo> getFromSegments() {
		return fromSegments;
	}
	public void setFromSegments(List<QNSegmentVo> fromSegments) {
		this.fromSegments = fromSegments;
	}
	public List<QNSegmentVo> getRetSegments() {
		return retSegments;
	}
	public void setRetSegments(List<QNSegmentVo> retSegments) {
		this.retSegments = retSegments;
	}


	public static QNRouteVo init()
	{
		QNRouteVo qnroute=new QNRouteVo();
		qnroute.setData("3da0a93eba26c6e8f28955fe65f426fadbec03d9");
		qnroute.setCurrency("RMB");
		qnroute.setAdultPrice(1200);
		qnroute.setAdultTax(200);
		qnroute.setChildPrice(800);
		qnroute.setChildTax(100);
		qnroute.setNationalityType(0);
		qnroute.setTicketTimeLimit(25);
		qnroute.setTicketInvoiceType(0);
		qnroute.setPriceType(0);
		qnroute.setApplyType(0);
		qnroute.setChildTaxType(1);
		qnroute.setAdultTaxType(1);
		qnroute.setRule(QNRuleVo.init());
		List<QNSegmentVo> list=new ArrayList<QNSegmentVo>();
		list.add(QNSegmentVo.init());
		List<QNSegmentVo> list1=new ArrayList<QNSegmentVo>();
		list1.add(QNSegmentVo.init());
		
		qnroute.setFromSegments(list);
	//	qnroute.setRetSegments(list1);
		return qnroute;
	}
	 
}

