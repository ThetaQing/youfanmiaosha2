package com.youfan.service;

import com.youfan.dao.ProductTypeDao;
import com.youfan.entity.ProductTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeDao productTypeDao;
    public void saveProductType(ProductTypeInfo productTypeInfo){
        productTypeDao.saveProductType(productTypeInfo);
    }
}
