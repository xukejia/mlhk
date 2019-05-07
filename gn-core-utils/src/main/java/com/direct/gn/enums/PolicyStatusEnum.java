/**
 * com.direct.gn
 */
package com.direct.gn.enums;

/**
 * @author cc
 */
public enum PolicyStatusEnum implements BaseEmun {
    ACTIVATE("0", "激活"),
    INVALID("1", "挂起"),
    DELETE("99", "删除");


    PolicyStatusEnum(String code, String msg) {
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
        return PolicyStatusEnum.values();
    }

}
