package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * ProductItem Elemen
 */
public class TCProductItemVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8540468915153862226L;

	// 外部 ID，此增值服务报价的唯一标识，后续用于生单；长度限制 64 个字符
	private String productItemId;
	// 产品类型 1:行李额
	private Integer productType;
	// 销售类型 1:一次销售，2:二次销售，3:不限一次销售是指增值服务和机票同时购买；二次销售是指买完机票后，再单独购买增值服务
	private Integer saleType;
	// 结算价币种：人民币；单位：元。
	private Long basePrice;
	// 行李说明，当 productType=1 为必传，参考下面的Baggage Element
	private TCBaggageVo baggage;
	// 增值服务退改规则，参考下面的 RefundRule Element
	private TCRefundRuleVo refundRule;

	public String getProductItemId() {
		return productItemId;
	}

	public void setProductItemId(String productItemId) {
		this.productItemId = productItemId;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public Integer getSaleType() {
		return saleType;
	}

	public void setSaleType(Integer saleType) {
		this.saleType = saleType;
	}

	public Long getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Long basePrice) {
		this.basePrice = basePrice;
	}

	public TCBaggageVo getBaggage() {
		return baggage;
	}

	public void setBaggage(TCBaggageVo baggage) {
		this.baggage = baggage;
	}

	public TCRefundRuleVo getRefundRule() {
		return refundRule;
	}

	public void setRefundRule(TCRefundRuleVo refundRule) {
		this.refundRule = refundRule;
	}

}
