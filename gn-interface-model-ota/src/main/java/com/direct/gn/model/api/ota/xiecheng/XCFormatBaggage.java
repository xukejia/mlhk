package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCFormatBaggage  implements Serializable {
    private Integer segmentNo;  // 航段序号，从1开始 1）注意是按航段赋值，而不是按去程/回程赋值
    private Integer passengerType;  // 乘客类型，0 成人/1 儿童/2 婴儿 1）对于多乘客类型的查询、验价，必须按乘客类型返回；如成人+儿童的查询，成人和儿童的行李额都要有。
    private Integer baggagePiece;  // 行李额件数，单位PC，枚举值如下： 0无免费托运行李，此时baggageWeight需赋值为-1； -1表示计重制，对应的baggageWeight表示每人可携带的总重量(此时baggageWeight必须赋正值，否则过滤）；>0表示计件制，对应的baggageWeight表示每件行李重量（若计件制时不知每件行李额的重量，baggageWeight必须赋值为-1）。
    private Integer baggageWeight;  // 行李额重量，单位KG，必须赋值，跟BaggagePiece配合使用
    private String cnBaggage;  // 中文行李额备注
    private String enBaggage;  // 英文行李额备注

    public Integer getSegmentNo() {
        return segmentNo;
    }

    public void setSegmentNo(Integer segmentNo) {
        this.segmentNo = segmentNo;
    }

    public Integer getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(Integer passengerType) {
        this.passengerType = passengerType;
    }

    public Integer getBaggagePiece() {
        return baggagePiece;
    }

    public void setBaggagePiece(Integer baggagePiece) {
        this.baggagePiece = baggagePiece;
    }

    public Integer getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(Integer baggageWeight) {
        this.baggageWeight = baggageWeight;
    }

    public String getCnBaggage() {
        return cnBaggage;
    }

    public void setCnBaggage(String cnBaggage) {
        this.cnBaggage = cnBaggage;
    }

    public String getEnBaggage() {
        return enBaggage;
    }

    public void setEnBaggage(String enBaggage) {
        this.enBaggage = enBaggage;
    }
}
