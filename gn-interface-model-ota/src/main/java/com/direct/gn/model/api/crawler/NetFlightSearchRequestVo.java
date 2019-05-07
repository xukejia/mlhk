package com.direct.gn.model.api.crawler;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class NetFlightSearchRequestVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1705699201828358430L;
	// 网页类型: 1电脑端网页 2手机端网页
	private Integer browserType;
	private String tripType; // 行程类型， 1：单程； 2：往返；
	private Integer adultNum = 1; // 1. 没有该字段时，默认乘客类型为成人，乘机总人 数为1 （即：1个成人） 2. 有该字段时，代表乘客类型为成人的乘机总人数
	private Integer childNum = 0; // 1. 没有该字段时，默认为0个儿童 2. 有该字段时，代表乘客类型为儿童的乘机总人数
	private String fromCity; // 出发地 IATA三字码代码
	private String toCity; // 到达地IATA三字码
	private String fromDate; // 去程，格式为 YYYYMMDD
	private String retDate; // 回程日期，格式为 YYYYMMDD（留空表示单程）
	private String exAirline; // 黑名单
	 private String inAirline;// 航司白名单 多个用逗号分开 CA,CZ
	private Proxy proxy;

	public String getInAirline() {
		return inAirline;
	}

	public void setInAirline(String inAirline) {
		this.inAirline = inAirline;
	}

	public Integer getBrowserType() {
		return browserType;
	}

	public void setBrowserType(Integer browserType) {
		this.browserType = browserType;
	}

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public static class Proxy {

		private String ip;
		private Integer port;
		public String proxyUser;
		public String proxyPass;
		/**
		 * 套餐ID abu_dyn abu_pro abu_cla
		 */
		private String setmealID;

		public String getProxyUser() {
			return proxyUser;
		}

		public void setProxyUser(String proxyUser) {
			this.proxyUser = proxyUser;
		}

		public String getProxyPass() {
			return proxyPass;
		}

		public void setProxyPass(String proxyPass) {
			this.proxyPass = proxyPass;
		}

		public String getSetmealID() {
			return setmealID;
		}

		public void setSetmealID(String setmealID) {
			this.setmealID = setmealID;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getPort() {
			return port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}
	}

	public NetFlightSearchRequestVo() {
	}

	public NetFlightSearchRequestVo(String tripType, String fromCity, String toCity, String fromDate, String retDate,
			Integer adultNum, Integer childNum) {
		this.tripType = tripType;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.fromDate = fromDate;
		this.retDate = retDate;
		this.adultNum = adultNum;
		this.childNum = childNum;
	}

	public String getKey() {
		StringBuilder key = new StringBuilder();
		key.append(fromCity).append('-').append(toCity).append('-').append(fromDate);
		if (null != retDate && !"".equals(retDate.trim())) {
			key.append('-').append(retDate);
		}

		return key.toString();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public Integer getAdultNum() {
		return adultNum;
	}

	public void setAdultNum(Integer adultNum) {
		this.adultNum = adultNum;
	}

	public Integer getChildNum() {
		return childNum;
	}

	public void setChildNum(Integer childNum) {
		this.childNum = childNum;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getRetDate() {
		return retDate;
	}

	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getExAirline() {
		return exAirline;
	}

	public void setExAirline(String exAirline) {
		this.exAirline = exAirline;
	}

}
