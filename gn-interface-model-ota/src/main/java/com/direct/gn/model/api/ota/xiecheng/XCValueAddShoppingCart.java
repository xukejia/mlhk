package com.direct.gn.model.api.ota.xiecheng;

import java.io.Serializable;
import java.util.List;

/**
 * Created by w2017 on 2017/7/7.
 */
public class XCValueAddShoppingCart implements Serializable {
    private String passengerName;  // LastName/FirstName MiddleName，姓/名
    private List<XCBookValueAddProduct> products; // 选购的产品列表参考BookValueAddProduct Element

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public List<XCBookValueAddProduct> getProducts() {
        return products;
    }

    public void setProducts(List<XCBookValueAddProduct> products) {
        this.products = products;
    }
}
