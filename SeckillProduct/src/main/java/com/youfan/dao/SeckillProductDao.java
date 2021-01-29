package com.youfan.dao;

import com.youfan.entity.SeckillProductInfo;
import com.youfan.mapper.SeckillProductMapper;
import com.youfan.vo.SeckillProductInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by li on 2019/3/9.
 */
@Component
public class SeckillProductDao {

    @Autowired
    private SeckillProductMapper seckillProductMapper;

    public void saveSeckillProduct(SeckillProductInfo seckillProductInfo){
            seckillProductMapper.saveSeckillProduct(seckillProductInfo);
    }

    public List<SeckillProductInfo> listSeckillInfo(SeckillProductInfoVo seckillProductInfoVo){
        return seckillProductMapper.listSeckillInfo(seckillProductInfoVo);
    }

    public void updateSeckillInfoState(SeckillProductInfo seckillProductInfo){
        seckillProductMapper.updateSeckillInfoState(seckillProductInfo);
    }
    public SeckillProductInfo findSeckillProductInfoById(int id){
        return seckillProductMapper.findSeckillProductInfoById(id);
    }
    public void updateSeckillInfoBySecNum(SeckillProductInfo seckillProductInfo){
        seckillProductMapper.updateSeckillInfoBySecNum(seckillProductInfo);

    }
}
