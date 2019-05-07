package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;


public class TBSearchResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9015306845690753912L;
	private String status ;            //0,成功；其他，失败
	private String msg;                 //提示信息，长度小于64
	private List<TBRouteVo> routings;   // 报价信息，参考下面的Routing Element   
	
	public TBSearchResponse()
	{
	}
	
	public TBSearchResponse(String code,String message)
	{
		this.status=code;
		this.msg=message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<TBRouteVo> getRoutings() {
		return routings;
	}
	public void setRoutings(List<TBRouteVo> routings) {
		this.routings = routings;
	}
	
	public static void main(String[] args)
	{
		TBSearchResponse tbres=new TBSearchResponse();
		tbres.setMsg("success");
		tbres.setStatus("0");
		List<TBRouteVo> l=new ArrayList<TBRouteVo>();
		l.add(TBRouteVo.init());
		l.add(TBRouteVo.init());
		tbres.setRoutings(l);
		System.out.println(JSON.toJSONString(tbres));
	}
	public static TBSearchResponse getDemo()
	{
		TBSearchResponse tbres=new TBSearchResponse();
		tbres.setMsg("success");
		tbres.setStatus("0");
		List<TBRouteVo> l=new ArrayList<TBRouteVo>();
		l.add(TBRouteVo.init());
		l.add(TBRouteVo.init());
		tbres.setRoutings(l);
		return tbres;
	}
	
	
}
