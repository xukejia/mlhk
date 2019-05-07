package com.direct.gn.web.tag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.taglibs.standard.lang.support.ExpressionEvaluatorManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FormatDateTag extends TagSupport
{

    /**
     * 
     */
    private static final long serialVersionUID = 1616873299197480183L;

    private String codeValue;
    private String pattern;
    protected final static Logger logger = LoggerFactory.getLogger(FormatDateTag.class);

	public int doStartTag() throws JspException
    {
        try
        {
            String value = getCodeValue();
            if (value != null && !value.equals(""))
            {
                value = (String) ExpressionEvaluatorManager.evaluate("value", value, String.class, this, pageContext);
            }
            //logger.debug("*** Value=" + value);
            if (pattern != null && pattern.equals(""))
            {
                pattern = (String) ExpressionEvaluatorManager.evaluate("pattern", pattern, String.class, this, pageContext);
            }
            //logger.debug("*** pattern=" + pattern);
            super.pageContext.getOut().println(formatDate(value, pattern));

        }
        catch (IOException e)
        {
            logger.error(e.getMessage() ,e);
            throw new JspException("Write Errors");
        }
        catch (Exception e)
        {
            logger.error(e.getMessage() ,e);
            throw new JspException("calc Errors");
        }
        return EVAL_BODY_INCLUDE;
    }

    public String formatDate(String srcDateStr, String pattern)
    {

        String returnFormatDate = "";

        if (srcDateStr == null || srcDateStr.equals(""))
            return "";

        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date = null;
        try
        {
            date = format.parse(srcDateStr);
        }
        catch (Exception e)
        {

        }
        returnFormatDate = format.format(date);
        return returnFormatDate;
    }

    public void release()
    {
        super.release();
    }

    public String getPattern()
    {
        return pattern;
    }

    public void setPattern(String pattern)
    {
        this.pattern = pattern;
    }

    public String getCodeValue()
    {
        return codeValue;
    }

    public void setCodeValue(String codeValue)
    {
        this.codeValue = codeValue;
    }
}
