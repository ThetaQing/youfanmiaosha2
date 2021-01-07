package com.youfan.form;

import com.youfan.entity.ProductInfo;

public class ProductForm extends ProductInfo {
    private String productPriceParam;

    public String getProductPriceParam() {
        return productPriceParam;
    }

    public void setProductPriceParam(String productPriceParam) {
        this.productPriceParam = productPriceParam;
    }

    @Override
    public String toString() {
        return "ProductForm{" +
                "productPriceParam='" + productPriceParam + '\'' +
                "} " + super.toString();
    }
}
