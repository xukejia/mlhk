package com.direct.gn.model.api.ota.quanr;

import java.io.Serializable;
import java.util.List;

public class PriceCompareRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4796598648447508468L;

	private List<SearchCondition> searchConditions;
	private String domain;
	private String password;
	public List<SearchCondition> getSearchConditions() {
		return searchConditions;
	}
	public void setSearchConditions(List<SearchCondition> searchConditions) {
		this.searchConditions = searchConditions;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
//	{
//	"searchConditions":[
//	    {
//	        "depCity": "PEK",
//	        "arrCity": "BKK",
//	        "depDate": "2016-12-01",
//	        "retDate":  "2016-12-21",
//	        "carriers": ["TG"，“MF”]
//	    }
//	],
//	"domain":"bj2.trade.qunar.com",
//	"password":"123"
//	}
}
