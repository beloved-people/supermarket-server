package pers.wangshun.supermarketserver.model;

public class InventoryWarningInfo {
    private Long goodsBarCode;

    private String goodsName;

    private Integer inventoryMax;

    private Integer inventoryMin;

    private Integer inventoryQuantity;

    private String inventoryState;

    public Long getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(Long goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getInventoryMax() {
        return inventoryMax;
    }

    public void setInventoryMax(Integer inventoryMax) {
        this.inventoryMax = inventoryMax;
    }

    public Integer getInventoryMin() {
        return inventoryMin;
    }

    public void setInventoryMin(Integer inventoryMin) {
        this.inventoryMin = inventoryMin;
    }

    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getInventoryState() {
        return inventoryState;
    }

    public void setInventoryState(String inventoryState) {
        this.inventoryState = inventoryState == null ? null : inventoryState.trim();
    }
}