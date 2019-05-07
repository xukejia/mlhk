/**
 * com.direct.gn
 */
package com.direct.gn.web.tag;

import java.io.IOException;
import java.io.Writer;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.tags.HtmlEscapingAwareTag;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.web.utils.EmunUtil;
import com.direct.gn.web.utils.SpringUtil;

/**
 * @author cc
 *
 */
public class SelectEmunTag extends HtmlEscapingAwareTag
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7134491811821419826L;

	private String emunName;
	private String selectValue;
	private String selectName;
	private String cssClass;
	private String onChange;
	private boolean allOption = false;
	private Writer writer;

	private EmunUtil emunUtil = null;

	@Override
	protected int doStartTagInternal() throws Exception
	{

		this.writer = createTagWriter();

		if (StringUtils.isEmpty(cssClass))
			cssClass = "form-control";

		String value = "";
		if (!StringUtils.isEmpty(selectValue))
		{
			value = selectValue;
		}

		try
		{
			if (null == emunUtil)
				emunUtil = (EmunUtil) SpringUtil.getCurrentWebApplicationContext(this.pageContext.getServletContext())
				        .getBean("emunUtil");

			BaseEmun[] emuns = this.emunUtil.getBaseEmuns(emunName);

			appendValue("<select ");
			writeAttribute("value", selectValue);

			writeAttribute("id", selectName);
			writeAttribute("name", selectName);
			writeAttribute("class", cssClass);
			if (!StringUtils.isEmpty(this.onChange))
				writeAttribute("onchange", this.onChange);
			appendValue(">");

			if (this.allOption)
			{
				appendValue("<option");
				if ("".equals(selectValue))
				{
					appendValue(" SELECTED ");
				}
				writeAttribute("value", "");
				appendValue(">");
				appendValue("全部");
				appendValue("</option>");
			}

			boolean selectFlag = false;
			if (!allOption && StringUtils.isEmpty(selectValue))
				selectFlag = true;
			for (BaseEmun e : emuns)
			{
				appendValue("<option");
				if (value.equals(e.getCode()) || selectFlag)
				{
					appendValue(" SELECTED ");
				}
				writeAttribute("value", e.getCode());
				appendValue(">");
				appendValue(e.getMsg());
				appendValue("</option>");
				
				selectFlag = false;
			}
			appendValue("</select>");
		} catch (Exception e)
		{
			logger.error(e.getMessage(), e);
		}

		return SKIP_BODY;
	}

	protected Writer createTagWriter()
	{
		return pageContext.getOut();
	}

	protected void writeAttribute(String name, String value)
	{
		safeWrite(" " + name + "=\"" + value + "\"");

	}

	protected void appendValue(String value)
	{
		safeWrite(value);
	}

	protected void safeWrite(String value)
	{
		try
		{
			writer.write(value);
		} catch (IOException e)
		{
			logger.error(e.getMessage(), e);
		}
	}

	public String getEmunName()
	{
		return this.emunName;
	}

	public void setEmunName(String emunName)
	{
		this.emunName = emunName;
	}

	public String getSelectValue()
	{
		return this.selectValue;
	}

	public void setSelectValue(String selectValue)
	{
		this.selectValue = selectValue;
	}

	public String getSelectName()
	{
		return this.selectName;
	}

	public void setSelectName(String selectName)
	{
		this.selectName = selectName;
	}

	public String getCssClass()
	{
		return this.cssClass;
	}

	public void setCssClass(String cssClass)
	{
		this.cssClass = cssClass;
	}

	public boolean isAllOption()
	{
		return this.allOption;
	}

	public void setAllOption(boolean allOption)
	{
		this.allOption = allOption;
	}

	public String getOnChange()
	{
		return this.onChange;
	}

	public void setOnChange(String onChange)
	{
		this.onChange = onChange;
	}

}
