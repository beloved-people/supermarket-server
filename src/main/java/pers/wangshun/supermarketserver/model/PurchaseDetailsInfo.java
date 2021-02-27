package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class PurchaseDetailsInfo {
    private Long purchaseDetailsNumber;

    private Long purchaseOrderNumber;

    private Long goodsBarCode;

    private BigDecimal purchasePrice;

    private Integer purchaseDetailsQuantity;

    private String purchaseDetailsQuantityUnit;

    private BigDecimal purchaseDetailsAmount;

    private Integer purchaseDetailsExpirationDate;

    private BigDecimal purchaseDetailsTotalPrice;

    public Long getPurchaseDetailsNumber() {
        return purchaseDetailsNumber;
    }

    public void setPurchaseDetailsNumber(Long purchaseDetailsNumber) {
        this.purchaseDetailsNumber = purchaseDetailsNumber;
    }

    public Long getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Long getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(Long goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getPurchaseDetailsQuantity() {
        return purchaseDetailsQuantity;
    }

    public void setPurchaseDetailsQuantity(Integer purchaseDetailsQuantity) {
        this.purchaseDetailsQuantity = purchaseDetailsQuantity;
    }

    public String getPurchaseDetailsQuantityUnit() {
        return purchaseDetailsQuantityUnit;
    }

    public void setPurchaseDetailsQuantityUnit(String purchaseDetailsQuantityUnit) {
        this.purchaseDetailsQuantityUnit = purchaseDetailsQuantityUnit == null ? null : purchaseDetailsQuantityUnit.trim();
    }

    public BigDecimal getPurchaseDetailsAmount() {
        return purchaseDetailsAmount;
    }

    public void setPurchaseDetailsAmount(BigDecimal purchaseDetailsAmount) {
        this.purchaseDetailsAmount = purchaseDetailsAmount;
    }

    public Integer getPurchaseDetailsExpirationDate() {
        return purchaseDetailsExpirationDate;
    }

    public void setPurchaseDetailsExpirationDate(Integer purchaseDetailsExpirationDate) {
        this.purchaseDetailsExpirationDate = purchaseDetailsExpirationDate;
    }

    public BigDecimal getPurchaseDetailsTotalPrice() {
        return purchaseDetailsTotalPrice;
    }

    public void setPurchaseDetailsTotalPrice(BigDecimal purchaseDetailsTotalPrice) {
        this.purchaseDetailsTotalPrice = purchaseDetailsTotalPrice;
    }

    @Override
    public String toString() {
        return "PurchaseDetailsInfo{" +
                "purchaseDetailsNumber=" + purchaseDetailsNumber +
                ", purchaseOrderNumber=" + purchaseOrderNumber +
                ", goodsBarCode=" + goodsBarCode +
                ", purchasePrice=" + purchasePrice +
                ", purchaseDetailsQuantity=" + purchaseDetailsQuantity +
                ", purchaseDetailsQuantityUnit='" + purchaseDetailsQuantityUnit + '\'' +
                ", purchaseDetailsAmount=" + purchaseDetailsAmount +
                ", purchaseDetailsExpirationDate=" + purchaseDetailsExpirationDate +
                ", purchaseDetailsTotalPrice=" + purchaseDetailsTotalPrice +
                '}';
    }
}