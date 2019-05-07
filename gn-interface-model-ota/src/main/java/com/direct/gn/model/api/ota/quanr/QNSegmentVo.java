package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;

public class QNSegmentVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1901489839559033989L;
	private String carrier;      // 航司IATA二字码，必须与flightNumber航司相同 
	private String flightNumber; //航班号，如：CA123。航班号数字前若有多余的数字 0， 必须去掉，如 CZ006 需返回CZ6 
	private String depAirport;   //出发机场 IATA 三字码 
    private String depTime;      //起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203100300 表示 2012 年 3 月 10 日 3 时 0 分  
    private String arrAirport;   //到达机场 IATA 三字码 
    private String arrTime;      //起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203101305 表示 2012 年 3 月 10 日 13 时 5 分 
    private String stopCities="";   //经停地，/分隔城市三字码 
    private Boolean codeShare;   // 代码共享标识（true代码共享/false 非代码共享）
	private String cabin;        //舱位 
	private String aircraftCode; //机型 
	private Integer cabinClass = 1;   //舱位等级，1 代表经济舱，2 代表商务舱，3 代表头等舱，  
	
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getDepAirport() {
		return depAirport;
	}
	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}
	public String getDepTime() {
		return depTime;
	}
	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
	public String getArrAirport() {
		return arrAirport;
	}
	public void setArrAirport(String arrAirport) {
		this.arrAirport = arrAirport;
	}
	public String getArrTime() {
		return arrTime;
	}
	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	public String getStopCities() {
		return stopCities;
	}
	public void setStopCities(String stopCities) {
		this.stopCities = stopCities;
	}
	public Boolean getCodeShare() {
		return codeShare;
	}
	public void setCodeShare(Boolean codeShare) {
		this.codeShare = codeShare;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public Integer getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(Integer cabinClass) {
		this.cabinClass = cabinClass;
	}

	
	
	public static QNSegmentVo init()
	{
		QNSegmentVo qnseg=new QNSegmentVo();
		qnseg.setCarrier("MU");
		qnseg.setFlightNumber("MU458");
		qnseg.setDepAirport("SZX");
		qnseg.setDepTime("201703151400");
		qnseg.setArrAirport("TPE");
		qnseg.setArrTime("201703151715");
		qnseg.setStopCities("CTU");
		qnseg.setCodeShare(true);
		qnseg.setCabin("Y");
		qnseg.setAircraftCode("747");
		qnseg.setCabinClass(1);
		return qnseg;
	}
	
}
