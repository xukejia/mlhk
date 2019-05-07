package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * Segment Element
 */
public class TCSegmentVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5466690782609122382L;

	// 航司
	private String carrier;
	// 航班号，如：CA1234。航班号数字不足四位，补足四位，如CZ6需返回CZ0006
	private String flightNumber;
	// 出发机场IATA三字码
	private String depAirport;
	// 出发航站楼，使用简写，例如T1
	private String depTerminal;
	// 起飞日期时间，格式：YYYYMMDDHHMM例：201702041305表示2017年2月04日13时5分
	private String depTime;
	// 到达机场IATA三字码
	private String arrAirport;
	// 抵达航站楼，使用简写，例如T1
	private String arrTerminal;
	// 到达日期时间，格式：YYYYMMDDHHMM例：201702041305表示2017年2月04日13时5分
	private String arrTime;
	// 经停机场，/分隔机场三字码(如果有经停，必传)
	private String stopAirports;
	// 代码共享标识（true代码共享/false非代码共享）
	private Boolean codeShare;
	// 实际承运航司，当codeShare=true时，operatingCarrier不能为空
	private String operatingCarrier;
	// 实际承运航班号,如：CA1234。航班号数字不足四位，补足四位，如CZ6需返回CZ0006
	private String operatingFlightNo;
	// 舱位
	private String cabin;
	// 当前可售舱位个数，用于判断库存是否满足客户需求
	private String cabinCount;
	// 舱等头等：F商务：C超经：S经济：Y
	private String cabinGrade = "Y";
	// 机型，IATA标准3字码(只能传3个字符，不符合要求的资源会被过滤),并过滤下列机型运价信息BUS|ICE|LCH|LMO|MTL|RFS|TGV|THS|THT|TRN|TSL
	private String aircraftCode;
	// 飞行时长（分钟），通过时差转换后的结果，无法提供时请赋值0
	private String duration;
	
	private String fareType; // GW报价类型,RP 公布运价,UP私有运价
    private String fareBasis; //GW 运价基础

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getFareBasis() {
		return fareBasis;
	}

	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

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

	public String getDepTerminal() {
		return depTerminal;
	}

	public void setDepTerminal(String depTerminal) {
		this.depTerminal = depTerminal;
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

	public String getArrTerminal() {
		return arrTerminal;
	}

	public void setArrTerminal(String arrTerminal) {
		this.arrTerminal = arrTerminal;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}

	public String getStopAirports() {
		return stopAirports;
	}

	public void setStopAirports(String stopAirports) {
		this.stopAirports = stopAirports;
	}

	public Boolean getCodeShare() {
		return codeShare;
	}

	public void setCodeShare(Boolean codeShare) {
		this.codeShare = codeShare;
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

	public String getCabin() {
		return cabin;
	}

	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	public String getCabinCount() {
		return cabinCount;
	}

	public void setCabinCount(String cabinCount) {
		this.cabinCount = cabinCount;
	}

	public String getCabinGrade() {
		return cabinGrade;
	}

	public void setCabinGrade(String cabinGrade) {
		this.cabinGrade = cabinGrade;
	}

	public String getAircraftCode() {
		return aircraftCode;
	}

	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
