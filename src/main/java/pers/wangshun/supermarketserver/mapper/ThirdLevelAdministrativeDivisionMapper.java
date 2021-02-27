package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.ThirdLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.ThirdLevelAdministrativeDivisionExample;

import java.util.List;

public interface ThirdLevelAdministrativeDivisionMapper {
    int deleteByPrimaryKey(Integer thirdLevelId);

    int insert(ThirdLevelAdministrativeDivision record);

    int insertSelective(ThirdLevelAdministrativeDivision record);

    List<ThirdLevelAdministrativeDivision> selectByExample(ThirdLevelAdministrativeDivisionExample example);

    ThirdLevelAdministrativeDivision selectByPrimaryKey(Integer thirdLevelId);

    int updateByPrimaryKeySelective(ThirdLevelAdministrativeDivision record);

    int updateByPrimaryKey(ThirdLevelAdministrativeDivision record);
}