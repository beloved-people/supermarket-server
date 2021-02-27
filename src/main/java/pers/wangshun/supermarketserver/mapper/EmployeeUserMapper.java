package pers.wangshun.supermarketserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.wangshun.supermarketserver.model.EmployeeUser;
import pers.wangshun.supermarketserver.model.EmployeeUserExample;

import java.util.List;

@Mapper
public interface EmployeeUserMapper {

    List<EmployeeUser> selectAll();

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeUser record);

    int insertSelective(EmployeeUser record);

    List<EmployeeUser> selectByExample(EmployeeUserExample example);

    List<EmployeeUser> selectByEmployeeShopId(Long employeeShopId);

    EmployeeUser selectByPrimaryKey(Integer id);

    EmployeeUser selectById(Integer id);

    EmployeeUser selectByUsernameAndPassword(String username, String password);
    EmployeeUser selectByEmployeeCodeAndPassword(Long employeeCode, String password);

    EmployeeUser login(Long employeeCode, String username, String password);

    EmployeeUser selectByEmployeeCode(Long employeeCode);

    int updateByPrimaryKeySelective(EmployeeUser record);

    int updateByPrimaryKey(EmployeeUser record);


}