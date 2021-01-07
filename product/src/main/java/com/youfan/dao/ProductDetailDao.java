package com.youfan.dao;

import com.youfan.entity.ProductDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.youfan.mapper.ProductDetailMapper;

@Component
public class ProductDetailDao {
    @Autowired
    private ProductDetailMapper productDetailMapper;
    public void saveProductDetailInfo(ProductDetail productDetail){
        productDetailMapper.saveProductDetailInfo(productDetail);
    }


}
