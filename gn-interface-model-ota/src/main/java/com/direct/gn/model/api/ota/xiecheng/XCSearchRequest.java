package com.direct.gn.model.api.ota.xiecheng;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public class XCSearchRequest implements Serializable {
    private String cid;
    private String tripType;   //行程类型， 1：单程； 2：往返； 3：多程； 4：往返中推荐多程（消费者往返的请求，我们会推荐多 程的结果信息，推荐的原则为行程的出发或到达出现在 第二程中，比如消费者搜索A-B的往返，我们会推荐 A-B,B-C或者A-B,C-A,不推荐A-B,C-D
    private Integer adultNumber; // 成人人数，1-9，供应商请按照实际请求出行人数返回相关运价数据【特别注意：查询请求是带人数的】
    private Integer childNumber; // ⼉童人数，0-9（新上线供应商默认只开放成人，不开放多乘客类型）
    private Integer infantNumber; // 婴儿人数，0-9
    private String fromCity; //出发地 IATA三字码代码 如果为多程，会按照 PEK/HKG，HKG/SHA格式请求， 第一程为北京->香港，第二程为香港->上海
    private String toCity;   //到达地IATA三字码
    private String fromDate; //去程，格式为 YYYYMMDD，YYYYMMDD 如果为多程，20130729, 20130804方式传输数据
    private String retDate;  //回程日期，格式为 YYYYMMDD（留空表示单程）
    private String channel; // 搜索请求渠道来源：F：FlightIntlOnline；M：Mobile 1）若为F，要求在7S内返回结果；若为M，要求在5S内返回结果； 2） 若查询超时，直接熔断。3）此字段非常重要，请务必注意
    private String isCompressEncode; // 标识供应商查询返回报文是否需要压缩 1) 默认不压缩；如果为T，压缩编码； 2）若需要压缩，请联系我们处理。


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getRetDate() {
        return retDate;
    }

    public void setRetDate(String retDate) {
        this.retDate = retDate;
    }

    public String getIsCompressEncode() {
        return isCompressEncode;
    }

    public void setIsCompressEncode(String isCompressEncode) {
        this.isCompressEncode = isCompressEncode;
    }

    public Integer getAdultNumber() {
        return adultNumber;
    }

    public void setAdultNumber(Integer adultNumber) {
        this.adultNumber = adultNumber;
    }

    public Integer getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(Integer childNumber) {
        this.childNumber = childNumber;
    }

    public Integer getInfantNumber() {
        return infantNumber;
    }

    public void setInfantNumber(Integer infantNumber) {
        this.infantNumber = infantNumber;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
