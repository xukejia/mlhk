/**
 * com.direct.gn
 */
package com.direct.lication.web.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.chobits81.lication.common.MvcConstant;
import com.chobits81.lication.pojo.vo.ResultVO;
import com.chobits81.lication.pojo.vo.UserDetailVo;
import com.chobits81.lication.utils.CommonUtils;
import com.chobits81.lication.utils.CookieUtils;
import com.chobits81.lication.utils.SyscfgUtil;
import com.smart.rbac.tokenAuth.api.TokenAuthApi;

/**
 * @author cc
 *
 */
@Component
public class SessionFilter implements Filter {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private TokenAuthApi tokenAuthApi;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String resultVoJson = null;
		try {
			resultVoJson = tokenAuthApi.getCurrentUserDetailVoBysecret(CookieUtils.getLoginToken(request),
					SyscfgUtil.getValue(MvcConstant.SECRET));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResultVO resultVO = null;

		final String[] notFilter = new String[] { "index", "verifyCodeServlet", "logout", "load", "appload",
				"getsecret", "getRefererUrl", "getVersion", "gettestToken", "addCookie", };
		final String uri = request.getRequestURI();

		boolean validFlag = true;
		final String regURI = request.getContextPath() + "/admin/";
		boolean indexFlag = false;

		String mId = request.getParameter("mId");
		if (null == mId && null == request.getSession().getAttribute("MENU_SELECT_ID")) {
			request.getSession().setAttribute("MENU_SELECT_ID", 1);
		}
		if (null != mId)
			request.getSession().setAttribute("MENU_SELECT_ID", mId);

		for (String s : notFilter) {
			if (uri.equals(regURI)) {
				indexFlag = true;
				validFlag = false;
				break;
			}
			if (uri.indexOf(s) != -1) {
				validFlag = false;
				break;
			}
		}
		if (indexFlag) {
			this.returnIndex(request, response);
			return;
		}
		if (validFlag == false) {
			chain.doFilter(request, response);
			return;
		}

		UserDetailVo user = null;
		if (CommonUtils.isNotBlank(resultVoJson)) {
			resultVO = JSON.parseObject(resultVoJson, ResultVO.class);
			if (resultVO.getCode() == 1) {
				user = JSON.parseObject(resultVO.getData(), UserDetailVo.class);
			}
		}

		if (null == user) {
			this.returnLoginPage(request, response);
			return;
		} else {
			// 这里获取的是Controller地址
			String pathurl = request.getServletPath();
            String name="";
			if(pathurl!=null) {
			    name=pathurl.indexOf("admin/")!=-1?pathurl.substring(pathurl.lastIndexOf("admin/")+6, pathurl.length()):pathurl;
				if(name.indexOf("?")!=-1) {
				   name=name.substring(0, name.indexOf("?"));
				}
				
			}
			// 对超管不做限制
			if ("1".equals(user.getIsAdmin())) {
				chain.doFilter(request, response);
				return;
			}
			Set<String> permitActionSet = user.getPermitPermissionSet();
			Iterator<String> it = permitActionSet.iterator();
			if (CommonUtils.isBlank(name) || !contains(it, name)) {
				this.returnIndexPage(request, response);
				return;
			}

		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}

	public boolean contains(Iterator<String> it, String o) {
		if (o == null) {
			while (it.hasNext())
				if (it.next() == null)
					return true;
		} else {
			while (it.hasNext())
				if (it.next().indexOf(o) != -1)
					return true;
		}
		return false;
	}

	/**
	 * 权限拦截返回首页
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void returnIndexPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		StringBuilder builder = new StringBuilder();
		builder.append("<script type=\"text/javascript\">alert('您没有权限访问该功能！');window.top.location.href='");
		builder.append(request.getContextPath() + "/admin/index';</script>");
		out.print(builder.toString());
		try {
			out.close();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	private void returnLoginPage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		StringBuilder builder = new StringBuilder();
		builder.append("<script type=\"text/javascript\">alert('网页过期，请重新登录！');window.top.location.href='");
		builder.append(request.getContextPath() + "/admin/index';</script>");
		out.print(builder.toString());
		try {
			out.close();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	private void returnIndex(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		StringBuilder builder = new StringBuilder();
		builder.append("<script type=\"text/javascript\">window.top.location.href='");
		builder.append(request.getContextPath() + "/admin/index';</script>");
		out.print(builder.toString());
		try {
			out.close();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

}
