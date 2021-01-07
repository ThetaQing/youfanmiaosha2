package com.youfan.service;

import com.youfan.entity.ProductInfo;
import com.youfan.form.ProductForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.youfan.dao.ProductInfoDao;

import java.util.Date;

@Service
public class ProductInfoService {

    @Autowired
    private ProductInfoDao productInfoDao;
    public void saveProductInfo(ProductForm productForm){
        ProductInfo productInfo = new ProductInfo();
        Double productPrice = Double.valueOf(productForm.getProductPriceParam());
        productInfo.setProductPrice(productPrice);
        productInfo.setProductTitle(productForm.getProductTitle());
        productInfo.setMerchantId(productForm.getMerchantId());
        productInfo.setProductInventory(productForm.getProductInventory());
        productInfo.setProductDiscounts(productForm.getProductDiscounts());

        productInfo.setProductName(productForm.getProductName());

        productInfo.setProductTypeid(productForm.getProductTypeid());
        productInfo.setProductPictureUrl(productForm.getProductPictureUrl());

        productInfo.setState(0);
        productInfo.setCreateTime(new Date());
        productInfoDao.saveProductInfo(productInfo);
    }


}
