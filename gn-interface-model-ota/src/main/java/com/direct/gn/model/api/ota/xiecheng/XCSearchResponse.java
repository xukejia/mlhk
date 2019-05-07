package com.direct.gn.model.api.ota.xiecheng;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class XCSearchResponse implements Serializable {
    private Integer status;            //0,成功；其他，失败
    private String msg;                 //提示信息，长度小于64
    private List<XCRouteVo> routings;   // 报价信息，参考下面的Routing Element

    public XCSearchResponse() {
    }

    public XCSearchResponse(Integer code, String message) {
        this.status = code;
        this.msg = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<XCRouteVo> getRoutings() {
        return routings;
    }

    public void setRoutings(List<XCRouteVo> routings) {
        this.routings = routings;
    }


    public static void main(String[] args) {
        XCSearchResponse qnres = new XCSearchResponse();
        qnres.setMsg("success");
        qnres.setStatus(0);
        List<XCRouteVo> l = new ArrayList<XCRouteVo>();
        l.add(XCRouteVo.init());
        qnres.setRoutings(l);
        System.out.println(JSON.toJSONString(qnres));
    }

    public static XCSearchResponse getDemo() {
        XCSearchResponse qnres = new XCSearchResponse();
        qnres.setMsg("success");
        qnres.setStatus(0);
        List<XCRouteVo> l = new ArrayList<XCRouteVo>();
        l.add(XCRouteVo.init());
        qnres.setRoutings(l);
        return qnres;
    }


}
