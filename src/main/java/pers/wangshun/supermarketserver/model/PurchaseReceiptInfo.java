package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseReceiptInfo {
    private Long purchaseReceiptNumber;

    private Integer associatedTicketId;

    private BigDecimal purchaseAmount;

    private Integer supplierName;

    private Long acceptor;

    private String purchaseReceiptUsername;

    private Long cashManagerName;

    private Date purchaseBillingDate;

    private Date purchasePaymentDate;

    private String purchaseFinishedCondition;

    private String purchaseRemarks;

    public Long getPurchaseReceiptNumber() {
        return purchaseReceiptNumber;
    }

    public void setPurchaseReceiptNumber(Long purchaseReceiptNumber) {
        this.purchaseReceiptNumber = purchaseReceiptNumber;
    }

    public Integer getAssociatedTicketId() {
        return associatedTicketId;
    }

    public void setAssociatedTicketId(Integer associatedTicketId) {
        this.associatedTicketId = associatedTicketId;
    }

    public BigDecimal getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(BigDecimal purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public Integer getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(Integer supplierName) {
        this.supplierName = supplierName;
    }

    public Long getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(Long acceptor) {
        this.acceptor = acceptor;
    }

    public String getPurchaseReceiptUsername() {
        return purchaseReceiptUsername;
    }

    public void setPurchaseReceiptUsername(String purchaseReceiptUsername) {
        this.purchaseReceiptUsername = purchaseReceiptUsername == null ? null : purchaseReceiptUsername.trim();
    }

    public Long getCashManagerName() {
        return cashManagerName;
    }

    public void setCashManagerName(Long cashManagerName) {
        this.cashManagerName = cashManagerName;
    }

    public Date getPurchaseBillingDate() {
        return purchaseBillingDate;
    }

    public void setPurchaseBillingDate(Date purchaseBillingDate) {
        this.purchaseBillingDate = purchaseBillingDate;
    }

    public Date getPurchasePaymentDate() {
        return purchasePaymentDate;
    }

    public void setPurchasePaymentDate(Date purchasePaymentDate) {
        this.purchasePaymentDate = purchasePaymentDate;
    }

    public String getPurchaseFinishedCondition() {
        return purchaseFinishedCondition;
    }

    public void setPurchaseFinishedCondition(String purchaseFinishedCondition) {
        this.purchaseFinishedCondition = purchaseFinishedCondition == null ? null : purchaseFinishedCondition.trim();
    }

    public String getPurchaseRemarks() {
        return purchaseRemarks;
    }

    public void setPurchaseRemarks(String purchaseRemarks) {
        this.purchaseRemarks = purchaseRemarks == null ? null : purchaseRemarks.trim();
    }
}