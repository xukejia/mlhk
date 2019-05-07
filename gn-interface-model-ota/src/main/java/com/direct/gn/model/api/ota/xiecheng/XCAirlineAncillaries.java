package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCAirlineAncillaries  implements Serializable {
    private Boolean baggageService = false;  // 行李增值服务（true 包含/false不包含，默认false）
    private Boolean unFreeBaggage = false;  // 有无免费行李额（True为无免费行李额；默认False，包含免费行李额，或部分无免费行李额）
    private Integer checkInServiceStatus = 0;  // 值机服务状态 0：不支持在线值机 / 1：支持在线值机 / 2：必须在线值机（此选项代表供应商打包值机价格到机票）

    public Boolean getBaggageService() {
        return baggageService;
    }

    public void setBaggageService(Boolean baggageService) {
        this.baggageService = baggageService;
    }

    public Boolean getUnFreeBaggage() {
        return unFreeBaggage;
    }

    public void setUnFreeBaggage(Boolean unFreeBaggage) {
        this.unFreeBaggage = unFreeBaggage;
    }

    public Integer getCheckInServiceStatus() {
        return checkInServiceStatus;
    }

    public void setCheckInServiceStatus(Integer checkInServiceStatus) {
        this.checkInServiceStatus = checkInServiceStatus;
    }
}
