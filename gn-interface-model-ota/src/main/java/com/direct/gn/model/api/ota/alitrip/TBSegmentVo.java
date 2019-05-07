package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;
import java.util.List;

public class TBSegmentVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8503453154464177363L;
	private String carrier;      // 航司IATA二字码，必须与flightNumber航司相同 
	private String flightNumber; //航班号，如：CA123。
	private String depAirport;   //出发机场 IATA 三字码 
    private String depTime;      //起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203100300 表示 2012 年 3 月 10 日 3 时 0 分  
    private String arrAirport;   //到达机场 IATA 三字码 
    private String arrTime;      //起 飞 日 期 时 间 ， 格 式 ： YYYYMMDDHHMM 例： 201203101305 表示 2012 年 3 月 10 日 13 时 5 分 
    private String stopCities;   //经停地，/分隔城市三字码 
    private String codeShare;   // 代码共享标识（true代码共享/false 非代码共享）
    private String sharingFlightNumber; //共享航班号（非必须，codeShare为true时请提供）
    private String departureTerminal;   //出发航站楼(非必须)
    private String arrivingTerminal;    //到达航站楼(非必须)
	private String cabin;        //舱位 
	private String aircraftCode; //机型 
	private String seatCount;   //舱位数（非必须）  
	
	private String cabinClass="Y";//仓位等级，Y经济舱，C商务舱，F头等舱
	
	//按航段提供 farebasis，若返回含有多个航段，需要每个航段都返回一个 farebasis，多个之间用英文逗号隔开 
	private String fareBasis;
	//表示运价类型，指代提前销售折扣运价等不同运价类型；fareTypeCode 为字符串格式，不允许填写特殊字符每个航段必须对应 1 个，若多个航段运价所属同一个faretypecode，则相同 code 填多次 
	private String fareTypeCode;
	//四位字符，数字或英文字符组合，不支持特殊字符.若多个航段使用同一个运价，则相同 ruleNo 填多次 
	private String ruleNo;
	//托运行李额说明，参考下面的 Baggage Element。一份报价每个航段的 baggage 节点必须全有或者全没有。如果无免费托运行李额则设置行李总件数为 0.当航段的 baggage 节点非空，且无免费托运行李额，商家投放的辅营产品才能展示在订单填写页面。当此节点非空，则忽略 rule 节点的 hasBaggage 和baggage 的节点内容(此功能只针对特定航司开放)失效时间请等待运营通知。 
	private TBBaggageVo baggage;
	//托运行李额说明，参考下面的 Baggage Element。一份报价每个航段的 baggages 节点必须全有或者全没有。如果无免费托运行李额则设置行李总件数为 0.当航段的 baggages 节点非空，且无免费托运行李额，商家投放的辅营产品才能展示在订单填写页面。当此节点非空，则忽略 rule 节点的 hasBaggage 和baggages 的节点内容(此功能只针对特定航司开放)生效时间请等待运营通知。 
	private List<TBBaggageVo> baggages;
	
	public String getFareBasis() {
		return fareBasis;
	}
	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}
	public String getFareTypeCode() {
		return fareTypeCode;
	}
	public void setFareTypeCode(String fareTypeCode) {
		this.fareTypeCode = fareTypeCode;
	}
	public String getRuleNo() {
		return ruleNo;
	}
	public void setRuleNo(String ruleNo) {
		this.ruleNo = ruleNo;
	}
	public TBBaggageVo getBaggage() {
		return baggage;
	}
	public void setBaggage(TBBaggageVo baggage) {
		this.baggage = baggage;
	}
	public List<TBBaggageVo> getBaggages() {
		return baggages;
	}
	public void setBaggages(List<TBBaggageVo> baggages) {
		this.baggages = baggages;
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
	public String getDepartureTerminal() {
		return departureTerminal;
	}
	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}
	public String getArrivingTerminal() {
		return arrivingTerminal;
	}
	public void setArrivingTerminal(String arrivingTerminal) {
		this.arrivingTerminal = arrivingTerminal;
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
	public String getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}
	public String getCabinClass() {
		return cabinClass;
	}
	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}
	public static TBSegmentVo init()
	{
		TBSegmentVo tbseg=new TBSegmentVo();
		tbseg.setCarrier("MU");
		tbseg.setFlightNumber("MU458");
		tbseg.setDepAirport("SZX");
		tbseg.setDepTime("201703151400");
		tbseg.setArrAirport("TPE");
		tbseg.setArrTime("201703151715");
		tbseg.setStopCities("CTU");
		tbseg.setCodeShare("true");
		tbseg.setSharingFlightNumber("CA189");
		tbseg.setDepartureTerminal("T1");
		tbseg.setArrivingTerminal("T2");
		tbseg.setCabin("Y");
		tbseg.setAircraftCode("747");
		tbseg.setSeatCount("9");
		tbseg.setCabinClass("Y");
		return tbseg;
	}
	
	
	
	
}
