package pers.wangshun.supermarketserver.model;

/**
 * @author WangShun
 */
public class SupplierInfo {
    private Integer supplierId;

    private String supplierName;

    private String supplierArea;

    private String supplierContactNumber;

    private String supplierContactPerson;

    private String supplierPhone;

    private String supplierEmail;

    private String supplierTelephone;

    private String supplierDepositBank;

    private String supplierBankAccount;

    private String supplierSite;

    private String supplierRemarks;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierArea() {
        return supplierArea;
    }

    public void setSupplierArea(String supplierArea) {
        this.supplierArea = supplierArea == null ? null : supplierArea.trim();
    }

    public String getSupplierContactNumber() {
        return supplierContactNumber;
    }

    public void setSupplierContactNumber(String supplierContactNumber) {
        this.supplierContactNumber = supplierContactNumber == null ? null : supplierContactNumber.trim();
    }

    public String getSupplierContactPerson() {
        return supplierContactPerson;
    }

    public void setSupplierContactPerson(String supplierContactPerson) {
        this.supplierContactPerson = supplierContactPerson == null ? null : supplierContactPerson.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone == null ? null : supplierPhone.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierTelephone() {
        return supplierTelephone;
    }

    public void setSupplierTelephone(String supplierTelephone) {
        this.supplierTelephone = supplierTelephone == null ? null : supplierTelephone.trim();
    }

    public String getSupplierDepositBank() {
        return supplierDepositBank;
    }

    public void setSupplierDepositBank(String supplierDepositBank) {
        this.supplierDepositBank = supplierDepositBank == null ? null : supplierDepositBank.trim();
    }

    public String getSupplierBankAccount() {
        return supplierBankAccount;
    }

    public void setSupplierBankAccount(String supplierBankAccount) {
        this.supplierBankAccount = supplierBankAccount == null ? null : supplierBankAccount.trim();
    }

    public String getSupplierSite() {
        return supplierSite;
    }

    public void setSupplierSite(String supplierSite) {
        this.supplierSite = supplierSite == null ? null : supplierSite.trim();
    }

    public String getSupplierRemarks() {
        return supplierRemarks;
    }

    public void setSupplierRemarks(String supplierRemarks) {
        this.supplierRemarks = supplierRemarks == null ? null : supplierRemarks.trim();
    }
}