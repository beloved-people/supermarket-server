package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class GoodsTransferDetails {
    private Long goodsTransferDetailsId;

    private Long goodsTransferInfoId;

    private Long goodsBarCode;

    private BigDecimal purchasePrice;

    private BigDecimal purchaseDetailsQuantity;

    private BigDecimal purchaseDetailsAmount;

    private Integer purchaseDetailsExpirationDate;

    private BigDecimal purchaseDetailsTotalPrice;

    public Long getGoodsTransferDetailsId() {
        return goodsTransferDetailsId;
    }

    public void setGoodsTransferDetailsId(Long goodsTransferDetailsId) {
        this.goodsTransferDetailsId = goodsTransferDetailsId;
    }

    public Long getGoodsTransferInfoId() {
        return goodsTransferInfoId;
    }

    public void setGoodsTransferInfoId(Long goodsTransferInfoId) {
        this.goodsTransferInfoId = goodsTransferInfoId;
    }

    public Long getGoodsBarCode() {
        return goodsBarCode;
    }

    public void setGoodsBarCode(Long goodsBarCode) {
        this.goodsBarCode = goodsBarCode;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getPurchaseDetailsQuantity() {
        return purchaseDetailsQuantity;
    }

    public void setPurchaseDetailsQuantity(BigDecimal purchaseDetailsQuantity) {
        this.purchaseDetailsQuantity = purchaseDetailsQuantity;
    }

    public BigDecimal getPurchaseDetailsAmount() {
        return purchaseDetailsAmount;
    }

    public void setPurchaseDetailsAmount(BigDecimal purchaseDetailsAmount) {
        this.purchaseDetailsAmount = purchaseDetailsAmount;
    }

    public Integer getPurchaseDetailsExpirationDate() {
        return purchaseDetailsExpirationDate;
    }

    public void setPurchaseDetailsExpirationDate(Integer purchaseDetailsExpirationDate) {
        this.purchaseDetailsExpirationDate = purchaseDetailsExpirationDate;
    }

    public BigDecimal getPurchaseDetailsTotalPrice() {
        return purchaseDetailsTotalPrice;
    }

    public void setPurchaseDetailsTotalPrice(BigDecimal purchaseDetailsTotalPrice) {
        this.purchaseDetailsTotalPrice = purchaseDetailsTotalPrice;
    }
}