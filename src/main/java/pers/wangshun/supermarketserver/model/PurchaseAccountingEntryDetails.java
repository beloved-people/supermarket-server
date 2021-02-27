package pers.wangshun.supermarketserver.model;

import java.math.BigDecimal;

public class PurchaseAccountingEntryDetails {
    private Long purchaseAccountingEntryDetailsId;

    private String lendingSign;

    private String accountingSubjects;

    private BigDecimal incurredAmount;

    private BigDecimal borrowingBalance;

    public Long getPurchaseAccountingEntryDetailsId() {
        return purchaseAccountingEntryDetailsId;
    }

    public void setPurchaseAccountingEntryDetailsId(Long purchaseAccountingEntryDetailsId) {
        this.purchaseAccountingEntryDetailsId = purchaseAccountingEntryDetailsId;
    }

    public String getLendingSign() {
        return lendingSign;
    }

    public void setLendingSign(String lendingSign) {
        this.lendingSign = lendingSign == null ? null : lendingSign.trim();
    }

    public String getAccountingSubjects() {
        return accountingSubjects;
    }

    public void setAccountingSubjects(String accountingSubjects) {
        this.accountingSubjects = accountingSubjects == null ? null : accountingSubjects.trim();
    }

    public BigDecimal getIncurredAmount() {
        return incurredAmount;
    }

    public void setIncurredAmount(BigDecimal incurredAmount) {
        this.incurredAmount = incurredAmount;
    }

    public BigDecimal getBorrowingBalance() {
        return borrowingBalance;
    }

    public void setBorrowingBalance(BigDecimal borrowingBalance) {
        this.borrowingBalance = borrowingBalance;
    }
}