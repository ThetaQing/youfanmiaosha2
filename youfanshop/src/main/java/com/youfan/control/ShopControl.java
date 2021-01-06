package com.youfan.control;

import com.youfan.entity.ShopInfo;
import com.youfan.form.ShopApplyForm;
import com.youfan.form.ShopSearchForm;
import com.youfan.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("shopControl")
public class ShopControl {
    @Autowired
    private ShopService shopService;

    /**
    * 商家申请店铺
     */

    @RequestMapping(value = "toApplyShop",method = RequestMethod.GET)
    public String toApplyShop(){
        return "toApplyShop";
    }
   /**
    * 管理员查询页面
     */

    @RequestMapping(value = "toSearchShop",method = RequestMethod.GET)
    public String toSearchShop(){
        return "toSearchShop";
    }

    @RequestMapping(value = "applyShop", method = RequestMethod.POST)
    public String applyShop(ShopApplyForm shopApplyForm, Model model){
         if(StringUtils.isEmpty(shopApplyForm.getMerchantid())){
             model.addAttribute("error","商家IP不能为空");
             return "toApplyShop";
         }
        if(StringUtils.isEmpty(shopApplyForm.getShopName())){
             model.addAttribute("error","店铺名称不能为空");
            return "toApplyShop";
         }
        if(StringUtils.isEmpty(shopApplyForm.getBusinessLicense())){
             model.addAttribute("error","营业执照不能为空");
            return "toApplyShop";
         }
        shopService.saveShopInfo(shopApplyForm);
        System.out.println("保存成功");

        return "view";

    }

    /**
     * 管理员查询所有的店铺
     */
    @RequestMapping(value = "searchShop",method = RequestMethod.POST)
    public String searchShop(ShopSearchForm shopSearchForm,Model model){
        List<ShopInfo> listShop = shopService.listShopInfoBy(shopSearchForm);
        model.addAttribute("listShop",listShop);
        return "listShop";
    }

    /**
     * 管理员修改店铺状态
     */
    @RequestMapping(value = "updateState",method = RequestMethod.GET)
    public String updateState(int state,int id){
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setId(id);
        shopInfo.setState(state);
        shopService.updateInfoBy(shopInfo);

        return "listShop";
    }



}
