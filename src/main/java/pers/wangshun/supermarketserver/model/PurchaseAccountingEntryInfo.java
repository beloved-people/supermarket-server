package pers.wangshun.supermarketserver.model;

import java.util.Date;

public class PurchaseAccountingEntryInfo {
    private Long purchaseAccountingEntryId;

    private Long accountingUser;

    private Long reviewUser;

    private Date bookKeepingDate;

    private Date reviewDate;

    private String finishLoading;

    private String purchaseAccountingEntryRemarks;

    public Long getPurchaseAccountingEntryId() {
        return purchaseAccountingEntryId;
    }

    public void setPurchaseAccountingEntryId(Long purchaseAccountingEntryId) {
        this.purchaseAccountingEntryId = purchaseAccountingEntryId;
    }

    public Long getAccountingUser() {
        return accountingUser;
    }

    public void setAccountingUser(Long accountingUser) {
        this.accountingUser = accountingUser;
    }

    public Long getReviewUser() {
        return reviewUser;
    }

    public void setReviewUser(Long reviewUser) {
        this.reviewUser = reviewUser;
    }

    public Date getBookKeepingDate() {
        return bookKeepingDate;
    }

    public void setBookKeepingDate(Date bookKeepingDate) {
        this.bookKeepingDate = bookKeepingDate;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getFinishLoading() {
        return finishLoading;
    }

    public void setFinishLoading(String finishLoading) {
        this.finishLoading = finishLoading == null ? null : finishLoading.trim();
    }

    public String getPurchaseAccountingEntryRemarks() {
        return purchaseAccountingEntryRemarks;
    }

    public void setPurchaseAccountingEntryRemarks(String purchaseAccountingEntryRemarks) {
        this.purchaseAccountingEntryRemarks = purchaseAccountingEntryRemarks == null ? null : purchaseAccountingEntryRemarks.trim();
    }
}