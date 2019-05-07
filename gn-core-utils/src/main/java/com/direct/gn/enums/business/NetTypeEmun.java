package com.direct.gn.enums.business;

import com.direct.gn.enums.BaseEmun;
import com.direct.gn.enums.GeneralStatusEmum;

public enum NetTypeEmun implements BaseEmun {

	ONE_NGW("NGW", "NGW"), ONE_IGW("IGW", "IGW");

	private NetTypeEmun(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	private String code;
	private String msg;
	private String extend;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getExtend() {
		return this.extend;
	}

	public void setExtend(String extend) {
		this.extend = extend;
	}

	public static GwTypeEmun emunByCode(String code) {
		for (GwTypeEmun e : GwTypeEmun.values()) {
			if (e.getCode().equals(code)) {
				return e;
			}
		}
		return null;
	}

	@Override
	public String getEmunByCode(String code) {
		String result = "";
		BaseEmun[] es = getBaseEmuns();
		for (BaseEmun e : es) {
			if (e.getCode().equals(code)) {
				result = e.getMsg();
				break;
			}
		}
		return result;
	}

	@Override
	public BaseEmun[] getBaseEmuns() {
		return GeneralStatusEmum.values();
	}

}
