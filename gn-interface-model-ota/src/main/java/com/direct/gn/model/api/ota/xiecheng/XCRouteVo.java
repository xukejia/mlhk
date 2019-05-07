package com.direct.gn.model.api.ota.xiecheng;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class XCRouteVo implements Serializable {

    private String data;         //可保存必要信息，之后生单按原值回转。最大 1000 个字符
    private String seatCount;
    private XCRuleVo rule;            //退改签信息，参考 Rule Element
    private List<XCSegmentVo> fromSegments;  //去程航段按顺序，参考下面的 Segment Element 如果为多程第一程、第二程的信息，全输出到此节点。
    private List<XCSegmentVo> retSegments;   //回程航段按顺序，参考下面的 Segment Element（单程搜索 为空）
    private String policyId;//内部使用
    private String ext;//内部使用
    private String outData;//第三方data
    private Integer adultPrice;  //1：成人单价（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价
    private Integer priceType;  //报价类型：0 普通价 / 1 留学生价
    private Integer applyType;   //报价类型：0 预定价 / 1 申请价/2 预约
    private Integer adultTaxType; //成人税费类型：0 未含税 / 1 已含税
    private Integer childTaxType;  //儿童税费类型：0 未含税 / 1 已含税
    private Integer adultTax;    //1：成人税费（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价
    private Integer childPrice;  //1：儿童单价（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价
    private Integer childTax;    //1：儿童税费（单位以所输入的币种为准，如：USD, EUR, 或 IDR 等） 2：当 currency 字段输入不合法，或输入不为支付中心支持 的币种符号，不返回人民币报价
    private Integer childPublishPrice; // 儿童公布价，不含税
    private Integer publishPrice;  // 【公布运价强校验】成人公布价（以CNY为单位），不含税 【文档所有跟价格、税费相关的参数，都是以人民币为单位】
    private Integer infantPrice;   // 婴儿公布价
    private Integer infantTax; // 婴儿税费1）对于含婴儿的查询，必须返回；            2）可以为0。
    private Integer infantPublishPrice; // 婴儿公布价
    private String exchange;  // 【公布运价强校验】汇率
    private String adultAgeRestriction; // 适用年龄区间 1）使用“-”表示“至”，例如*-12，表示12岁及以下； 2）置空表示无限制
    private String eligibility; // 【公布运价强校验】 1）旅客资质，标准三字码： 	NOR：普通成人 	LAB：劳务人员 	SEA：海员 	SNR：老年人 	STU：学生 	YOU：青年 2）如果投放非NOR的政策，请提前告知我们。
    private String nationality;  // 允许国籍，使用标准国家二字码 1）置空表示无限制（一般都是置空的）； 2）若多个使用“/”分割； 3）与forbiddenNationality只能2选1，若同时出现，为非法数据，将被过滤。
    private String forbiddenNationality; // 禁用国籍，使用标准国家二字码 1）置空表示无限制（一般都是置空的）； 2）若多个使用“/”分割； 3）与nationality只能2选1，若同时出现，为非法数据，将被过滤。
    private Integer planCategory = 0; // 【公布运价强校验】 产品类型：0 旅行套餐 /1 商务优选/2 特惠推荐 新上线供应商请赋值为0
    private String invoiceType = "F"; // 报销凭证：T 行程单 / F 发票 / E 电子发票   默认发票，如果非发票，请提前告知
    private String minStay; // 最短停留时间【单位是天】【无返回，默认为0，涉及到改期】
    private String maxStay;  // 最长停留时间【单位是天】【无返回，默认为0】
    private Integer minPassengerCount;  // 最小出行人数【无返回，默认为1】
    private Integer maxPassengerCount;  // 最大出行人数【无返回，默认为9】
    private String bookingOfficeNo;  // 订位Office号【可为空】
    private String ticketingOfficeNo;  // 出票Office号【可为空】
    private String validatingCarrier;  // 【公布运价强校验】出票航司 1）整个行程只能赋一个航司； 2）如不赋值会取行程第一航段的carrier作为出票航司； 3）此字段非常重要，请务必准确赋值。
    private String reservationType;  // 【公布运价强校验】政策来源1）非公布运价此字段可不赋值；2）公布运价此字段必须按要求返回，否则产品将按照未知订座系统，输出到旅行套餐；3）使用IATA标准2字代码1E：TravelSky1A：Amadeus1B：Abacus1S：Sabre1P：WorldSpan1G：GalileoOT：未知订座系统来源
    private String productType;  // 【公布运价强校验】运价类型1）公布运价请赋值为：PUB：公布运价；2）非公布运价此字段置空即可；3）公布运价此字段必须按要求返回，否则产品将按照其他产品属性，输出到旅行套餐。
    private String fareBasis;  // 【公布运价强校验】每航段1个，使用“ ; ”分割
    private XCAirlineAncillaries airlineAncillaries; // 增值服务信息；参考 AirlineAncillaries Element

    public XCAirlineAncillaries getAirlineAncillaries() {
        return airlineAncillaries;
    }

    public void setAirlineAncillaries(XCAirlineAncillaries airlineAncillaries) {
        this.airlineAncillaries = airlineAncillaries;
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
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    public Integer getChildPublishPrice() {
        return childPublishPrice;
    }

    public void setChildPublishPrice(Integer childPublishPrice) {
        this.childPublishPrice = childPublishPrice;
    }

    public Integer getPublishPrice() {
        return publishPrice;
    }

    public void setPublishPrice(Integer publishPrice) {
        this.publishPrice = publishPrice;
    }

    public Integer getInfantPrice() {
        return infantPrice;
    }

    public void setInfantPrice(Integer infantPrice) {
        this.infantPrice = infantPrice;
    }

    public Integer getInfantTax() {
        return infantTax;
    }

    public void setInfantTax(Integer infantTax) {
        this.infantTax = infantTax;
    }

    public Integer getInfantPublishPrice() {
        return infantPublishPrice;
    }

    public void setInfantPublishPrice(Integer infantPublishPrice) {
        this.infantPublishPrice = infantPublishPrice;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getAdultAgeRestriction() {
        return adultAgeRestriction;
    }

    public void setAdultAgeRestriction(String adultAgeRestriction) {
        this.adultAgeRestriction = adultAgeRestriction;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getForbiddenNationality() {
        return forbiddenNationality;
    }

    public void setForbiddenNationality(String forbiddenNationality) {
        this.forbiddenNationality = forbiddenNationality;
    }

    public Integer getPlanCategory() {
        return planCategory;
    }

    public void setPlanCategory(Integer planCategory) {
        this.planCategory = planCategory;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getMinStay() {
        return minStay;
    }

    public void setMinStay(String minStay) {
        this.minStay = minStay;
    }

    public String getMaxStay() {
        return maxStay;
    }

    public void setMaxStay(String maxStay) {
        this.maxStay = maxStay;
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

    public String getBookingOfficeNo() {
        return bookingOfficeNo;
    }

    public void setBookingOfficeNo(String bookingOfficeNo) {
        this.bookingOfficeNo = bookingOfficeNo;
    }

    public String getTicketingOfficeNo() {
        return ticketingOfficeNo;
    }

    public void setTicketingOfficeNo(String ticketingOfficeNo) {
        this.ticketingOfficeNo = ticketingOfficeNo;
    }

    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    public void setValidatingCarrier(String validatingCarrier) {
        this.validatingCarrier = validatingCarrier;
    }

    public String getReservationType() {
        return reservationType;
    }

    public void setReservationType(String reservationType) {
        this.reservationType = reservationType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public XCRuleVo getRule() {
        return rule;
    }

    public void setRule(XCRuleVo rule) {
        this.rule = rule;
    }

    public List<XCSegmentVo> getFromSegments() {
        return fromSegments;
    }

    public void setFromSegments(List<XCSegmentVo> fromSegments) {
        this.fromSegments = fromSegments;
    }

    public List<XCSegmentVo> getRetSegments() {
        return retSegments;
    }

    public void setRetSegments(List<XCSegmentVo> retSegments) {
        this.retSegments = retSegments;
    }
    
    

    public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public static XCRouteVo init() {
        XCRouteVo qnroute = new XCRouteVo();
        qnroute.setData("3da0a93eba26c6e8f28955fe65f426fadbec03d9");
        qnroute.setAdultPrice(1200);
        qnroute.setAdultTax(200);
        qnroute.setChildPrice(800);
        qnroute.setChildTax(100);
        qnroute.setPriceType(0);
        qnroute.setApplyType(0);
        qnroute.setChildTaxType(1);
        qnroute.setAdultTaxType(1);
        List<XCSegmentVo> list = new ArrayList<XCSegmentVo>();
        list.add(XCSegmentVo.init());
        List<XCSegmentVo> list1 = new ArrayList<XCSegmentVo>();
        list1.add(XCSegmentVo.init());

        qnroute.setFromSegments(list);
        //	qnroute.setRetSegments(list1);
        return qnroute;
    }

}

