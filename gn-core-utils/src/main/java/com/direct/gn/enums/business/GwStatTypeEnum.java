package com.direct.gn.enums.business;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.enums.GeneralStatusEmum;

/**
 * 统计GW请求类型枚举 GwStatTypeEnum
 *
 * @author w2017
 */
public enum GwStatTypeEnum implements BaseEmun {
    OTA_SEARCH("11", "OTA查询"),
    OTA_VERIFY("12", "OTA验价"),
    OTA_ORDER("13", "OTA订单"),
    OTA_PAY("14", "OTA支付");

    GwStatTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;
    private String extend;

    @Override
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getExtend() {
        return this.extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public static GwStatTypeEnum emunByCode(String code) {
        for (GwStatTypeEnum e : GwStatTypeEnum.values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public String getEmunByCode(String code) {
        String result = "";
        BaseEmun[] es = getBaseEmuns();
        for (BaseEmun e : es) {
            if (e.getCode().equals(code)) {
                result = e.getMsg();
                break;
            }
        }
        return result;
    }

    @Override
    public BaseEmun[] getBaseEmuns() {
        return GeneralStatusEmum.values();
    }
}
