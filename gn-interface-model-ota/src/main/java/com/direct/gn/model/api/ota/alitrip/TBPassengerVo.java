package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

public class TBPassengerVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4866689757000040370L;
	private String name;         //LastName/FirstName MiddleName，姓/名
	private String ageType;     //乘客类型，0 成人/1 儿童/-1 留学生
	private String birthday;     //生日，格式：YYYYMMDD 
	private String gender;       //乘客性别，M 男 / F 女 
	private String cardNum;      //证件号码，最大 15 个字符 
	private String cardType;     //证件类型： PP - 护照 GA - 港澳通行证 TW - 台湾通行证 TB - 台胞证 HX -回乡证	HY - 国际海员证
	private String cardIssuePlace;//证件发行国家，国家二字码
	private String cardExpired;  // 证件有效时间，格式：YYYYMMDD
	private String nationality;  //乘客国籍，国家二字码
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAgeType() {
		return ageType;
	}
	public void setAgeType(String ageType) {
		this.ageType = ageType;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardIssuePlace() {
		return cardIssuePlace;
	}
	public void setCardIssuePlace(String cardIssuePlace) {
		this.cardIssuePlace = cardIssuePlace;
	}
	public String getCardExpired() {
		return cardExpired;
	}
	public void setCardExpired(String cardExpired) {
		this.cardExpired = cardExpired;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
	
	
}
