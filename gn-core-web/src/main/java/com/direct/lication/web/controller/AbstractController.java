/**
 * com.direct.gn
 */
package com.direct.lication.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chobits81.lication.enums.WebAPIEmun;

/**
 * @author cc
 */
public class AbstractController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public String getIpAddr(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    protected Map<String, Object> getReturnData(WebAPIEmun code, String msg, Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", code.getCode());
        map.put("msg", msg);
        map.put("data", data);

        return map;
    }

    protected Map<String, Object> retData(WebAPIEmun code, String remark, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code.getCode());
        map.put("msg", code.getMsg() + remark);
        map.put("data", data);
        return map;
    }
    

}
