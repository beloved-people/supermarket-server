package pers.wangshun.supermarketserver.model;

public class InventoryCountingDetails {
    private Long inventoryCountingDetailsId;

    private Long inventoryCountingInfoNumber;

    private Long goodsBarCode;

    private Integer countedQuantity;

    public Long getInventoryCountingDetailsId() {
        return inventoryCountingDetailsId;
    }

    public void setInventoryCountingDetailsId(Long inventoryCountingDetailsId) {
        this.inventoryCountingDetailsId = inventoryCountingDetailsId;
    }

    public Long getInventoryCountingInfoNumber() {
        return inventoryCountingInfoNumber;
    }

    public void setInventoryCountingInfoNumber(Long inventoryCountingInfoNumber) {
        this.inventoryCountingInfoNumber = inventoryCountingInfoNumber;
    }

    public Long getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(Long goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public Integer getCountedQuantity() {
        return countedQuantity;
    }

    public void setCountedQuantity(Integer countedQuantity) {
        this.countedQuantity = countedQuantity;
    }
}