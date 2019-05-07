/**
 * com.direct.gn
 */
package com.direct.gn.web.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cc
 */
public abstract class BaseController extends com.direct.lication.web.controller.BaseController {


    protected Map<String, Object> getReturnData(com.direct.gn.enums.WebAPIEmun code, String msg, Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", code.getCode());
        map.put("msg", msg);
        map.put("data", data);

        return map;
    }

    protected Map<String, Object> retData(com.direct.gn.enums.WebAPIEmun code, String remark, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code.getCode());
        map.put("msg", code.getMsg() + remark);
        map.put("data", data);
        return map;
    }
}
