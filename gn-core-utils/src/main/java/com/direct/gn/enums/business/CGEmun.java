/**
 * com.direct.gn
 */
package com.direct.gn.enums.business;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.enums.GeneralStatusEmum;

/**
 * @author cc
 *
 */
public enum CGEmun implements BaseEmun
{
	XM("1","西敏"),
	LT("2","乐途"),
	GM("3","GMTOUR"),
	AL("4","安旅"),
	VIP("5","VIP"),
	AU("6","澳洲"),
	YL("7","依兰"),
	ABC("8","ABC"),
	YMX("9","亚马逊"),
	HQ("10","环球"),
	LXZ("11","加拿大旅行者"),
	SH("12","四海"),
	DTT("13","美国DTT"),
	ELS("14","俄罗斯"),
	OT1("15","OT1"),
	OT2("16","OT2"),
	OT3("17","OT3"),
	OT4("18","OT4"),
	OT5("19","OT4"),
	OT6("20","OT4");

	private CGEmun(String code ,String msg)
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

	public static CGEmun emunByCode(String code)
	{
		for (CGEmun e : CGEmun.values())
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
