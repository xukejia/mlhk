package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * Contact Element 联系人信息
 */
public class TCContactVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2897545530487411981L;
	
	// 联系人姓名，不单独区分姓和名
	private String name;
	// 详细地址
	private String address;
	// 邮编
	private String postcode;
	// 联系人邮箱（留空）
	private String email;
	// 联系人手机号，如有多个按,号分割
	private String mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
