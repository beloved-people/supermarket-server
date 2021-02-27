package pers.wangshun.supermarketserver.model;

import java.util.Date;

public class VipUser {
    private Integer id;

    private String username;

    private String password;

    private String vipGender;

    private String vipNumber;

    private Date vipBirthday;

    private String vipPlace;

    private Integer vipShopId;

    private String vipCardCode;

    private Integer vipIntegration;

    private Date vipRegisterDate;

    private Boolean enabled;

    private Boolean locked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getVipGender() {
        return vipGender;
    }

    public void setVipGender(String vipGender) {
        this.vipGender = vipGender == null ? null : vipGender.trim();
    }

    public String getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(String vipNumber) {
        this.vipNumber = vipNumber == null ? null : vipNumber.trim();
    }

    public Date getVipBirthday() {
        return vipBirthday;
    }

    public void setVipBirthday(Date vipBirthday) {
        this.vipBirthday = vipBirthday;
    }

    public String getVipPlace() {
        return vipPlace;
    }

    public void setVipPlace(String vipPlace) {
        this.vipPlace = vipPlace == null ? null : vipPlace.trim();
    }

    public Integer getVipShopId() {
        return vipShopId;
    }

    public void setVipShopId(Integer vipShopId) {
        this.vipShopId = vipShopId;
    }

    public String getVipCardCode() {
        return vipCardCode;
    }

    public void setVipCardCode(String vipCardCode) {
        this.vipCardCode = vipCardCode == null ? null : vipCardCode.trim();
    }

    public Integer getVipIntegration() {
        return vipIntegration;
    }

    public void setVipIntegration(Integer vipIntegration) {
        this.vipIntegration = vipIntegration;
    }

    public Date getVipRegisterDate() {
        return vipRegisterDate;
    }

    public void setVipRegisterDate(Date vipRegisterDate) {
        this.vipRegisterDate = vipRegisterDate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        return "VipUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", vipGender='" + vipGender + '\'' +
                ", vipNumber='" + vipNumber + '\'' +
                ", vipBirthday=" + vipBirthday +
                ", vipPlace='" + vipPlace + '\'' +
                ", vipShopId=" + vipShopId +
                ", vipCardCode='" + vipCardCode + '\'' +
                ", vipIntegration=" + vipIntegration +
                ", vipRegisterDate=" + vipRegisterDate +
                ", enabled=" + enabled +
                ", locked=" + locked +
                '}';
    }
}