package com.youfan.mapper;

import com.youfan.entity.ProductInfo;
import com.youfan.entity.ShopInfo;
import com.youfan.vo.ProductInfoVo;
import com.youfan.vo.ShopInfoVo;
import org.springframework.ui.Model;

import java.util.List;

public interface ProductInfoMapper {
    void saveProductInfo(ProductInfo productInfo);

    List<ProductInfo> listProductInfoBy(ProductInfoVo productInfoVo);
    void updateProductInfo(ProductInfo productInfo);
    public ProductInfo findProductById(int id);
}
