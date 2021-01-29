package com.youfan.service;

import com.youfan.entity.ProductInfo;
import com.youfan.form.ProductForm;
import com.youfan.vo.ProductInfoCondition;
import com.youfan.vo.ProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.youfan.dao.ProductInfoDao;

import java.util.Date;
import java.util.List;

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

    public List<ProductInfo> listProductInfoBy(int shopId){
        ProductInfoVo productInfoVo = new ProductInfoVo();
        if(shopId != -1){
            ProductInfoCondition productInfoCondition = new ProductInfoCondition();
            productInfoCondition.setShopId(shopId);
            productInfoCondition.setState(1);
            productInfoVo.setProductInfoCondition(productInfoCondition);
        }


        return productInfoDao.listProductInfoBy(productInfoVo);
    }

    public void updateProductInfo(ProductInfo productInfo){
        productInfo.setUpdateTime(new Date());
        if(productInfo.getState()==1 || productInfo.getState() == 2){
            productInfo.setApproveTime(new Date());
        }

        productInfoDao.updateProductInfo(productInfo);
    }


    public ProductInfo findProductById(int id){
        return productInfoDao.findProductById(id);
    }

}
