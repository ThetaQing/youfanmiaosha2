package com.youfan.dao;

import com.youfan.entity.MerchantInfo;
import com.youfan.entity.UserInfo;
import com.youfan.mapper.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by li on 2019/2/2.
 */
@Component
public class MerchantDao {

    @Autowired
    private MerchantMapper merchantMapper;

    public MerchantInfo findMerchantByid(int merchantid){
        return merchantMapper.findMerchantInfoByid(merchantid);
    }
    public void saveMerchantInfo(MerchantInfo merchantInfo){
        merchantMapper.saveMerchantInfo(merchantInfo);
    }

    public MerchantInfo findMerchantInfoByAccount(String account){

        return merchantMapper.findMerchantInfoAccount(account);
    }
}
