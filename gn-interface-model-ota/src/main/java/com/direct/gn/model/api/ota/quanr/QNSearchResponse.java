package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;



public class QNSearchResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -148681150553255223L;
	private Integer status ;            //0,成功；其他，失败
	private String msg;                 //提示信息，长度小于64
	private List<QNRouteVo> routings;   // 报价信息，参考下面的Routing Element   
	
	public QNSearchResponse()
	{
	}
	
	public QNSearchResponse(Integer code,String message)
	{
		this.status=code;
		this.msg=message;
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
	public List<QNRouteVo> getRoutings() {
		return routings;
	}
	public void setRoutings(List<QNRouteVo> routings) {
		this.routings = routings;
	}
	
	
	public static void main(String[] args)
	{
		QNSearchResponse qnres=new QNSearchResponse();
		qnres.setMsg("success");
		qnres.setStatus(0);
		List<QNRouteVo> l=new ArrayList<QNRouteVo>();
		l.add(QNRouteVo.init());
		qnres.setRoutings(l);
		System.out.println(JSON.toJSONString(qnres));
	}
	
	public static QNSearchResponse getDemo()
	{
		QNSearchResponse qnres=new QNSearchResponse();
		qnres.setMsg("success");
		qnres.setStatus(0);
		List<QNRouteVo> l=new ArrayList<QNRouteVo>();
		l.add(QNRouteVo.init());
		qnres.setRoutings(l);
		return qnres;
	}
	
	
}
