package com.youfan.dao;

import com.youfan.entity.ProductInfo;
import com.youfan.vo.ProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.youfan.mapper.ProductInfoMapper;

import java.util.List;

@Component
public class ProductInfoDao {
    @Autowired
    private ProductInfoMapper productInfoMapper;
    public void saveProductInfo(ProductInfo productInfo){
        productInfoMapper.saveProductInfo(productInfo);
    }
    public List<ProductInfo> listProductInfoBy(ProductInfoVo productInfoVo){
        return  productInfoMapper.listProductInfoBy(productInfoVo);

    }
    public void updateProductInfo(ProductInfo productInfo){
        productInfoMapper.updateProductInfo(productInfo);
    }
}
