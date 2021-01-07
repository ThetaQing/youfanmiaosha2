package com.youfan.entity;

public class ProductTypeInfo {
    private int id;
    private String producttypeName;
    private String producttypeDescription;
    private int parentid;
    private int grade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducttypeName() {
        return producttypeName;
    }

    public void setProducttypeName(String producttypeName) {
        this.producttypeName = producttypeName;
    }

    public String getProducttypeDescription() {
        return producttypeDescription;
    }

    public void setProducttypeDescription(String producttypeDescription) {
        this.producttypeDescription = producttypeDescription;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
