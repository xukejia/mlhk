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
public enum RebateTypeEmun implements BaseEmun
{
	NotContainTax("0","票面返"),
	ContainTax("1","含税返");
	private RebateTypeEmun(String code ,String msg)
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

	public static RebateTypeEmun emunByCode(String code)
	{
		for (RebateTypeEmun e : RebateTypeEmun.values())
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