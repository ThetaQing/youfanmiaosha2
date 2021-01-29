package com.youfan.form;

public class SeckillForm {
    private int productId;
    private int shopId = -1;
    private String productTitle;//商品标题
    private String productName;//商品名称
    private double productPrice;//商品价格
    private double seckillPrice;//商品秒杀价格

    private String startTime;//开始时间，yyyy-MM-dd hh:mm:ss
    private String endTime;//结束时间,yyyy-MM-dd hh:mm:ss

    private int state = -1;//状态

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(double seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
