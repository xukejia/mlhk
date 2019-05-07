package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;
import java.util.List;

public class XCRuleVo implements Serializable {

    private List<XCBaggage> baggageInfoList; // 行李额规定；参考下方Baggage Element 1）查询及验价时，Baggage和FormatBaggage需同时返回，缺一不可
    private List<XCFormatBaggage> formatBaggageInfoList; // 格式化行李额规定；参考下方FormatBaggage Element 1）查询及验价时，Baggage和FormatBaggage需同时返回，缺一不可
    private List<XCRefund> refundInfoList; // 退票规定；参考下面的Refund Element 1）单程和往返格式不同；2）需要按照乘客类型分别赋值
    private List<XCChanges> changesInfoList; // 改期规定；参考下面的Changes Element
    private XCServiceFee serviceFee; // 已弃用】服务费规定；参考下面serviceFee Element
    private String note;  // 备注信息，最大 300 个字符
    private Boolean isUseCtripRule; // 是否要使用携程退改签：（true 使用；false 不使用）
    private String tariffNo;  // 公布运价相关参数，地理区间见运价集群编码，tariffNo赋值PUB，私有运价，tariffNo赋值PRI
    private String ruleNo;  // 公布运价相关参数
    private Integer fareRuleMatchMode;  // 退改签匹配模式：（0准确匹配；1模糊匹配）

    public List<XCBaggage> getBaggageInfoList() {
        return baggageInfoList;
    }

    public void setBaggageInfoList(List<XCBaggage> baggageInfoList) {
        this.baggageInfoList = baggageInfoList;
    }

    public List<XCFormatBaggage> getFormatBaggageInfoList() {
        return formatBaggageInfoList;
    }

    public void setFormatBaggageInfoList(List<XCFormatBaggage> formatBaggageInfoList) {
        this.formatBaggageInfoList = formatBaggageInfoList;
    }

    public List<XCRefund> getRefundInfoList() {
        return refundInfoList;
    }

    public void setRefundInfoList(List<XCRefund> refundInfoList) {
        this.refundInfoList = refundInfoList;
    }

    public List<XCChanges> getChangesInfoList() {
        return changesInfoList;
    }

    public void setChangesInfoList(List<XCChanges> changesInfoList) {
        this.changesInfoList = changesInfoList;
    }

    public XCServiceFee getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(XCServiceFee serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getUseCtripRule() {
        return isUseCtripRule;
    }

    public void setUseCtripRule(Boolean useCtripRule) {
        isUseCtripRule = useCtripRule;
    }

    public String getTariffNo() {
        return tariffNo;
    }

    public void setTariffNo(String tariffNo) {
        this.tariffNo = tariffNo;
    }

    public String getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(String ruleNo) {
        this.ruleNo = ruleNo;
    }

    public Integer getFareRuleMatchMode() {
        return fareRuleMatchMode;
    }

    public void setFareRuleMatchMode(Integer fareRuleMatchMode) {
        this.fareRuleMatchMode = fareRuleMatchMode;
    }
}
