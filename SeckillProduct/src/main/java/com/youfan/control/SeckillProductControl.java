package com.youfan.control;

import com.youfan.entity.ProductInfo;
import com.youfan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Controller
@RequestMapping("seckillProductControl")
public class SeckillProductControl {

    @Autowired
    ProductService productService;


    @RequestMapping(value = "listShopProduct",method = RequestMethod.GET)
    public String listShopProduct(int shopId, Model model){
        List<ProductInfo> productInfos = productService.listProductBy(shopId);
        model.addAttribute("listProduct",productInfos);
        return "listProduct";
    }
}
