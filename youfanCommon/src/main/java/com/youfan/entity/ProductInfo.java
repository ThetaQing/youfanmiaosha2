package com.youfan.entity;

import java.util.Date;

public class ProductInfo {
    private int id;

    private String productTitle;
    private String productName;
    private String productPictureUrl;
    private double productPrice;
    private double productDiscounts;
    private Date createTime;
    private Date updateTime;
    private int state;
    private Date approveTime;
    private int merchantId;
    private int productTypeid;
    private int productInventory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getProductPictureUrl() {
        return productPictureUrl;
    }

    public void setProductPictureUrl(String productPictureUrl) {
        this.productPictureUrl = productPictureUrl;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductDiscounts() {
        return productDiscounts;
    }

    public void setProductDiscounts(double productDiscounts) {
        this.productDiscounts = productDiscounts;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public int getProductTypeid() {
        return productTypeid;
    }

    public void setProductTypeid(int productTypeid) {
        this.productTypeid = productTypeid;
    }

    public int getProductInventory() {
        return productInventory;
    }

    public void setProductInventory(int productInventory) {
        this.productInventory = productInventory;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "id=" + id +
                ", productTitle='" + productTitle + '\'' +
                ", productName='" + productName + '\'' +
                ", productPictureUrl='" + productPictureUrl + '\'' +
                ", productPrice=" + productPrice +
                ", productDiscounts=" + productDiscounts +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", state=" + state +
                ", approveTime=" + approveTime +
                ", merchantId=" + merchantId +
                ", productTypeid=" + productTypeid +
                ", productInventory=" + productInventory +
                '}';
    }
}
