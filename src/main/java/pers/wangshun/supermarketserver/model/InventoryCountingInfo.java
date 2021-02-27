package pers.wangshun.supermarketserver.model;

import java.util.Date;

public class InventoryCountingInfo {
    private Long inventoryCountingInfoNumber;

    private Long inventoryUser;

    private Long warehouseId;

    private Date inventoryDate;

    private String inventoryState;

    private String inventoryRemarks;

    public Long getInventoryCountingInfoNumber() {
        return inventoryCountingInfoNumber;
    }

    public void setInventoryCountingInfoNumber(Long inventoryCountingInfoNumber) {
        this.inventoryCountingInfoNumber = inventoryCountingInfoNumber;
    }

    public Long getInventoryUser() {
        return inventoryUser;
    }

    public void setInventoryUser(Long inventoryUser) {
        this.inventoryUser = inventoryUser;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Date getInventoryDate() {
        return inventoryDate;
    }

    public void setInventoryDate(Date inventoryDate) {
        this.inventoryDate = inventoryDate;
    }

    public String getInventoryState() {
        return inventoryState;
    }

    public void setInventoryState(String inventoryState) {
        this.inventoryState = inventoryState == null ? null : inventoryState.trim();
    }

    public String getInventoryRemarks() {
        return inventoryRemarks;
    }

    public void setInventoryRemarks(String inventoryRemarks) {
        this.inventoryRemarks = inventoryRemarks == null ? null : inventoryRemarks.trim();
    }
}