package com.youfan.control;

import com.youfan.entity.ProductInfo;
import com.youfan.entity.SeckillProductInfo;
import com.youfan.form.SeckillForm;
import com.youfan.service.ProductService;
import com.youfan.service.SeckillProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
@Controller
@RequestMapping("seckillProductControl")
public class SeckillProductControl {

    @Autowired
    ProductService productService;

    @Autowired
    SeckillProductService seckillProductService;


    @RequestMapping(value = "listShopProduct",method = RequestMethod.GET)
    public String listShopProduct(int shopId, Model model){
        List<ProductInfo> productInfos = productService.listProductBy(shopId);
        model.addAttribute("listProduct",productInfos);
        return "listProduct";
    }
    @RequestMapping(value = "preSaveSeckillProduct",method = RequestMethod.GET)
    public String preSaveSeckillProduct(int id, Model model){
        ProductInfo productInfo = productService.findProductById(id);
        model.addAttribute("productInfo",productInfo);
        return "preSaveSeckill";
    }
    @RequestMapping(value = "saveSeckillProduct",method = RequestMethod.POST)
    public String saveSeckillProduct(SeckillForm seckillForm,Model model){
        seckillProductService.saveSeckillProduct(seckillForm);
//        model.addAttribute("productInfo",seckillForm);
        return "seckillSaveSuccess";
    }
    @RequestMapping(value = "listSeckillProductAll",method = RequestMethod.GET)
    public String listSeckillProductAll(int shopId,Model model){
        SeckillForm seckillForm = new SeckillForm();
        seckillForm.setShopId(shopId);
        List<SeckillProductInfo> seckillProductInfos = seckillProductService.listSeckillInfo(seckillForm);
        model.addAttribute("seckillProductInfos",seckillProductInfos);
//        model.addAttribute("productInfo",seckillForm);
        return "listSeckillProductInfo";
    }
   @RequestMapping(value = "updateState",method = RequestMethod.GET)
    public String updateState(int id,int state,Model model){
        seckillProductService.updateSeckillInfoState(id,state);
        return "seckillUpdateSuccess";
    }
    @RequestMapping(value = "listSeckillProductByState",method = RequestMethod.GET)
    public String listSeckillProductAllByState(Model model){
     SeckillForm seckillForm = new SeckillForm();
     seckillForm.setState(3);
     List<SeckillProductInfo> seckillProductInfos = seckillProductService.listSeckillInfo(seckillForm);
     model.addAttribute("seckillProductInfos",seckillProductInfos);

     return "seckillPortal";
    }




}
