package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCServiceFee implements Serializable {
    private Integer revalidationFeeByCarrier;  // 航司改签服务费
    private Integer refundFeeByCarrier;  // 航司退票服务费
    private String currency;  // 服务费币种，IATA标准币种编码，仅限人民币：CNY

    public Integer getRevalidationFeeByCarrier() {
        return revalidationFeeByCarrier;
    }

    public void setRevalidationFeeByCarrier(Integer revalidationFeeByCarrier) {
        this.revalidationFeeByCarrier = revalidationFeeByCarrier;
    }

    public Integer getRefundFeeByCarrier() {
        return refundFeeByCarrier;
    }

    public void setRefundFeeByCarrier(Integer refundFeeByCarrier) {
        this.refundFeeByCarrier = refundFeeByCarrier;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
