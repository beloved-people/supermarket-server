package pers.wangshun.supermarketserver.model;

public class FourthLevelAdministrativeDivision {
    private Integer fourthLevelId;

    private Integer firstLevelId;

    private Integer secondLevelId;

    private Integer thirdLevelId;

    private String fourthLevelName;

    public Integer getFourthLevelId() {
        return fourthLevelId;
    }

    public void setFourthLevelId(Integer fourthLevelId) {
        this.fourthLevelId = fourthLevelId;
    }

    public Integer getFirstLevelId() {
        return firstLevelId;
    }

    public void setFirstLevelId(Integer firstLevelId) {
        this.firstLevelId = firstLevelId;
    }

    public Integer getSecondLevelId() {
        return secondLevelId;
    }

    public void setSecondLevelId(Integer secondLevelId) {
        this.secondLevelId = secondLevelId;
    }

    public Integer getThirdLevelId() {
        return thirdLevelId;
    }

    public void setThirdLevelId(Integer thirdLevelId) {
        this.thirdLevelId = thirdLevelId;
    }

    public String getFourthLevelName() {
        return fourthLevelName;
    }

    public void setFourthLevelName(String fourthLevelName) {
        this.fourthLevelName = fourthLevelName == null ? null : fourthLevelName.trim();
    }
}