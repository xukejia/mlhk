package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;
import java.util.List;

public class SearchCondition implements Serializable {

	private static final long serialVersionUID = 6793097302306459358L;

	private String depCity;
	private String arrCity;
	private String depDate;
	private String retDate;
	private List<String> carriers;
	public String getDepCity() {
		return depCity;
	}
	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}
	public String getArrCity() {
		return arrCity;
	}
	public void setArrCity(String arrCity) {
		this.arrCity = arrCity;
	}
	public String getDepDate() {
		return depDate;
	}
	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}
	public String getRetDate() {
		return retDate;
	}
	public void setRetDate(String retDate) {
		this.retDate = retDate;
	}
	public List<String> getCarriers() {
		return carriers;
	}
	public void setCarriers(List<String> carriers) {
		this.carriers = carriers;
	}
	
	

	
	
//	{
//		"searchConditions":[
//		    {
//		        "depCity": "PEK",
//		        "arrCity": "BKK",
//		        "depDate": "2016-12-01",
//		        "retDate":  "2016-12-21",
//		        "carriers": ["TG"，“MF”]
//		    }
//		],
//		"domain":"bj2.trade.qunar.com",
//		"password":"123"
//		}

	
	
}
