package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.SecondLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.SecondLevelAdministrativeDivisionExample;

public interface SecondLevelAdministrativeDivisionMapper {
    int deleteByPrimaryKey(Integer secondLevelId);

    int insert(SecondLevelAdministrativeDivision record);

    int insertSelective(SecondLevelAdministrativeDivision record);

    List<SecondLevelAdministrativeDivision> selectByExample(SecondLevelAdministrativeDivisionExample example);

    SecondLevelAdministrativeDivision selectByPrimaryKey(Integer secondLevelId);

    int updateByPrimaryKeySelective(SecondLevelAdministrativeDivision record);

    int updateByPrimaryKey(SecondLevelAdministrativeDivision record);
}