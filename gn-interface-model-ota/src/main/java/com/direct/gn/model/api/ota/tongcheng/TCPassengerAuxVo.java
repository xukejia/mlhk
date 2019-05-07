package com.direct.gn.model.api.ota.tongcheng;

import java.io.Serializable;
import java.util.List;

/**
 * PassengerAux Element 乘机人购买增值扩展服务信息
 */
public class TCPassengerAuxVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1820374261855745701L;

	// 乘机人信息，参考下面的 AuxPassengerInfoElement
	private TCAuxPassengerInfoVo auxPassengerInfo;
	// 乘机人购买增值服务信 息 ， 参 考 下 面 的AuxSegmentProductElement
	private List<TCAuxSegmentProductVo> auxSegmentProducts;

	public TCAuxPassengerInfoVo getAuxPassengerInfo() {
		return auxPassengerInfo;
	}

	public void setAuxPassengerInfo(TCAuxPassengerInfoVo auxPassengerInfo) {
		this.auxPassengerInfo = auxPassengerInfo;
	}

	public List<TCAuxSegmentProductVo> getAuxSegmentProducts() {
		return auxSegmentProducts;
	}

	public void setAuxSegmentProducts(List<TCAuxSegmentProductVo> auxSegmentProducts) {
		this.auxSegmentProducts = auxSegmentProducts;
	}

}
