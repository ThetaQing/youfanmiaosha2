package com.youfan.mapper;

import com.youfan.entity.ShopInfo;
import com.youfan.vo.ShopInfoVo;

import java.util.List;

public interface ShopMapper {
    void saveShopInfo(ShopInfo shopInfo);
    List<ShopInfo> listShopInfoBy(ShopInfoVo shopInfoVo);
    void updateInfoBy(ShopInfo shopInfo);
}
