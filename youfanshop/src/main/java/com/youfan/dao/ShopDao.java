package com.youfan.dao;

import com.youfan.entity.ShopInfo;
import com.youfan.mapper.ShopMapper;
import com.youfan.vo.ShopInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopDao {
    @Autowired
    private ShopMapper shopMapper;
    public void saveShopInfo(ShopInfo shopInfo){
        shopMapper.saveShopInfo(shopInfo);
    }

    public List<ShopInfo> listShopInfoBy(ShopInfoVo shopInfoVo){
        return shopMapper.listShopInfoBy(shopInfoVo);
    }
    public void updateInfoBy(ShopInfo shopInfo){
        shopMapper.updateInfoBy(shopInfo);
    }


}
