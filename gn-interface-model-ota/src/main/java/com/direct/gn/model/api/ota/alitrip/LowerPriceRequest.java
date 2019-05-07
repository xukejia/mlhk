package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

public class LowerPriceRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5954054108968472826L;
	private String airline;
	private String arr;
	private String dep;
	private String dep_date;       //2015-01-13 00:00:00去程旅行日期
	private String return_date;    //2015-01-15 00:00:00回程旅行日期
	private String transfer;       //HKG中转城市
	private String trip_type;      //1单程，2往返
	private String product_type;   //0不限、1普通、2金牌、3极速
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getArr() {
		return arr;
	}
	public void setArr(String arr) {
		this.arr = arr;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getDep_date() {
		return dep_date;
	}
	public void setDep_date(String dep_date) {
		this.dep_date = dep_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public String getTransfer() {
		return transfer;
	}
	public void setTransfer(String transfer) {
		this.transfer = transfer;
	}
	public String getTrip_type() {
		return trip_type;
	}
	public void setTrip_type(String trip_type) {
		this.trip_type = trip_type;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
