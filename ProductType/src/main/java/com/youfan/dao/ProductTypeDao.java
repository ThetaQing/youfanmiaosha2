package com.youfan.dao;

import com.youfan.entity.ProductTypeInfo;
import com.youfan.mapper.ProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeDao {
    @Autowired
    private ProductTypeMapper productTypeMapper;
    public void saveProductType(ProductTypeInfo productTypeInfo){
        productTypeMapper.saveProductType(productTypeInfo);
    }

}
