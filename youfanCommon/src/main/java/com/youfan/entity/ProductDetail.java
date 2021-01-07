package com.youfan.entity;

public class ProductDetail {
    private int id;
    private int productId;
    private String productPlace;
    private String productRand;
    private String productDescription;
    private String productWeight;
    private String productdetailPictureUrl;
    private String productSpecificationAndPack;

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

    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public String getProductRand() {
        return productRand;
    }

    public void setProductRand(String productRand) {
        this.productRand = productRand;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductdetailPictureUrl() {
        return productdetailPictureUrl;
    }

    public void setProductdetailPictureUrl(String productdetailPictureUrl) {
        this.productdetailPictureUrl = productdetailPictureUrl;
    }

    public String getProductSpecificationAndPack() {
        return productSpecificationAndPack;
    }

    public void setProductSpecificationAndPack(String productSpecificationAndPack) {
        this.productSpecificationAndPack = productSpecificationAndPack;
    }
}
