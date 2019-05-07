package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCBookValueAddProduct implements Serializable {
    private String productId;  // 产品ID，值机服务映射OnlineCheckInDetail.Id
    private Integer type;  // 产品类型 1：值机服务
    private Integer count;  // 购买数量
    private String tag;  // 定制化产品附加信息
    private Integer processStatus;  // 处理状态 0： 待处理 1：处理成功 2：处理失败
    private String processDetail;  // 处理结果详细信息

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessDetail() {
        return processDetail;
    }

    public void setProcessDetail(String processDetail) {
        this.processDetail = processDetail;
    }
}
