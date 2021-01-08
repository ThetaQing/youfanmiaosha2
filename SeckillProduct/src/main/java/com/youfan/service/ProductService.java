package com.youfan.service;

import com.youfan.entity.ProductInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "youfanProduct")
public interface ProductService {
    @RequestMapping(value = "/productOutControl/listProductBy", method = RequestMethod.POST)
    public List<ProductInfo> listProductBy(@RequestParam(value = "shopId") int shopId);

}
