package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.Date;

public class DailyData {
    private Integer volumeId;

    private Long shopId;

    private Date today;

    private BigDecimal todayTurnover;

    private Integer todayPassengerFlow;

    public Integer getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(Integer volumeId) {
        this.volumeId = volumeId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public BigDecimal getTodayTurnover() {
        return todayTurnover;
    }

    public void setTodayTurnover(BigDecimal todayTurnover) {
        this.todayTurnover = todayTurnover;
    }

    public Integer getTodayPassengerFlow() {
        return todayPassengerFlow;
    }

    public void setTodayPassengerFlow(Integer todayPassengerFlow) {
        this.todayPassengerFlow = todayPassengerFlow;
    }
}