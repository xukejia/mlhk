package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCBaggage  implements Serializable {
    private Integer segmentNo;  // 航段序号，从1开始
    private String adultBaggage;  // 成人行李额中文版，格式重量+单位 如1件，每件15KG；如只限重量不限件数，赋重量即可，如23KG；此节点值不能为空（不能为空就要求必须赋值，但可以是0件）
    private String childBaggage;  // 儿童行李额中文版，格式同成人【对于含儿童的情况，此节点不能为空（不能为空就要求必须赋值，但可以是0件）】
    private String infantBaggage;  // 婴儿行李额中文版，格式同成人【对于含儿童的情况，此节点不能为空（不能为空就要求必须赋值，但可以是0件）】
    private String enAdultBaggage;  // 成人行李额英文版，格式重量+单位 示例：1P，23KG
    private String enChildBaggage;  // 儿童行李额英文版，格式同成人
    private String enInfantBaggage;  // 婴儿行李额英文版，格式同成人

    public Integer getSegmentNo() {
        return segmentNo;
    }

    public void setSegmentNo(Integer segmentNo) {
        this.segmentNo = segmentNo;
    }

    public String getAdultBaggage() {
        return adultBaggage;
    }

    public void setAdultBaggage(String adultBaggage) {
        this.adultBaggage = adultBaggage;
    }

    public String getChildBaggage() {
        return childBaggage;
    }

    public void setChildBaggage(String childBaggage) {
        this.childBaggage = childBaggage;
    }

    public String getInfantBaggage() {
        return infantBaggage;
    }

    public void setInfantBaggage(String infantBaggage) {
        this.infantBaggage = infantBaggage;
    }

    public String getEnAdultBaggage() {
        return enAdultBaggage;
    }

    public void setEnAdultBaggage(String enAdultBaggage) {
        this.enAdultBaggage = enAdultBaggage;
    }

    public String getEnChildBaggage() {
        return enChildBaggage;
    }

    public void setEnChildBaggage(String enChildBaggage) {
        this.enChildBaggage = enChildBaggage;
    }

    public String getEnInfantBaggage() {
        return enInfantBaggage;
    }

    public void setEnInfantBaggage(String enInfantBaggage) {
        this.enInfantBaggage = enInfantBaggage;
    }
}
