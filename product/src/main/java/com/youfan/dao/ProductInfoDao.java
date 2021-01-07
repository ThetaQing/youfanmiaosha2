package com.youfan.dao;

import com.youfan.entity.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.youfan.mapper.ProductInfoMapper;

@Component
public class ProductInfoDao {
    @Autowired
    private ProductInfoMapper productInfoMapper;
    public void saveProductInfo(ProductInfo productInfo){
        productInfoMapper.saveProductInfo(productInfo);
    }

}
