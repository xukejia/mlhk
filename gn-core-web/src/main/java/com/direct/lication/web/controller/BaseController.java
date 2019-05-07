/**
 * com.direct.gn
 */
package com.direct.lication.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.chobits81.lication.common.IframeConstants;
import com.chobits81.lication.pojo.vo.UserDetailVo;

/**
 * @author cc
 */
public abstract class BaseController extends AbstractController {


    protected UserDetailVo getAdminUser(HttpServletRequest request) {
        return (UserDetailVo) request.getSession().getAttribute(IframeConstants.SEESION_USER);
    }

    protected void setAdminUser(HttpServletRequest request, UserDetailVo user) {
        request.getSession().setAttribute(IframeConstants.SEESION_USER, user);
    }

    protected String ctrl(String reqMapping) {
        return "redirect:" + reqMapping;
    }

    protected ModelAndView mav(String reqMapping, ModelMap map) {
        return new ModelAndView(reqMapping, map);
    }
}
