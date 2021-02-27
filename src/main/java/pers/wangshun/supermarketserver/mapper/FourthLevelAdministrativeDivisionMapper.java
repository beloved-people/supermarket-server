package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivisionExample;

import java.util.List;

public interface FourthLevelAdministrativeDivisionMapper {
    int deleteByPrimaryKey(Integer fourthLevelId);

    int insert(FourthLevelAdministrativeDivision record);

    int insertSelective(FourthLevelAdministrativeDivision record);

    List<FourthLevelAdministrativeDivision> selectByExample(FourthLevelAdministrativeDivisionExample example);

    FourthLevelAdministrativeDivision selectByPrimaryKey(Integer fourthLevelId);

    int updateByPrimaryKeySelective(FourthLevelAdministrativeDivision record);

    int updateByPrimaryKey(FourthLevelAdministrativeDivision record);
}