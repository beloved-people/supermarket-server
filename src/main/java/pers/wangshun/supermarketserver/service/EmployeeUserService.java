package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.EmployeeUser;
import pers.wangshun.supermarketserver.model.EmployeeUserExample;

import java.util.List;

/**
 * @author WangShun
 */

public interface EmployeeUserService {
    List<EmployeeUser> selectAll();

    EmployeeUser login(Long employeeCode, String username, String password);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeUser record);
    EmployeeUser selectByEmployeeCodeAndPassword(Long employeeCode, String password);
    int insertSelective(EmployeeUser record);
    EmployeeUser selectById(Integer id);

    List<EmployeeUser> selectByExample(EmployeeUserExample example);

    List<EmployeeUser> selectByEmployeeShopId(Long employeeShopId);

    EmployeeUser selectByPrimaryKey(Integer id);

    EmployeeUser selectByUsernameAndPassword(String username, String password);

    EmployeeUser selectByEmployeeCode(Long employeeCode);

    int updateByPrimaryKeySelective(EmployeeUser record);

    int updateByPrimaryKey(EmployeeUser record);
}
