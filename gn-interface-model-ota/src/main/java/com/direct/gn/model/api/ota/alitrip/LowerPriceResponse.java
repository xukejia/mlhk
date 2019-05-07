package com.direct.gn.model.api.ota.alitrip;

import java.io.Serializable;

public class LowerPriceResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3887912851778809008L;
	private String cabin;     // String X-X仓位
	private String low_price; // Number 200平台低价 单位元
	private String route; // String 3K:HKG-3K696-SIN#SIN-JQ117-DPS平台航程信息
	private String bg_type; // Number 0价格金牌 1 是 0 否
	private String fare_source; // Number 1运价来源：0私有运价 2航司旗舰店 3公布运价 4港航 5东航 6亚航 7比邻 8国泰 9大卖家 10Amadeus 11私有库存 12香港快运 13南航 14春秋 16Espeedairline&Searchone
	private String low_price_supply; // Number 200代理商自己价格 单位元
	private String low_price_supply_bg_type; // Number 1代理商自己价格是否是金牌 1是 0否
	private String tax; // Number 200平台低价 税费
	private String tax_supply; // Number 200代理人低价 税费
	private String product_type ; //Number 1平台低价 产品类型：1普通、2金牌、3极速
	private String product_type_supply ; //Number 1代理人自己价格 产品类型：1普通、2金牌、3极速
	private String special_ticket_supply_type; // Number 1代理人自己价格 特殊票类型：1学生票、2团体票、3年龄票
	private String special_ticket_type; // Number 1平台低价 特殊票类型：1学生票、2团体票、3年龄票
	public String getCabin() {
		return cabin;
	}
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}
	public String getLow_price() {
		return low_price;
	}
	public void setLow_price(String low_price) {
		this.low_price = low_price;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getBg_type() {
		return bg_type;
	}
	public void setBg_type(String bg_type) {
		this.bg_type = bg_type;
	}
	public String getFare_source() {
		return fare_source;
	}
	public void setFare_source(String fare_source) {
		this.fare_source = fare_source;
	}
	public String getLow_price_supply() {
		return low_price_supply;
	}
	public void setLow_price_supply(String low_price_supply) {
		this.low_price_supply = low_price_supply;
	}
	public String getLow_price_supply_bg_type() {
		return low_price_supply_bg_type;
	}
	public void setLow_price_supply_bg_type(String low_price_supply_bg_type) {
		this.low_price_supply_bg_type = low_price_supply_bg_type;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getTax_supply() {
		return tax_supply;
	}
	public void setTax_supply(String tax_supply) {
		this.tax_supply = tax_supply;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public String getProduct_type_supply() {
		return product_type_supply;
	}
	public void setProduct_type_supply(String product_type_supply) {
		this.product_type_supply = product_type_supply;
	}
	public String getSpecial_ticket_supply_type() {
		return special_ticket_supply_type;
	}
	public void setSpecial_ticket_supply_type(String special_ticket_supply_type) {
		this.special_ticket_supply_type = special_ticket_supply_type;
	}
	public String getSpecial_ticket_type() {
		return special_ticket_type;
	}
	public void setSpecial_ticket_type(String special_ticket_type) {
		this.special_ticket_type = special_ticket_type;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
