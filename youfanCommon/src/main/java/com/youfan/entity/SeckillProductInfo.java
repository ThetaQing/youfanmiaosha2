package com.youfan.entity;

import java.util.Date;

public class SeckillProductInfo {
    private int id;
    private int productId;
    private int seckillNum;
    private int shopId;
    private double seckillPrice;
    private double seckillInventory;
    private Date createTime;
    private Date startTime;
    private Date endTime;
    private Date approveTime;
    private int state;
    private double productPrice;
    private String productTitle;
    private String productName;

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSeckillNum() {
        return seckillNum;
    }

    public void setSeckillNum(int seckillNum) {
        this.seckillNum = seckillNum;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public double getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(double seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public double getSeckillInventory() {
        return seckillInventory;
    }

    public void setSeckillInventory(double seckillInventory) {
        this.seckillInventory = seckillInventory;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
