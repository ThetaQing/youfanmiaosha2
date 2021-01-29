package com.youfan.service;

import com.youfan.dao.SeckillProductDao;
import com.youfan.entity.ProductInfo;
import com.youfan.entity.SeckillProductInfo;
import com.youfan.form.SeckillForm;
import com.youfan.utils.DateUtils;
import com.youfan.vo.SeckillProductInfoCondition;
import com.youfan.vo.SeckillProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SeckillProductService {
    @Autowired
    private SeckillProductDao seckillProductDao;

    @Autowired
    private ProductService productService;

    public void saveSeckillProduct(SeckillForm seckillForm){
        SeckillProductInfo seckillProductInfo = new SeckillProductInfo();
        if(seckillForm != null){
            seckillProductInfo.setProductId(seckillForm.getProductId());
            seckillProductInfo.setSeckillNum(0);
            seckillProductInfo.setSeckillPrice(seckillForm.getSeckillPrice());
            System.out.println("获取的id为：");
            System.out.println(seckillForm.getProductId());

            ProductInfo productInfo = productService.findProductById(seckillForm.getProductId());

            System.out.println("库存数量");
            System.out.println(productInfo.toString());
            System.out.println(productInfo.getProductInventory());
            System.out.println(productInfo.getProductInventory());
            System.out.println(productInfo.getProductInventory());
            System.out.println(productInfo.getProductInventory());

            seckillProductInfo.setSeckillInventory(productInfo.getProductInventory());
            seckillProductInfo.setCreateTime(new Date());
            String formatString = "yyyy-MM-dd hh:mm:ss";
            Date startTime = DateUtils.tranferTimeBy(seckillForm.getStartTime(),formatString);
            Date endTime = DateUtils.tranferTimeBy(seckillForm.getEndTime(),formatString);
            seckillProductInfo.setStartTime(startTime);
            seckillProductInfo.setEndTime(endTime);
            seckillProductInfo.setShopId(productInfo.getShopId());
            seckillProductInfo.setState(0);
            seckillProductInfo.setProductName(seckillForm.getProductName());
            seckillProductInfo.setProductTitle(seckillForm.getProductTitle());
            seckillProductInfo.setProductPrice(seckillForm.getProductPrice());
        }
        seckillProductDao.saveSeckillProduct(seckillProductInfo);
    }

    public List<SeckillProductInfo> listSeckillInfo(SeckillForm seckillForm){
        SeckillProductInfoVo seckillProductInfoVo = new SeckillProductInfoVo();
        if(seckillForm != null){
            SeckillProductInfoCondition seckillProductInfoCondition = new SeckillProductInfoCondition();
            if(seckillForm.getShopId() != -1){
                seckillProductInfoCondition.setShopId(seckillForm.getShopId());
            }
            if(seckillForm.getState() != -1){
                seckillProductInfoCondition.setState(seckillForm.getState());
            }
            seckillProductInfoVo.setSeckillProductInfoCondition(seckillProductInfoCondition);



        }
        return seckillProductDao.listSeckillInfo(seckillProductInfoVo);
    }

    public void updateSeckillInfoState(int id,int state){
        SeckillProductInfo seckillProductInfo = new SeckillProductInfo();
        seckillProductInfo.setId(id);
        seckillProductInfo.setState(state);
        if(state==1 || state==2){
            seckillProductInfo.setApproveTime(new Date());
        }
        seckillProductDao.updateSeckillInfoState(seckillProductInfo);
    }

}
