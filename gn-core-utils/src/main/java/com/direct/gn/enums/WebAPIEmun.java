/**
 * com.direct.gn
 */
package com.direct.gn.enums;

/**
 * @author cc
 */
public enum WebAPIEmun {
    SUCCESS("0", "成功"),
    ERROR("1", "失败"),

    //NETAPI用
    NET_ERR_NET_TYPE_PARAM("2001", "参数错误，NETTYPE序列化错误"),
    
    // OrderApi用
    ORDER_ERR_PARAM("1001", "参数错误"),
    ORDER_ERR_PARSE_JSON("1002", "参数Json解析错误"),
    ORDER_ERR_NO_DATA("1009", "无数据返回");

    WebAPIEmun(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;
    private String extend;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

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
}
