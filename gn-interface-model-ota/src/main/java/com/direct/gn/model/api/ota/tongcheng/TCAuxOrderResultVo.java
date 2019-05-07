package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;

/**
 * AuxOrderResult Element 增值服务下单返回实体
 */
public class TCAuxOrderResultVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3185248078016997088L;

	// 产品类型 1:行李额
	private Integer productType;
	// G0 成功 G100 请求参数异常 G101 库存不足 G102 价格变动 G103 系统异常 G104 其他失败原因，具体原因请在 msg 内说明
	private String status;
	// 提示信息，长度小于 64
	private String msg;

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
