package pers.wangshun.supermarketserver.model;

public class InventoryGainLossDetailsKey {
    private Long inventoryCountingDetailsId;

    private Long inventoryCountingInfoNumber;

    private Long goodsBarCode;

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
}