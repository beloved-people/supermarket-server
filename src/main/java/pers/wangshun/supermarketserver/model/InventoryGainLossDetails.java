package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class InventoryGainLossDetails extends InventoryGainLossDetailsKey {
    private BigDecimal purchasePrice;

    private Integer revenueLoss;

    private BigDecimal inventoryAmount;

    private Integer inventoryExpirationDate;

    private BigDecimal inventoryGainLossTotalPrice;

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getRevenueLoss() {
        return revenueLoss;
    }

    public void setRevenueLoss(Integer revenueLoss) {
        this.revenueLoss = revenueLoss;
    }

    public BigDecimal getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(BigDecimal inventoryAmount) {
        this.inventoryAmount = inventoryAmount;
    }

    public Integer getInventoryExpirationDate() {
        return inventoryExpirationDate;
    }

    public void setInventoryExpirationDate(Integer inventoryExpirationDate) {
        this.inventoryExpirationDate = inventoryExpirationDate;
    }

    public BigDecimal getInventoryGainLossTotalPrice() {
        return inventoryGainLossTotalPrice;
    }

    public void setInventoryGainLossTotalPrice(BigDecimal inventoryGainLossTotalPrice) {
        this.inventoryGainLossTotalPrice = inventoryGainLossTotalPrice;
    }
}