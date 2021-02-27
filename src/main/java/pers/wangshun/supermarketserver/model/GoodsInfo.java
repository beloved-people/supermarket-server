package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsInfo {
    private Long goodsBarCode;

    private Integer goodsCategoryNumber;

    private String goodsName;

    private BigDecimal goodsPurchasePrice;

    private String goodsOrigin;

    private Date goodsProductionDate;

    private Integer goodsExpiryDate;

    private String goodsRawMaterial;

    private String goodsSpecification;

    private String goodsManufacturer;

    public Long getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(Long goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public Integer getGoodsCategoryNumber() {
        return goodsCategoryNumber;
    }

    public void setGoodsCategoryNumber(Integer goodsCategoryNumber) {
        this.goodsCategoryNumber = goodsCategoryNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsPurchasePrice() {
        return goodsPurchasePrice;
    }

    public void setGoodsPurchasePrice(BigDecimal goodsPurchasePrice) {
        this.goodsPurchasePrice = goodsPurchasePrice;
    }

    public String getGoodsOrigin() {
        return goodsOrigin;
    }

    public void setGoodsOrigin(String goodsOrigin) {
        this.goodsOrigin = goodsOrigin == null ? null : goodsOrigin.trim();
    }

    public Date getGoodsProductionDate() {
        return goodsProductionDate;
    }

    public void setGoodsProductionDate(Date goodsProductionDate) {
        this.goodsProductionDate = goodsProductionDate;
    }

    public Integer getGoodsExpiryDate() {
        return goodsExpiryDate;
    }

    public void setGoodsExpiryDate(Integer goodsExpiryDate) {
        this.goodsExpiryDate = goodsExpiryDate;
    }

    public String getGoodsRawMaterial() {
        return goodsRawMaterial;
    }

    public void setGoodsRawMaterial(String goodsRawMaterial) {
        this.goodsRawMaterial = goodsRawMaterial == null ? null : goodsRawMaterial.trim();
    }

    public String getGoodsSpecification() {
        return goodsSpecification;
    }

    public void setGoodsSpecification(String goodsSpecification) {
        this.goodsSpecification = goodsSpecification == null ? null : goodsSpecification.trim();
    }

    public String getGoodsManufacturer() {
        return goodsManufacturer;
    }

    public void setGoodsManufacturer(String goodsManufacturer) {
        this.goodsManufacturer = goodsManufacturer == null ? null : goodsManufacturer.trim();
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "goodsBarCode=" + goodsBarCode +
                ", goodsCategoryNumber=" + goodsCategoryNumber +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPurchasePrice=" + goodsPurchasePrice +
                ", goodsOrigin='" + goodsOrigin + '\'' +
                ", goodsProductionDate=" + goodsProductionDate +
                ", goodsExpiryDate=" + goodsExpiryDate +
                ", goodsRawMaterial='" + goodsRawMaterial + '\'' +
                ", goodsSpecification='" + goodsSpecification + '\'' +
                ", goodsManufacturer='" + goodsManufacturer + '\'' +
                '}';
    }
}