package com.youfan.mapper;

import com.youfan.entity.SeckillProductInfo;
import com.youfan.vo.SeckillProductInfoVo;

import java.util.List;

public interface SeckillProductMapper {
    void saveSeckillProduct(SeckillProductInfo seckillProductInfo);
    List<SeckillProductInfo> listSeckillInfo(SeckillProductInfoVo seckillProductInfoVo);
    void updateSeckillInfoState(SeckillProductInfo seckillProductInfo);
    void updateSeckillInfoBySecNum(SeckillProductInfo seckillProductInfo);
    SeckillProductInfo findSeckillProductInfoById(int id);
}
