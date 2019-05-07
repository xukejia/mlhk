package com.direct.gn.enums;

public enum CustomExceptionEnum
{
	SUCCESS(0, "success"),
	
	//系统异常-1至100
	ERROR_SYSTEM(1, "系统异常"),
	ERROR_DATA(2, "数据异常"),
	ERROR_PEMISS(3, "无权限操作,请联系管理员"),
	
	//缓存异常100至200
	EXC_CACHE_ERROR(100, "缓存组建异常"),
	
	//业务异常 300至1000
	EXC_ADMIN_NOT_EXIST(300, "用户不存在"),
	EXC_ADMIN_LOCK(301, "用户被锁定"),
	EXC_PASS_ERROR(302, "密码错误"),
	EXC_CAPTURE_ERROR(303, "验证码错误"),
	EXC_INPUT_ERROR(304, "输入错误"),
	EXC_NOUSER_ERROR(305, "用户不存在"),
	EXC_OPWD_ERROR(306, "原始密码错误"),

	///////////////////////////////////////////////////////
	
    COMMON_FAIL(1, "操作失败，请重试操作或联系客服人员。"),
    COMMON_MISSING_PARAMS(2, "您输入的数据不完整。"),//页面表单数据不完整
    COMMON_WRONG_PARAMS(3, "参数校验失败。"),
    COMMON_DB_ERRORS(4, "操作失败，请重试或联系客服人员。"),
    COMMON_TOO_MANY_RESULTS(5, "返回结果超过一行记录。"),
    COMMON_ERROR_FORMAT(6, "用户不存在。"),
    COMMON_ERROR_FORWARD(7, "错误页面跳转提示。"),
    COMMON_NO_DATA(8, "数据不存在。"),
    COMMON_PERMISSION_DENIED(9, "没有权限。"),
    COMMON_ERROR_TOKEN(10, "TOKEN无效。"),
    COMMON_ERROR_LOGINUSER(11, "登录用户已失效。"),
    
    //gw
    GW_API_SERACH_REQEUST_ERROR(1000, "GW查询错误。"),
    GW_API_SERACH_PARSE_ERROR(1001, "GW查询结果解析错误。"),
    GW_API_SEARCH_CACHE_ERROR(1009, "GW查询缓存错误。"), 
    GW_API_VERIFY_ERROR(1002, "GW验价验票查询错误。"),
    GW_API_VERIFY_IBP_ERROR(1010, "GW验价验票查询错误[IBP]。"),
    GW_API_VERIFY_IBP_REQUEST_ERROR(1011, "GW验价验票请求错误[IBP]。"),
    GW_API_VERIFY_PARSE_ERROR(1003, "GW验价验票查询结果解析错误。"),	
    GW_API_PNR_RETRIEVE_REQUEST_ERROR(1004, "GW提取PNR请求错误。"), 
    GW_API_PNR_RETRIEVE_PARSE_ERROR(1005, "GW提取PNR结果解析错误。"), 
    GW_API_PNR_CANCEL_REQUEST_ERROR(1006, "GW取消PNR请求错误。"), 
    GW_API_PNR_CANCEL_PARSE_ERROR(1007, "GW取消PNR结果解析错误。"), 
    GW_API_BOOKING_ERROR(1008, "GW生成PNR错误。"), 
    
	 //NET
    NET_GW_API_SERACH_REQEUST_ERROR(2000, "NET查询错误。"),
    NET_GW_API_SERACH_PARSE_ERROR(2001, "NET查询结果解析错误。"),
    NET_GW_API_SERACH_PARAM_ERROR(2012, "NET请求参数错误。"),
    NET_GW_API_SEARCH_CACHE_ERROR(2009, "NET查询缓存错误。"), 
    NET_GW_API_VERIFY_ERROR(2002, "NET验价验票查询错误。"),
    NET_GW_API_VERIFY_IBP_ERROR(2010, "NET验价验票查询错误[IBP]。"),
    NET_GW_API_VERIFY_IBP_REQUEST_ERROR(2011, "NET验价验票请求错误[IBP]。"),
    NET_GW_API_VERIFY_PARSE_ERROR(2003, "NET验价验票查询结果解析错误。"),	
    NET_GW_API_PNR_RETRIEVE_REQUEST_ERROR(2004, "NET提取PNR请求错误。"), 
    NET_GW_API_PNR_RETRIEVE_PARSE_ERROR(2005, "NET提取PNR结果解析错误。"), 
    NET_GW_API_PNR_CANCEL_REQUEST_ERROR(2006, "NET取消PNR请求错误。"), 
    NET_GW_API_PNR_CANCEL_PARSE_ERROR(2007, "NET取消PNR结果解析错误。"), 
    NET_GW_API_BOOKING_ERROR(2008, "NET生成PNR错误。"), 
    
	SYSTEM_ERROR(-99, "系统错误");
	
	

    
	///////////////////////////////////////////////////////
	
	/**
	 * 错误码
	 */
	private int code;

	/**
	 * 错误信息
	 */
	private String msg;

	/**
	 * 扩展信息
	 */
	private String extend;
	
	private CustomExceptionEnum(int code, String msg) {
		this.code = code;
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
}
