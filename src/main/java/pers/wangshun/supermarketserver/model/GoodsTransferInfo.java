package pers.wangshun.supermarketserver.model;

import java.util.Date;

public class GoodsTransferInfo {
    private Long goodsTransferInfoId;

    private Long merchandiser;

    private Long commodityInspector;

    private Long transferToWarehouse;

    private Long callOutWarehouse;

    private Date callOutDate;

    private Date acceptanceDate;

    private String goodsTransferState;

    private String productTransferRemarks;

    public Long getGoodsTransferInfoId() {
        return goodsTransferInfoId;
    }

    public void setGoodsTransferInfoId(Long goodsTransferInfoId) {
        this.goodsTransferInfoId = goodsTransferInfoId;
    }

    public Long getMerchandiser() {
        return merchandiser;
    }

    public void setMerchandiser(Long merchandiser) {
        this.merchandiser = merchandiser;
    }

    public Long getCommodityInspector() {
        return commodityInspector;
    }

    public void setCommodityInspector(Long commodityInspector) {
        this.commodityInspector = commodityInspector;
    }

    public Long getTransferToWarehouse() {
        return transferToWarehouse;
    }

    public void setTransferToWarehouse(Long transferToWarehouse) {
        this.transferToWarehouse = transferToWarehouse;
    }

    public Long getCallOutWarehouse() {
        return callOutWarehouse;
    }

    public void setCallOutWarehouse(Long callOutWarehouse) {
        this.callOutWarehouse = callOutWarehouse;
    }

    public Date getCallOutDate() {
        return callOutDate;
    }

    public void setCallOutDate(Date callOutDate) {
        this.callOutDate = callOutDate;
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public String getGoodsTransferState() {
        return goodsTransferState;
    }

    public void setGoodsTransferState(String goodsTransferState) {
        this.goodsTransferState = goodsTransferState == null ? null : goodsTransferState.trim();
    }

    public String getProductTransferRemarks() {
        return productTransferRemarks;
    }

    public void setProductTransferRemarks(String productTransferRemarks) {
        this.productTransferRemarks = productTransferRemarks == null ? null : productTransferRemarks.trim();
    }
}