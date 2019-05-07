package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCCtripOrderId implements Serializable {
    private Long adultOrderId; // 成人订单号
    private Long childOrderId; // 儿童订单号
    private Long infantOrderId; // 婴儿订单号

    public Long getAdultOrderId() {
        return adultOrderId;
    }

    public void setAdultOrderId(Long adultOrderId) {
        this.adultOrderId = adultOrderId;
    }

    public Long getChildOrderId() {
        return childOrderId;
    }

    public void setChildOrderId(Long childOrderId) {
        this.childOrderId = childOrderId;
    }

    public Long getInfantOrderId() {
        return infantOrderId;
    }

    public void setInfantOrderId(Long infantOrderId) {
        this.infantOrderId = infantOrderId;
    }
}
