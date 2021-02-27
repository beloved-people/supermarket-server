package pers.wangshun.supermarketserver.model;

public class ThirdLevelAdministrativeDivision {
    private Integer thirdLevelId;

    private Integer firstLevelId;

    private Integer secondLevelId;

    private String thirdLevelName;

    public Integer getThirdLevelId() {
        return thirdLevelId;
    }

    public void setThirdLevelId(Integer thirdLevelId) {
        this.thirdLevelId = thirdLevelId;
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

    public String getThirdLevelName() {
        return thirdLevelName;
    }

    public void setThirdLevelName(String thirdLevelName) {
        this.thirdLevelName = thirdLevelName == null ? null : thirdLevelName.trim();
    }
}