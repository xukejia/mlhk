package com.direct.gn.exception;

import com.direct.gn.enums.CustomExceptionEnum;

public class CustomException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8941566875012483572L;
	/**
	 * 异常
	 */
	private CustomExceptionEnum exception;

	/**
	 * 消息
	 */
	private String msg;

	public CustomException(CustomExceptionEnum exception)
	{
		this.exception = exception;
	}

	public CustomException(CustomExceptionEnum exception, String msg)
	{
		this.exception = exception;
		this.msg = msg;
	}

	@Override
	public String getMessage()
	{
		return exception.getMsg() + '-'  + msg;
	}

	public CustomExceptionEnum getException()
	{
		if (msg != null)
		{
			exception.setExtend(msg);
		}
		return exception;
	}

	public void setException(CustomExceptionEnum exception)
	{
		this.exception = exception;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}
