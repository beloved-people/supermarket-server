package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class ActivityData {
    private Long shopId;

    private String activityName;

    private BigDecimal activityTotalCost;

    private String activityDescription;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public BigDecimal getActivityTotalCost() {
        return activityTotalCost;
    }

    public void setActivityTotalCost(BigDecimal activityTotalCost) {
        this.activityTotalCost = activityTotalCost;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription == null ? null : activityDescription.trim();
    }
}