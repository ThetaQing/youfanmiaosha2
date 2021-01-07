package com.youfan.control;

import com.youfan.entity.ProductTypeInfo;
import com.youfan.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "productType")
public class ProductTypeControl {
    @Autowired
    private ProductTypeService productTypeService;
    @RequestMapping(value = "toAddProductTypeInfo",method = RequestMethod.GET)
    public String toAddProductTypeInfo(){
        return "toAddProductTypeInfo";

    }

    @RequestMapping(value = "addProductTypeInfo",method = RequestMethod.POST)
    public String addProductTypeInfo(ProductTypeInfo productTypeInfo, Model model){
        if(StringUtils.isEmpty(productTypeInfo.getProducttypeName())){
            model.addAttribute("error","商品名称不能为空");
            return "toAddProductTypeInfo";
        }
        if(StringUtils.isEmpty(productTypeInfo.getGrade())){
            model.addAttribute("error","商品等级不能为空");
            return "toAddProductTypeInfo";
        }
        model.addAttribute("productTypeInfo", productTypeInfo);
        productTypeService.saveProductType(productTypeInfo);
        return "toAddProductTypeInfoSuccess";

    }

}
