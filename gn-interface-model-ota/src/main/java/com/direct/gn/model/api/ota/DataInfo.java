package com.direct.gn.model.api.ota;

import java.time.LocalDateTime;
import java.util.List;

public class DataInfo {

	private String k;//key：TB-SL-CTU-DMK-20170530
	private String p;//价格项，格式：仓位数,成人价,成人税,儿童价,儿童税,查询OfficeID,预订OfficeID,GW类型
	private List<String> fs;//去程项，格式：出发,到达,出发时间,到达时间,航班号,仓位,机型,是否共享,经停
	private List<String> rs;//回程项，格式：出发,到达,出发时间,到达时间,航班号,仓位,机型,是否共享,经停
	private String t = LocalDateTime.now().toString();
	private String d;//第三方data
	
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getK() {
		return k;
	}
	public void setK(String k) {
		this.k = k;
	}
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public List<String> getFs() {
		return fs;
	}
	public void setFs(List<String> fs) {
		this.fs = fs;
	}
	public List<String> getRs() {
		return rs;
	}
	public void setRs(List<String> rs) {
		this.rs = rs;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
}
