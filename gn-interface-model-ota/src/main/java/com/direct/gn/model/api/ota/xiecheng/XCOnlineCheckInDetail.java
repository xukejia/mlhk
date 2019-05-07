package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCOnlineCheckInDetail implements Serializable {
    private String openCheckInTime;  // 开放值机时间，格式：yyyyMMddHHmm  例：201203101305 表示 2012 年 3 月 10 日 13 时 5 分
    private Integer minAge;  // 最小值机人年龄
    private Integer costPrice;  // 底价
    private String id;  // 产品Id
    private String flight;  // 航班号
    private String fromAirport;  // 出发机场
    private String toAirport;  // 到达机场
    private String depTime ;  // 起飞日期时间，格式：yyyyMMddHHmm  例：201203101305 表示 2012 年 3 月 10 日 13 时 5 分

    public String getOpenCheckInTime() {
        return openCheckInTime;
    }

    public void setOpenCheckInTime(String openCheckInTime) {
        this.openCheckInTime = openCheckInTime;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }
}
