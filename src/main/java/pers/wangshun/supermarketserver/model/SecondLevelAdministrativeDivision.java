package pers.wangshun.supermarketserver.model;

/**
 * @author WangShun
 */
public class SecondLevelAdministrativeDivision {
    private Integer secondLevelId;

    private Integer firstLevelId;

    private String secondLevelName;

    public Integer getSecondLevelId() {
        return secondLevelId;
    }

    public void setSecondLevelId(Integer secondLevelId) {
        this.secondLevelId = secondLevelId;
    }

    public Integer getFirstLevelId() {
        return firstLevelId;
    }

    public void setFirstLevelId(Integer firstLevelId) {
        this.firstLevelId = firstLevelId;
    }

    public String getSecondLevelName() {
        return secondLevelName;
    }

    public void setSecondLevelName(String secondLevelName) {
        this.secondLevelName = secondLevelName == null ? null : secondLevelName.trim();
    }
}