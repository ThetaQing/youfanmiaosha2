package com.youfan.service;

import com.mysql.jdbc.StringUtils;
import com.youfan.dao.ShopDao;
import com.youfan.entity.ShopInfo;
import com.youfan.form.ShopApplyForm;
import com.youfan.form.ShopSearchForm;
import com.youfan.vo.ShopInfoCondition;
import com.youfan.vo.ShopInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopDao shopDao;
    public void saveShopInfo(ShopApplyForm shopApplyForm){

        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setBusinessLicense(shopApplyForm.getBusinessLicense());
        shopInfo.setProvince(shopApplyForm.getProvince());
        shopInfo.setCity(shopApplyForm.getCity());
        shopInfo.setMerchantid(shopApplyForm.getMerchantid());
        shopInfo.setShopName(shopApplyForm.getShopName());
        shopInfo.setShopDescription(shopApplyForm.getShopDescription());
        shopInfo.setState(0);
        shopInfo.setShopBussinessScope(shopApplyForm.getShopBussinessScope());
        shopInfo.setCreateTime(new Date());

        shopDao.saveShopInfo(shopInfo);
    }
    public List<ShopInfo> listShopInfoBy(ShopSearchForm shopSearchForm){
        ShopInfoVo shopInfoVo = new ShopInfoVo();
        ShopInfoCondition shopInfoCondition = new ShopInfoCondition();
        if(!StringUtils.isNullOrEmpty(shopSearchForm.getShopName())){
            shopInfoCondition.setShopName(shopSearchForm.getShopName());
        }
        if(!StringUtils.isNullOrEmpty(shopSearchForm.getState())){
            shopInfoCondition.setState(Integer.valueOf(shopSearchForm.getState()));
        }
        shopInfoVo.setShopInfoCondition(shopInfoCondition);
        return shopDao.listShopInfoBy(shopInfoVo);
    }

    public void updateInfoBy(ShopInfo shopInfo){
        shopDao.updateInfoBy(shopInfo);
    }
}
