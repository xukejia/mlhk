package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCChanges implements Serializable {
    private Integer changesType;  // 改期类型 0：客票全部未使用； 1：客票部分使用【即去程已使用，在往返行程中使用，代表回程的退票信息】 【单程时0；往返时0、1都要有】
    private String changesStatus;  // 改期标识 T：不可改期 H：有条件改期 F：免费改期  E：按航司客规【公布运价专用】
    private Integer changesFee;  // 退票费 1）当changesStatus =H,必须赋值；2）若changesStatus =T/F,此字段可不赋值。
    private String currency;  // 退票费币种 当refundStatus =H，必须赋值。
    private Integer passengerType;  // 乘客类型，0 成人/1 儿童/2 婴儿 1）对于对乘客类型的查询、验价，必须按乘客类型返回；如成人+儿童的查询，成人和儿童的退改签都要有。
    private String revNoshow;  // 是否允许NoShow改期 T：不可退； H：有条件退；F：免费退；E：按航司客规为准【公布运价专用】
    private Integer revNoShowCondition = 0;  // 改期时航班起飞前多久算NoShow，单位：小时 1）若无法确认此时间，请默认赋0。
    private Integer revNoshowFee;  // NoShow改期费用 1）当revNoshow =H，必须赋值；2）展示给客人的noshow改期费= changesFee + revNoshowFee。
    private String cnRevRemark;  // 中文改期备注
    private String enRevRemark;  // 英文改期备注

    public Integer getChangesType() {
        return changesType;
    }

    public void setChangesType(Integer changesType) {
        this.changesType = changesType;
    }

    public String getChangesStatus() {
        return changesStatus;
    }

    public void setChangesStatus(String changesStatus) {
        this.changesStatus = changesStatus;
    }

    public Integer getChangesFee() {
        return changesFee;
    }

    public void setChangesFee(Integer changesFee) {
        this.changesFee = changesFee;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(Integer passengerType) {
        this.passengerType = passengerType;
    }

    public String getRevNoshow() {
        return revNoshow;
    }

    public void setRevNoshow(String revNoshow) {
        this.revNoshow = revNoshow;
    }

    public Integer getRevNoShowCondition() {
        return revNoShowCondition;
    }

    public void setRevNoShowCondition(Integer revNoShowCondition) {
        this.revNoShowCondition = revNoShowCondition;
    }

    public Integer getRevNoshowFee() {
        return revNoshowFee;
    }

    public void setRevNoshowFee(Integer revNoshowFee) {
        this.revNoshowFee = revNoshowFee;
    }

    public String getCnRevRemark() {
        return cnRevRemark;
    }

    public void setCnRevRemark(String cnRevRemark) {
        this.cnRevRemark = cnRevRemark;
    }

    public String getEnRevRemark() {
        return enRevRemark;
    }

    public void setEnRevRemark(String enRevRemark) {
        this.enRevRemark = enRevRemark;
    }
}
