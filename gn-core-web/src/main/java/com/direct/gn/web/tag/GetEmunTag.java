/**
 * com.direct.gn
 */
package com.direct.gn.web.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.web.utils.EmunUtil;
import com.direct.gn.web.utils.SpringUtil;

/**
 * @author cc
 *
 */
public class GetEmunTag extends TagSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6506007545006858730L;

	protected final static Logger logger = LoggerFactory.getLogger(GetEmunTag.class);

	private String emunName;
	private String emunCode;

	private EmunUtil emunUtil = null;

	public int doStartTag() throws JspException
	{
		try
		{
			if (null == emunUtil)
				emunUtil = (EmunUtil) SpringUtil.getCurrentWebApplicationContext(this.pageContext.getServletContext())
				        .getBean("emunUtil");

			String value = emunCode;

			try
			{
				BaseEmun emu = emunUtil.getBaseEmun(emunName, emunCode);
				if (null != emu)
					value = emu.getMsg();
			} catch (Exception e)
			{
				logger.error(e.getMessage());
			}

			super.pageContext.getOut().println(value);

		} catch (IOException e)
		{
			logger.error(e.getMessage(), e);
			throw new JspException("Write Errors");
		} catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			throw new JspException("calc Errors");
		}
		return EVAL_BODY_INCLUDE;
	}

	public void release()
	{
		super.release();
	}

	public String getEmunName()
	{
		return this.emunName;
	}

	public void setEmunName(String emunName)
	{
		this.emunName = emunName;
	}

	public String getEmunCode()
	{
		return this.emunCode;
	}

	public void setEmunCode(String emunCode)
	{
		this.emunCode = emunCode;
	}

}
