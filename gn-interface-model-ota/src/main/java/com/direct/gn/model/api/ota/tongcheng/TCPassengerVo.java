package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * Passengers Element 乘机人信息
 */
public class TCPassengerVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1576611287228700740L;

	// 同程乘机人 ID（票号回填需要回传）
	private String passengerID;
	// LastName 姓
	private String lastName;
	// FirstName 名ageType Yes int 乘客类型 ， 0 成人/1 儿童/-1 留学生
	private String firstName;
	// 生 日 ， 格 式 ：YYYYMMDD
	private String birthday;
	// 乘客性 别 ， M 男 / F 女
	private String gender;
	// 证件号码，最大 15 个字符
	private String cardNum;
	// 证件类型：PP - 护照GA - 港澳通行证TW - 台湾通行证TB - 台胞证HX -回乡证HY - 国际海员证
	private String cardType;
	// 证件发行国家，国家二字码
	private String cardIssuePlace;
	// 证件有效时间，格式：YYYYMMDD
	private String cardExpired;
	// 乘客国籍，国家二字码
	private String nationality;

	public String getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(String passengerID) {
		this.passengerID = passengerID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
