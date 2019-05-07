package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

public class XCSegmentVo implements Serializable{

	private String carrier;      // 航司IATA二字码，必须与flightNumber航司相同
	private String flightNumber; //航班号，如：CA123。航班号数字前若有多余的数字 0， 必须去掉，如 CZ006 需返回CZ6 
	private String depAirport;   //出发机场 IATA 三字码 
    private String depTime;      //起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203100300 表示 2012 年 3 月 10 日 3 时 0 分  
    private String arrAirport;   //到达机场 IATA 三字码 
    private String arrTime;      //起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203101305 表示 2012 年 3 月 10 日 13 时 5 分 
    private String stopCities="";   //经停地，/分隔城市三字码 
    private Boolean codeShare;   // 代码共享标识（true代码共享/false 非代码共享）
	private String cabin;        //舱位 
	private Integer cabinClass = 1;   //舱位等级，1 代表经济舱，2 代表商务舱，3 代表头等舱，
	private String depTerminal;  // 出发航站楼；使用简写，例如T1
	private String arrTerminal;  // 抵达航站楼，使用简写，例如T1
	private String stopAirports;  // 经停机场； IATA 三字码
	private String operatingCarrier;  // 实际承运航司 若codeShare=true， operatingCarrier不能为空。
	private String operatingFlightNo;  // 实际承运航班号
	private String cabinGrade = "Y";  // 舱等；	头等：F；商务：C；超经：S；经济：Y【目前仅支持返回Y】
	private String aircraftCode;  // 机型 ，IATA标准3字码,并过滤下列机型运价信息BUS|ICE|LCH|LMO|MTL|RFS|TGV|THS|THT|TRN|TSL|
	private Integer duration;  // 飞行时长；	单位为分钟，通过时差转换后的结果。


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

	public String getDepTerminal() {
		return depTerminal;
	}

	public void setDepTerminal(String depTerminal) {
		this.depTerminal = depTerminal;
	}

	public String getArrTerminal() {
		return arrTerminal;
	}

	public void setArrTerminal(String arrTerminal) {
		this.arrTerminal = arrTerminal;
	}

	public String getStopAirports() {
		return stopAirports;
	}

	public void setStopAirports(String stopAirports) {
		this.stopAirports = stopAirports;
	}

	public String getOperatingCarrier() {
		return operatingCarrier;
	}

	public void setOperatingCarrier(String operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}

	public String getOperatingFlightNo() {
		return operatingFlightNo;
	}

	public void setOperatingFlightNo(String operatingFlightNo) {
		this.operatingFlightNo = operatingFlightNo;
	}

	public String getCabinGrade() {
		return cabinGrade;
	}

	public void setCabinGrade(String cabinGrade) {
		this.cabinGrade = cabinGrade;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public static XCSegmentVo init()
	{
		XCSegmentVo qnseg=new XCSegmentVo();
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
