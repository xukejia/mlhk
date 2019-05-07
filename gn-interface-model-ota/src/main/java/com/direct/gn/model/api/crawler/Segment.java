package com.direct.gn.model.api.crawler;


import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 航程信息
 */
public class Segment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3838986034157000100L;
	private String depAirport;//起飞    DMK
	private String depTime;//起飞时间   201203140140
	private String arrAirport;//到达       KUL                               
	private String arrTime;//到达时间    201203140140                               
	private String fTime;//飞行时间                                       
	private String flightNumber;//航班号  AK1023
	private String cabin;//仓位 Y
	private String seatCount;//仓位数  9
	private String aircraftCode; //机型 
	private String codeShare;   // 代码共享标识（true代码共享/false 非代码共享）
    private String sharingFlightNumber; //共享航班号（非必须，codeShare为true时请提供）
	private String stopCities;//经停
	private String cabinType;
	private String cabinTypeCh;
	private String productType; 
	private String productTypeCh; 
	
	public String getCabinType() {
		return cabinType;
	}
	public void setCabinType(String cabinType) {
		this.cabinType = cabinType;
	}
	public String getCabinTypeCh() {
		return cabinTypeCh;
	}
	public void setCabinTypeCh(String cabinTypeCh) {
		this.cabinTypeCh = cabinTypeCh;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductTypeCh() {
		return productTypeCh;
	}
	public void setProductTypeCh(String productTypeCh) {
		this.productTypeCh = productTypeCh;
	}
	public String getCodeShare() {
		return codeShare;
	}
	public void setCodeShare(String codeShare) {
		this.codeShare = codeShare;
	}
	public String getSharingFlightNumber() {
		return sharingFlightNumber;
	}
	public void setSharingFlightNumber(String sharingFlightNumber) {
		this.sharingFlightNumber = sharingFlightNumber;
	}
	public String getAircraftCode() {
		return aircraftCode;
	}
	public void setAircraftCode(String aircraftCode) {
		this.aircraftCode = aircraftCode;
	}
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
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
	public String getfTime() {
		return fTime;
	}
	public void setfTime(String fTime) {
		this.fTime = fTime;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String getStopCities() {
		return stopCities;
	}
	public void setStopCities(String stopCities) {
		this.stopCities = stopCities;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.SHORT_PREFIX_STYLE);
		
	}
}