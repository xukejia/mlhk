package com.direct.gn.enums.business;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.enums.GeneralStatusEmum;

/**
 * 日志备注
 * @author Administrator
 *
 */
public enum LogRemarkEmun implements BaseEmun {
	POLICY("Policy", "政策管理"),
	BASIC_POLICY("BasicPolicy", "底价政策管理"),
	POLICY_NEW("PolicyNew", "政策管理(New)"),
	BASIC_POLICY_NEW("BasicPolicyNew", "调价管理"),
	REPLACE_CABIN("ReplaceCabin", "舱位替换设置"),
	CG_POLICY("CGPolicy", "采购政策管理"),
	ALL_AIRPORTS("AllAirports", "机场码设置"),
	SYSTEM_PARAMETER("SystemParameter", "系统配置"),
	POLICY_FILES("PolicyFiles", "政策文件管理");
	private LogRemarkEmun(String code ,String msg)
	{
		this.code = code;
		this.msg = msg;
	}
	
	private String code;
	private String msg;
	private String extend;

	public String getCode()
	{
		return this.code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getMsg()
	{
		return this.msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public String getExtend()
	{
		return this.extend;
	}

	public void setExtend(String extend)
	{
		this.extend = extend;
	}
	
	public static LogRemarkEmun emunByCode(String code)
	{
		for (LogRemarkEmun e: LogRemarkEmun.values())
		{
			if (e.getCode().equals(code))
			{
				return e;
			}
		}
		return null;
	}
	@Override
	public String getEmunByCode(String code)
	{
		String result = "";
		BaseEmun[] es = getBaseEmuns();
		for (BaseEmun e : es)
		{
			if (e.getCode().equals(code))
			{
				result = e.getMsg();
				break;
			}
		}
		return result;
	}

	@Override
	public BaseEmun[] getBaseEmuns()
	{
		return GeneralStatusEmum.values();
	}

}
