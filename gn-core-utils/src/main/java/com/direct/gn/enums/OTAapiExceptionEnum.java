package com.direct.gn.enums;

public enum OTAapiExceptionEnum {
    SUCCESS(0, "0", "success"),
    SYS_WH(1, "1", "system tenance"),
    //系统异常-1至100
    REPEAT_BOOKING(92, "92", "REPEAT"),
    PRICE_CHANGE(93, "93", "PRICE_CHANGE"),
    INVALID_REQUEST(94, "94", "invalid request"),
    NOFIND_DATA(95, "95", "no find data"),
    ERROR_SYSTEM(96, "96", "system internal error"),
    NOSUP_TYPE(97, "97", "no support this routeType"),
    NOSUP_AIRLINE(98, "98", "no support this airline"),
    INVALID_PARAM(99, "99", "invalid parameter"),
    CREATE_ORDER_ERROR(100, "100", "create pnr error"),
    NO_ROUTING(9999, "9999", "NO ROUTING"),

    // 同程
    SUCCESS_TCA(0, "A0", "success"),
    SYS_WH_TCA(1, "A105", "system tenance"),
    REPEAT_BOOKING_TCA(92, "A102", "REPEAT"),
    PRICE_CHANGE_TCA(93, "A105", "PRICE_CHANGE"),
    INVALID_REQUEST_TCA(94, "A101", "invalid request"),
    NOFIND_DATA_TCA(95, "A100", "no find data"),
    ERROR_SYSTEM_TCA(96, "A104", "system internal error"),
    NOSUP_TYPE_TCA(97, "A105", "no support this routeType"),
    NOSUP_AIRLINE_TCA(98, "A103", "no support this airline"),
    INVALID_PARAM_TCA(99, "A101", "invalid parameter"),
    CREATE_ORDER_ERROR_TCA(100, "A105", "create pnr error"),

    SUCCESS_TCB(0, "B0", "success"),
    SYS_WH_TCB(1, "B105", "system tenance"),
    REPEAT_BOOKING_TCB(92, "B102", "REPEAT"),
    PRICE_CHANGE_TCB(93, "B105", "PRICE_CHANGE"),
    INVALID_REQUEST_TCB(94, "B101", "invalid request"),
    NOFIND_DATA_TCB(95, "B100", "no find data"),
    ERROR_SYSTEM_TCB(96, "B104", "system internal error"),
    NOSUP_TYPE_TCB(97, "B105", "no support this routeType"),
    NOSUP_AIRLINE_TCB(98, "B103", "no support this airline"),
    INVALID_PARAM_TCB(99, "B101", "invalid parameter"),
    CREATE_ORDER_ERROR_TCB(100, "B105", "create pnr error"),

    SUCCESS_TCC(0, "C0", "success"),
    SYS_WH_TCC(1, "C105", "system tenance"),
    REPEAT_BOOKING_TCC(92, "C102", "REPEAT"),
    PRICE_CHANGE_TCC(93, "C105", "PRICE_CHANGE"),
    INVALID_REQUEST_TCC(94, "C101", "invalid request"),
    NOFIND_DATA_TCC(95, "C100", "no find data"),
    ERROR_SYSTEM_TCC(96, "C104", "system internal error"),
    NOSUP_TYPE_TCC(97, "C105", "no support this routeType"),
    NOSUP_AIRLINE_TCC(98, "C103", "no support this airline"),
    INVALID_PARAM_TCC(99, "C101", "invalid parameter"),
    CREATE_ORDER_ERROR_TCC(100, "C105", "create pnr error"),
    
    //携程价格校验接口和生单接口返回参数
    SUCCESS_XC(0, "0", "成功"),
    /** 请求舱位数大于查询的最大舱位数 */
    CABIN_FAIL_XC(1, "1", "舱位失败"),
    /** 舱位已售完 */
    CABIN_FULL_XC(2, "2", "满舱"),
    /** 如果价格校验失败原因不在Excel中，则返回status=3，并在message中标明相应的失败原因。 */
    OTHER_XC(3, "3", "其他失败原因"),
    @Deprecated
    PARAM_ERROR_XC(4, "4", "ctrip请求参数错误"),
    ERROR_SYSTEM_XC(5, "5", "程序异常"),
    CURRENCY_NOT_FIT_XC(6, "6", "币种不一致"),
    TIMEOUT_XC(3, "7", "航司或GW超时"),
    /** 第二段的航段时间早于第一段或航段重复 */
    DATE_INVALID_XC(111, "111", "无效的日期范围"),
    INVALID_PARAM_XC(112, "112", "参数验证不通过"),
    RESULT_ERROR_XC(200, "200", "航司或GW结果异常"),
    GW_NO_PRICE_XC(201, "201", "航司或GW无可用的运价"),
    GW_PRICE_NOT_USERD_XC(202, "202", "航司或GW指定的票价不可用"),
    /** 航班限制：比如不同时间价格不一样的航班未被过滤 */
    GW_ERROR_XC(203, "203", "航司或GW QTE出错"),
    CARRIER_NOT_TRANSPORT_PROTOCOL_XC(204, "204", "航司无联运协议");

    ///////////////////////////////////////////////////////

    /**
     * 错误码
     */
    private int code;
    /**
     * 错误码(字符类型)
     */
    private String status;
    /**
     * 错误信息
     */
    private String msg;

    /**
     * 扩展信息
     */
    private String extend;

    private OTAapiExceptionEnum(int code, String status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        if (extend != null && !"".equals(extend)) {
            return msg + "," + extend;
        } else {
            return msg;
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
