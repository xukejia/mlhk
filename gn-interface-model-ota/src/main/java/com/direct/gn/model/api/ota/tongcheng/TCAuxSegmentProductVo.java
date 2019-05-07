package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * AuxSegmentProduct Element 增值服务航段商品信息
 */
public class TCAuxSegmentProductVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4148551395254801032L;

	// 航段索引，如 1 表示第一段行程
	private Integer segmentIndex;
	// 增值服务产品描述信息，参考增值服务查询返 回 参 数 定 义 的ProductItemElement
	private TCProductItemVo productItem;

	public Integer getSegmentIndex() {
		return segmentIndex;
	}

	public void setSegmentIndex(Integer segmentIndex) {
		this.segmentIndex = segmentIndex;
	}

	public TCProductItemVo getProductItem() {
		return productItem;
	}

	public void setProductItem(TCProductItemVo productItem) {
		this.productItem = productItem;
	}

}
