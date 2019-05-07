package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;
import java.util.List;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCBookValueAddResult implements Serializable {
    private List<XCValueAddShoppingCart> shoppingCarts; // 增值服务预定结果，参考下单请求报文的 ValueAddShoppingCart Element 预定成功或者失败，需要修改processStatus的状态

    public List<XCValueAddShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(List<XCValueAddShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }
}
