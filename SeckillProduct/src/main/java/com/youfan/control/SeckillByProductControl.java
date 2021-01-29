package com.youfan.control;

import com.youfan.entity.ProductInfo;
import com.youfan.entity.SeckillProductInfo;
import com.youfan.form.SeckillForm;
import com.youfan.service.ProductService;
import com.youfan.service.SeckillByService;
import com.youfan.service.SeckillProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("seckillByProductControl")
public class SeckillByProductControl {

    @Autowired
    ProductService productService;

    @Autowired
    SeckillProductService seckillProductService;

    @Autowired
    SeckillByService seckillByService;

    @RequestMapping(value = "procedureLockBy",method = RequestMethod.GET)
    public Map<String, String> procedureLockBy(int userid,int id, Model model){
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        Map<String, String> dataMap = seckillByService.procedureLockBy(userid, id);
        return dataMap;
    }



}
