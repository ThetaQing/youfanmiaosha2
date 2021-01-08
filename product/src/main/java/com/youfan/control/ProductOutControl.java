package com.youfan.control;

import com.youfan.entity.ProductInfo;
import com.youfan.form.ProductForm;
import com.youfan.service.ProductDetailService;
import com.youfan.service.ProductInfoService;
import com.youfan.vo.ProductInfoCondition;
import com.youfan.vo.ProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Control class
 *
 * @author SongQing
 * @date 2021/01/07
 */
@RestController
@RequestMapping("productOutControl")
public class ProductOutControl {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductDetailService productDetailService;


    /**
     * 更新商品状态
     * @param
     */
    @RequestMapping(value = "listProductBy", method = RequestMethod.POST)
    public List<ProductInfo> listProductBy(int shopId,Model model){
        ProductInfoVo productInfoVo = new ProductInfoVo();
        ProductInfoCondition productInfoCondition = new ProductInfoCondition();
        productInfoCondition.setShopId(shopId);
        productInfoVo.setProductInfoCondition(productInfoCondition);

        List<ProductInfo> listProductInfoBy = productInfoService.listProductInfoBy(productInfoVo);
        return listProductInfoBy;
    }




}
