package com.youfan.control;

import com.youfan.entity.ProductInfo;
import com.youfan.form.ProductForm;
import com.youfan.service.ProductDetailService;
import com.youfan.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Control class
 *
 * @author SongQing
 * @date 2021/01/07
 */
@Controller
@RequestMapping("productControl")
public class ProductControl {
    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductDetailService productDetailService;

    /**
    * 商家申请商品
     */

    @RequestMapping(value = "toApplyProduct",method = RequestMethod.GET)
    public String toApplyProduct(){
        return "toApplyProduct";
    }


    /**
     * 申请商品
     * @param productForm
     * @param model
     * @return 申请后页面
     */
    @RequestMapping(value = "applyProduct", method = RequestMethod.POST)
    public String applyProduct(ProductForm productForm, Model model){
        System.out.print(productForm.toString());
         if(StringUtils.isEmpty(productForm.getProductPrice())){
             model.addAttribute("error","商品价格不能为空");
             return "toApplyProduct";
         }
        if(StringUtils.isEmpty(productForm.getProductName())){
             model.addAttribute("error","商品名称不能为空");
            return "toApplyProduct";
         }
        if(StringUtils.isEmpty(productForm.getProductTitle())){
             model.addAttribute("error","商品标题不能为空");
            return "toApplyProduct";
         }


        productInfoService.saveProductInfo(productForm);
        model.addAttribute("productInfo",productForm);
        System.out.println("保存成功");

        return "viewProduct";

    }


    /**
     * 申请商品
     * @param
     * @param model
     * @return 申请后页面
     */
    @RequestMapping(value = "listProduct", method = RequestMethod.GET)
    public String listProduct(Model model){
        System.out.println("productControl/listProduct");
        System.out.println("productControl/listProduct");
        System.out.println("productControl/listProduct");
        System.out.println("productControl/listProduct");

        List<ProductInfo> listProductInfoBy = productInfoService.listProductInfoBy(-1);
        model.addAttribute("listProduct",listProductInfoBy);
        return "listProduct";

    }

    /**
     * 更新商品状态
     * @param
     */
    @RequestMapping(value = "updateState", method = RequestMethod.GET)
    public String updateState(int id,int state,Model model){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setId(id);
        productInfo.setState(state);
        productInfoService.updateProductInfo(productInfo);
        return "listProduct";
    }




}
