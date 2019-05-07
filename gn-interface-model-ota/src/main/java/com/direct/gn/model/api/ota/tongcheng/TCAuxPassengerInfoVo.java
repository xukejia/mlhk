package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * AuxPassengerInfo Element 增值服务乘机人信息
 */
public class TCAuxPassengerInfoVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4434833899325820119L;

	// 同程乘机人 ID
	private String passengerID;
	// LastName 姓
	private String lastName;
	// FirstName 名
	private String firstName;

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

}
