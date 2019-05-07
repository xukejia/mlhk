package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;
import java.util.List;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCPassengerBaggage implements Serializable {
    private String passengerName;  // LastName/FirstName MiddleName，姓/名
    private List<XCBaggage> baggages; // 行李信息集合参考Baggage Element （增值服务查询接口中的行李额节点）

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public List<XCBaggage> getBaggages() {
        return baggages;
    }

    public void setBaggages(List<XCBaggage> baggages) {
        this.baggages = baggages;
    }
}
