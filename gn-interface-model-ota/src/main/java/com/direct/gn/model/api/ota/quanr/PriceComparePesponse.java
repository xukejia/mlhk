package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;

public class PriceComparePesponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4692176127674777924L;

	private String flightInfoOut;
	private String flightInfoIn;
	private String flightNumberOut;
	private String flightNumberIn;
	private String seatClassOut;
	private String seatClassIn;
	private String ownerPrice;
	private String lowestPrice;
	private String ownerTotalPrice;
	private String lowestTotalPrice;
	private String ownerIsLowest;
	public String getFlightInfoOut() {
		return flightInfoOut;
	}
	public void setFlightInfoOut(String flightInfoOut) {
		this.flightInfoOut = flightInfoOut;
	}
	public String getFlightInfoIn() {
		return flightInfoIn;
	}
	public void setFlightInfoIn(String flightInfoIn) {
		this.flightInfoIn = flightInfoIn;
	}
	public String getFlightNumberOut() {
		return flightNumberOut;
	}
	public void setFlightNumberOut(String flightNumberOut) {
		this.flightNumberOut = flightNumberOut;
	}
	public String getFlightNumberIn() {
		return flightNumberIn;
	}
	public void setFlightNumberIn(String flightNumberIn) {
		this.flightNumberIn = flightNumberIn;
	}
	public String getSeatClassOut() {
		return seatClassOut;
	}
	public void setSeatClassOut(String seatClassOut) {
		this.seatClassOut = seatClassOut;
	}
	public String getSeatClassIn() {
		return seatClassIn;
	}
	public void setSeatClassIn(String seatClassIn) {
		this.seatClassIn = seatClassIn;
	}
	public String getOwnerPrice() {
		return ownerPrice;
	}
	public void setOwnerPrice(String ownerPrice) {
		this.ownerPrice = ownerPrice;
	}
	public String getLowestPrice() {
		return lowestPrice;
	}
	public void setLowestPrice(String lowestPrice) {
		this.lowestPrice = lowestPrice;
	}
	public String getOwnerTotalPrice() {
		return ownerTotalPrice;
	}
	public void setOwnerTotalPrice(String ownerTotalPrice) {
		this.ownerTotalPrice = ownerTotalPrice;
	}
	public String getLowestTotalPrice() {
		return lowestTotalPrice;
	}
	public void setLowestTotalPrice(String lowestTotalPrice) {
		this.lowestTotalPrice = lowestTotalPrice;
	}
	public String getOwnerIsLowest() {
		return ownerIsLowest;
	}
	public void setOwnerIsLowest(String ownerIsLowest) {
		this.ownerIsLowest = ownerIsLowest;
	}
	
	
	
//    "flightInfoOut":"HKG-WUH",
//    "flightInfoIn":"WUH-HKG",
//    "flightNumberOut":"CX5852",
//    "flightNumberIn":"CX5855",
//    "seatClassOut":"S",
//    "seatClassIn":"S",
//    "ownerPrice":"1076.0",
//    "lowestPrice":"1071.0",
//    "ownerTotalPrice":"1076.0",
//    "lowestTotalPrice":"1385.0",
//    "ownerIsLowest":false,
 
    
	
}
