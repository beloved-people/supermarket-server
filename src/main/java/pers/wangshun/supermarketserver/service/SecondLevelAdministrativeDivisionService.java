package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.SecondLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.SecondLevelAdministrativeDivisionExample;

import java.util.List;

public interface SecondLevelAdministrativeDivisionService {
    int deleteByPrimaryKey(Integer secondLevelId);

    int insert(SecondLevelAdministrativeDivision record);

    int insertSelective(SecondLevelAdministrativeDivision record);

    List<SecondLevelAdministrativeDivision> selectByExample(SecondLevelAdministrativeDivisionExample example);

    SecondLevelAdministrativeDivision selectByPrimaryKey(Integer secondLevelId);

    int updateByPrimaryKeySelective(SecondLevelAdministrativeDivision record);

    int updateByPrimaryKey(SecondLevelAdministrativeDivision record);
}
