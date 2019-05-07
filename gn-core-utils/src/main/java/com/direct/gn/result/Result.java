
package com.direct.gn.result;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Result implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7018644655421921872L;
	/**
	 * 是否成功
	 */

	private boolean isSuccess;

	/**
	 * 错误代码
	 */
	private String errorCode;
	/**
	 * 错误信息
	 */
	private String errorHint;

	public Result()
	{
		this.isSuccess = false;
	}

	public Result(boolean isSuccess)
	{
		this.isSuccess = isSuccess;
	}

	public Result(boolean isSuccess, String errorCode, String errorHint)
	{
		this.isSuccess = isSuccess;
		this.errorCode = errorCode;
		this.errorHint = errorHint;
	}

	public String getErrorHint()
	{
		return errorHint;
	}

	public void setErrorHint(String errorHint)
	{
		this.errorHint = errorHint;
	}

	public boolean isSuccess()
	{
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess)
	{
		this.isSuccess = isSuccess;
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}
