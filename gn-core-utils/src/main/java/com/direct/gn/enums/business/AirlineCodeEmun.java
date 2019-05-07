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
public enum AirlineCodeEmun implements BaseEmun
{
	AK("AK" , "亚航"),
	MU("MU" , "东航"),
	UO("UO" , "香港快运"),
	TF("TF" , "TRVALFSION"),
	TK("3K" , "捷星"),
	FJ("5J" , "宿航"),
	SL("SL" , "狮航"),
	MM("MM" , "乐桃"),
	JT("JT" , "印尼狮航"),
	XW("XW" , "酷鸟"),
	TR("TR" , "虎航"),
	SE("6E" , "印地高"),
	JW("JW" , "香草航空"),
	G9("G9" , "阿拉伯航"),
	BX("BX" , "釜山航"),
	JINTONG("JINTONG" , "今通"),
	PKFARE("PKFARE" , "PKFARE");
	
	private AirlineCodeEmun(String code ,String msg)
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

	public static AirlineCodeEmun emunByCode(String code)
	{
		for (AirlineCodeEmun e : AirlineCodeEmun.values())
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
