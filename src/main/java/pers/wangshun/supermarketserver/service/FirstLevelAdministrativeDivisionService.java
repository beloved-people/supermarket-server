package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.FirstLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.FirstLevelAdministrativeDivisionExample;

import java.util.List;

public interface FirstLevelAdministrativeDivisionService {
    int deleteByPrimaryKey(Integer firstLevelId);

    int insert(FirstLevelAdministrativeDivision record);

    int insertSelective(FirstLevelAdministrativeDivision record);

    List<FirstLevelAdministrativeDivision> selectByExample(FirstLevelAdministrativeDivisionExample example);

    FirstLevelAdministrativeDivision selectByPrimaryKey(Integer firstLevelId);

    int updateByPrimaryKeySelective(FirstLevelAdministrativeDivision record);

    int updateByPrimaryKey(FirstLevelAdministrativeDivision record);
}
