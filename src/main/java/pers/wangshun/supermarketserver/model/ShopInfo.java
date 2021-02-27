package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class ShopInfo {
    private Long shopId;

    private BigDecimal shopSize;

    private Integer workersNumber;

    private String shopLocation;

    private BigDecimal monthlyRent;

    private BigDecimal shopDeposit;

    private String shopDescription;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public BigDecimal getShopSize() {
        return shopSize;
    }

    public void setShopSize(BigDecimal shopSize) {
        this.shopSize = shopSize;
    }

    public Integer getWorkersNumber() {
        return workersNumber;
    }

    public void setWorkersNumber(Integer workersNumber) {
        this.workersNumber = workersNumber;
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation == null ? null : shopLocation.trim();
    }

    public BigDecimal getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(BigDecimal monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public BigDecimal getShopDeposit() {
        return shopDeposit;
    }

    public void setShopDeposit(BigDecimal shopDeposit) {
        this.shopDeposit = shopDeposit;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription == null ? null : shopDescription.trim();
    }

    @Override
    public String toString() {
        return "ShopInfo{" +
                "shopId=" + shopId +
                ", shopSize=" + shopSize +
                ", workersNumber=" + workersNumber +
                ", shopLocation='" + shopLocation + '\'' +
                ", monthlyRent=" + monthlyRent +
                ", shopDeposit=" + shopDeposit +
                ", shopDescription='" + shopDescription + '\'' +
                '}';
    }
}