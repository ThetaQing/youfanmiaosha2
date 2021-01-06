package com.youfan.mapper;

import com.youfan.entity.MerchantInfo;
import com.youfan.entity.UserInfo;

/**
 * Created by li on 2019/2/2.
 */
public interface MerchantMapper {
    public MerchantInfo findMerchantInfoByid(int merchantid);
    public void saveMerchantInfo(MerchantInfo merchantfo);
    public MerchantInfo findMerchantInfoAccount(String account);
}
