package pers.wangshun.supermarketserver.model;

/**
 * @author WangShun
 */
public class FirstLevelAdministrativeDivision {
    private Integer firstLevelId;

    private String firstLevelName;

    public Integer getFirstLevelId() {
        return firstLevelId;
    }

    public void setFirstLevelId(Integer firstLevelId) {
        this.firstLevelId = firstLevelId;
    }

    public String getFirstLevelName() {
        return firstLevelName;
    }

    public void setFirstLevelName(String firstLevelName) {
        this.firstLevelName = firstLevelName == null ? null : firstLevelName.trim();
    }
}