/**
 * com.direct.gn
 */
package com.direct.gn.web.utils;

import javax.servlet.ServletContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author cc
 *
 */
public class SpringUtil
{

	/**
	 * 
	 * description: 获取web应用程序上下文
	 * @return
	 */
	public static WebApplicationContext getCurrentWebApplicationContext(ServletContext sc)
	{
		return WebApplicationContextUtils.getWebApplicationContext(sc);
	}
}
