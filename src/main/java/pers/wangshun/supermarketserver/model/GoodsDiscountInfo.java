package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class GoodsDiscountInfo {
    private Long goodsBarCode;

    private String goodsName;

    private BigDecimal goodsDiscount;

    public Long getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(Long goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(BigDecimal goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    @Override
    public String toString() {
        return "GoodsDiscountInfo{" +
                "goodsBarCode=" + goodsBarCode +
                ", goodsName='" + goodsName + '\'' +
                ", goodsDiscount=" + goodsDiscount +
                '}';
    }
}