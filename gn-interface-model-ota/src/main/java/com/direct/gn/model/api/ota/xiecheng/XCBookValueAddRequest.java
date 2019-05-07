package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;
import java.util.List;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCBookValueAddRequest implements Serializable {
    private List<XCValueAddShoppingCart> shoppingCarts; // 增值服务购物车 参考ValueAddShoppingCart Element
    private List<XCOnlineCheckInDetail> onlineCheckIns; // 在线值机服务产品列表 参考OnlineCheckInDetail Element

    public List<XCValueAddShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(List<XCValueAddShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }

    public List<XCOnlineCheckInDetail> getOnlineCheckIns() {
        return onlineCheckIns;
    }

    public void setOnlineCheckIns(List<XCOnlineCheckInDetail> onlineCheckIns) {
        this.onlineCheckIns = onlineCheckIns;
    }
}
