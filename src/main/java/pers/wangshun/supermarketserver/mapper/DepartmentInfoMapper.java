package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.DepartmentInfo;
import pers.wangshun.supermarketserver.model.DepartmentInfoExample;

public interface DepartmentInfoMapper {
    int deleteByPrimaryKey(Integer departmentId);

    int insert(DepartmentInfo record);

    int insertSelective(DepartmentInfo record);

    List<DepartmentInfo> selectByExample(DepartmentInfoExample example);

    DepartmentInfo selectByPrimaryKey(Integer departmentId);

    int updateByPrimaryKeySelective(DepartmentInfo record);

    int updateByPrimaryKey(DepartmentInfo record);
}