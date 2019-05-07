package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCFFPNo implements Serializable {
    private String cardNo;  // 常旅客卡号
    private String carrier;  // 常旅客卡航司

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
