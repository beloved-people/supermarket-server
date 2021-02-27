package pers.wangshun.supermarketserver.model;

import java.util.Date;

public class PurchaseOrderInfo {
    private Long purchaseOrderNumber;

    private Integer purchaseOrderSupplier;

    private Long purchaser;

    private Long orderer;

    private Long acceptor;

    private Long cashManager;

    private String shippingAddress;

    private Long warehouse;

    private Date purchaseOrderDate;

    private Date purchaseOrderArrivalDate;

    private String purchaseOrderFinishedCondition;

    private String purchaseOrderRemarks;

    public Long getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(Long purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public Integer getPurchaseOrderSupplier() {
        return purchaseOrderSupplier;
    }

    public void setPurchaseOrderSupplier(Integer purchaseOrderSupplier) {
        this.purchaseOrderSupplier = purchaseOrderSupplier;
    }

    public Long getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(Long purchaser) {
        this.purchaser = purchaser;
    }

    public Long getOrderer() {
        return orderer;
    }

    public void setOrderer(Long orderer) {
        this.orderer = orderer;
    }

    public Long getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(Long acceptor) {
        this.acceptor = acceptor;
    }

    public Long getCashManager() {
        return cashManager;
    }

    public void setCashManager(Long cashManager) {
        this.cashManager = cashManager;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    public Long getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse;
    }

    public Date getPurchaseOrderDate() {
        return purchaseOrderDate;
    }

    public void setPurchaseOrderDate(Date purchaseOrderDate) {
        this.purchaseOrderDate = purchaseOrderDate;
    }

    public Date getPurchaseOrderArrivalDate() {
        return purchaseOrderArrivalDate;
    }

    public void setPurchaseOrderArrivalDate(Date purchaseOrderArrivalDate) {
        this.purchaseOrderArrivalDate = purchaseOrderArrivalDate;
    }

    public String getPurchaseOrderFinishedCondition() {
        return purchaseOrderFinishedCondition;
    }

    public void setPurchaseOrderFinishedCondition(String purchaseOrderFinishedCondition) {
        this.purchaseOrderFinishedCondition = purchaseOrderFinishedCondition == null ? null : purchaseOrderFinishedCondition.trim();
    }

    public String getPurchaseOrderRemarks() {
        return purchaseOrderRemarks;
    }

    public void setPurchaseOrderRemarks(String purchaseOrderRemarks) {
        this.purchaseOrderRemarks = purchaseOrderRemarks == null ? null : purchaseOrderRemarks.trim();
    }

    @Override
    public String toString() {
        return "PurchaseOrderInfo{" +
                "purchaseOrderNumber=" + purchaseOrderNumber +
                ", purchaseOrderSupplier=" + purchaseOrderSupplier +
                ", purchaser=" + purchaser +
                ", orderer=" + orderer +
                ", acceptor=" + acceptor +
                ", cashManager=" + cashManager +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", warehouse=" + warehouse +
                ", purchaseOrderDate=" + purchaseOrderDate +
                ", purchaseOrderArrivalDate=" + purchaseOrderArrivalDate +
                ", purchaseOrderFinishedCondition='" + purchaseOrderFinishedCondition + '\'' +
                ", purchaseOrderRemarks='" + purchaseOrderRemarks + '\'' +
                '}';
    }
}