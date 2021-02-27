package pers.wangshun.supermarketserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.wangshun.supermarketserver.model.EmployeeUserRoleExample;

import java.util.List;

/**
 * @author WangShun
 */
@Mapper
public interface EmployeeUserRoleMapper {

    List<EmployeeUserRoleExample> selectByName(EmployeeUserRoleExample employeeUserRoleExample);

}
