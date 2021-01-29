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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Creadte by ThetaQing
 * 所有的秒杀实现
 */
@Service

public class SeckillByService {
    @Autowired
    private SeckillProductDao seckillProductDao;

    @Autowired
    private ProductService productService;

    private Lock lock = new ReentrantLock();

    @Transactional
    public Map<String,String> procedureLockBy(int userid, int id){
        HashMap<String, String> dataMap = new HashMap<>();
        lock.lock();
        try {

            SeckillProductInfo seckillProductInfoById = seckillProductDao.findSeckillProductInfoById(id);
            double seckillInventory = seckillProductInfoById.getSeckillInventory();
            int seckillNum = seckillProductInfoById.getSeckillNum();
            seckillNum++;
            if(seckillNum>seckillInventory){
                System.out.println("卖完了，谢谢惠顾！！！");
                dataMap.put("flag","fail");
                dataMap.put("data","已卖完");
                return dataMap;
            }
            SeckillProductInfo seckillProductInfo = new SeckillProductInfo();
            seckillProductInfo.setId(id);
            seckillProductInfo.setSeckillNum(seckillNum);
            seckillProductDao.updateSeckillInfoBySecNum(seckillProductInfo);
            dataMap.put("flag","success");
            dataMap.put("data","秒杀成功");
            return dataMap;

        }finally {
            lock.unlock();
             System.out.println(dataMap.toString());
            System.out.println(dataMap.toString());
            System.out.println(dataMap.toString());
            System.out.println(dataMap.toString());


        }



    }


}
