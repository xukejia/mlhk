package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCCtripRefRevServiceFee implements Serializable {
    private Long id; // 携程订单号
    private Integer status;  // 退改签推送状态：0 正常， 1 异常
    private Integer outboundRevalidationFee;  // 去程改期费用
    private String outNonChg;  // 去程是否可改
    private Integer inboundRevalidationFee;  // 回程改期费用
    private String inNonChg;  // 回程是否可改
    private Integer refundFeeByConsolidator;  // 合作票台退票服务费
    private Integer outRefundFee;  // 全部未使用退票费用
    private String outNonRef;  // 全部未使用可否退票
    private Integer inRefundFee;  // 部分使用退票费用
    private String inNonRef;  // 部分使用可否退票
    private Integer revalidationFeeByConsolidator;  // 合作票台改期服务费
    private String outRevFeeCurrency;  // 去程改期费用币种
    private String inRevFeeCurrency;  // 回程改期费用币种
    private String inRefCurrency;  // 部分使用退票费用币种
    private String outRefCurrency;  // 全部未使用退票费用币种
    private String outNonRev;  //  是否允许去程改期
    private String inNonRev;  // 是否允许回程改期
    private Integer outRevChdFee;  // 去程儿童改期费
    private Integer inRevChdFee;  // 回程儿童改期费
    private String revHasNoShow;  // 是否允许No Show改期
    private Integer outRevNoShowFee;  // 去程No Show改期费用（成人）
    private Integer inRevNoShowFee;  // 回程No Show改期费用（成人）
    private Integer outRevNoShowChdFee;  // 去程 No Show改期儿童费用
    private Integer inRevNoShowChdFee;  // 回程 No Show改期儿童费用
    private Integer revNoShowCondition;  // NoShow改期条件
    private Integer outRefChdFee;  // 全部退票儿童费用-去程
    private Integer inRefChdFee;  // 部分退票儿童费用
    private String refHasNoShow;  // 是否允许No Show退票
    private Integer outRefNoShowFee;  // 全部No Show退票费用（成人）-去程
    private Integer inRefNoShowFee;  // 部分No Show退票费用（成人）
    private Integer outRefNoShowChdFee;  // 全部No Show退票儿童费用-去程
    private Integer inRefNoShowChdFee;  // 部分No Show退票儿童费用
    private Integer refNoShowCondition;  // No-Show退票条件

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOutboundRevalidationFee() {
        return outboundRevalidationFee;
    }

    public void setOutboundRevalidationFee(Integer outboundRevalidationFee) {
        this.outboundRevalidationFee = outboundRevalidationFee;
    }

    public String getOutNonChg() {
        return outNonChg;
    }

    public void setOutNonChg(String outNonChg) {
        this.outNonChg = outNonChg;
    }

    public Integer getInboundRevalidationFee() {
        return inboundRevalidationFee;
    }

    public void setInboundRevalidationFee(Integer inboundRevalidationFee) {
        this.inboundRevalidationFee = inboundRevalidationFee;
    }

    public String getInNonChg() {
        return inNonChg;
    }

    public void setInNonChg(String inNonChg) {
        this.inNonChg = inNonChg;
    }

    public Integer getRefundFeeByConsolidator() {
        return refundFeeByConsolidator;
    }

    public void setRefundFeeByConsolidator(Integer refundFeeByConsolidator) {
        this.refundFeeByConsolidator = refundFeeByConsolidator;
    }

    public Integer getOutRefundFee() {
        return outRefundFee;
    }

    public void setOutRefundFee(Integer outRefundFee) {
        this.outRefundFee = outRefundFee;
    }

    public String getOutNonRef() {
        return outNonRef;
    }

    public void setOutNonRef(String outNonRef) {
        this.outNonRef = outNonRef;
    }

    public Integer getInRefundFee() {
        return inRefundFee;
    }

    public void setInRefundFee(Integer inRefundFee) {
        this.inRefundFee = inRefundFee;
    }

    public String getInNonRef() {
        return inNonRef;
    }

    public void setInNonRef(String inNonRef) {
        this.inNonRef = inNonRef;
    }

    public Integer getRevalidationFeeByConsolidator() {
        return revalidationFeeByConsolidator;
    }

    public void setRevalidationFeeByConsolidator(Integer revalidationFeeByConsolidator) {
        this.revalidationFeeByConsolidator = revalidationFeeByConsolidator;
    }

    public String getOutRevFeeCurrency() {
        return outRevFeeCurrency;
    }

    public void setOutRevFeeCurrency(String outRevFeeCurrency) {
        this.outRevFeeCurrency = outRevFeeCurrency;
    }

    public String getInRevFeeCurrency() {
        return inRevFeeCurrency;
    }

    public void setInRevFeeCurrency(String inRevFeeCurrency) {
        this.inRevFeeCurrency = inRevFeeCurrency;
    }

    public String getInRefCurrency() {
        return inRefCurrency;
    }

    public void setInRefCurrency(String inRefCurrency) {
        this.inRefCurrency = inRefCurrency;
    }

    public String getOutRefCurrency() {
        return outRefCurrency;
    }

    public void setOutRefCurrency(String outRefCurrency) {
        this.outRefCurrency = outRefCurrency;
    }

    public String getOutNonRev() {
        return outNonRev;
    }

    public void setOutNonRev(String outNonRev) {
        this.outNonRev = outNonRev;
    }

    public String getInNonRev() {
        return inNonRev;
    }

    public void setInNonRev(String inNonRev) {
        this.inNonRev = inNonRev;
    }

    public Integer getOutRevChdFee() {
        return outRevChdFee;
    }

    public void setOutRevChdFee(Integer outRevChdFee) {
        this.outRevChdFee = outRevChdFee;
    }

    public Integer getInRevChdFee() {
        return inRevChdFee;
    }

    public void setInRevChdFee(Integer inRevChdFee) {
        this.inRevChdFee = inRevChdFee;
    }

    public String getRevHasNoShow() {
        return revHasNoShow;
    }

    public void setRevHasNoShow(String revHasNoShow) {
        this.revHasNoShow = revHasNoShow;
    }

    public Integer getOutRevNoShowFee() {
        return outRevNoShowFee;
    }

    public void setOutRevNoShowFee(Integer outRevNoShowFee) {
        this.outRevNoShowFee = outRevNoShowFee;
    }

    public Integer getInRevNoShowFee() {
        return inRevNoShowFee;
    }

    public void setInRevNoShowFee(Integer inRevNoShowFee) {
        this.inRevNoShowFee = inRevNoShowFee;
    }

    public Integer getOutRevNoShowChdFee() {
        return outRevNoShowChdFee;
    }

    public void setOutRevNoShowChdFee(Integer outRevNoShowChdFee) {
        this.outRevNoShowChdFee = outRevNoShowChdFee;
    }

    public Integer getInRevNoShowChdFee() {
        return inRevNoShowChdFee;
    }

    public void setInRevNoShowChdFee(Integer inRevNoShowChdFee) {
        this.inRevNoShowChdFee = inRevNoShowChdFee;
    }

    public Integer getRevNoShowCondition() {
        return revNoShowCondition;
    }

    public void setRevNoShowCondition(Integer revNoShowCondition) {
        this.revNoShowCondition = revNoShowCondition;
    }

    public Integer getOutRefChdFee() {
        return outRefChdFee;
    }

    public void setOutRefChdFee(Integer outRefChdFee) {
        this.outRefChdFee = outRefChdFee;
    }

    public Integer getInRefChdFee() {
        return inRefChdFee;
    }

    public void setInRefChdFee(Integer inRefChdFee) {
        this.inRefChdFee = inRefChdFee;
    }

    public String getRefHasNoShow() {
        return refHasNoShow;
    }

    public void setRefHasNoShow(String refHasNoShow) {
        this.refHasNoShow = refHasNoShow;
    }

    public Integer getOutRefNoShowFee() {
        return outRefNoShowFee;
    }

    public void setOutRefNoShowFee(Integer outRefNoShowFee) {
        this.outRefNoShowFee = outRefNoShowFee;
    }

    public Integer getInRefNoShowFee() {
        return inRefNoShowFee;
    }

    public void setInRefNoShowFee(Integer inRefNoShowFee) {
        this.inRefNoShowFee = inRefNoShowFee;
    }

    public Integer getOutRefNoShowChdFee() {
        return outRefNoShowChdFee;
    }

    public void setOutRefNoShowChdFee(Integer outRefNoShowChdFee) {
        this.outRefNoShowChdFee = outRefNoShowChdFee;
    }

    public Integer getInRefNoShowChdFee() {
        return inRefNoShowChdFee;
    }

    public void setInRefNoShowChdFee(Integer inRefNoShowChdFee) {
        this.inRefNoShowChdFee = inRefNoShowChdFee;
    }

    public Integer getRefNoShowCondition() {
        return refNoShowCondition;
    }

    public void setRefNoShowCondition(Integer refNoShowCondition) {
        this.refNoShowCondition = refNoShowCondition;
    }
}
