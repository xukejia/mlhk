package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

public class TBContactVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4824526537783584557L;
	private String name;            //联系人姓名，不单独区分姓和名
	private String address;         //详细地址
	private String postcode;        //邮编
	private String email;           //联系人邮箱（留空）
	private String mobile;          //联系人手机号，接口方提供固定手机号，不使用用 户手机
	
	
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
