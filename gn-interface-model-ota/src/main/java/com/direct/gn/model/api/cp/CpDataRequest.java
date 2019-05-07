package com.direct.gn.model.api.cp;

import java.io.Serializable;
import java.util.List;

import com.direct.gn.model.api.gw.GwRouteVo;

public class CpDataRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2594294026012595339L;

	private String platform;
	private List<GwRouteVo> routeList;

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public List<GwRouteVo> getRouteList() {
		return routeList;
	}

	public void setRouteList(List<GwRouteVo> routeList) {
		this.routeList = routeList;
	}

}
