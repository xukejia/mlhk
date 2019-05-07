/**
 * com.direct.gn
 */
package com.direct.gn.enums;

/**
 * @author cc
 *
 */
public enum GeneralTaskStatusEmum implements BaseEmun
{
	ACTIVATE("0", "未完成"), 
	DONE("1", "已完成"), 
	CANCEL("99", "取消");


	private GeneralTaskStatusEmum(String code, String msg)
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
		return GeneralTaskStatusEmum.values();
	}

}
