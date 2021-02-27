package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class WarehouseProductInfo {
    private Long warehouseCode;

    private Long goodsBarCode;

    private BigDecimal purchasePrice;

    private Integer purchaseDetailsQuantity;

    private String purchaseDetailsQuantityUnit;

    private BigDecimal purchaseDetailsAmount;

    private Integer purchaseDetailsExpirationDate;

    public Long getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(Long warehouseCode) {
        this.warehouseCode = warehouseCode;
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
}