package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivisionExample;

import java.util.List;

public interface FourthLevelAdministrativeDivisionService {
    int deleteByPrimaryKey(Integer fourthLevelId);

    int insert(FourthLevelAdministrativeDivision record);

    int insertSelective(FourthLevelAdministrativeDivision record);

    List<FourthLevelAdministrativeDivision> selectByExample(FourthLevelAdministrativeDivisionExample example);

    FourthLevelAdministrativeDivision selectByPrimaryKey(Integer fourthLevelId);

    int updateByPrimaryKeySelective(FourthLevelAdministrativeDivision record);

    int updateByPrimaryKey(FourthLevelAdministrativeDivision record);
}
