package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.EmployeeUserRoleExample;

import java.util.List;

public interface EmployeeUserRoleService {
    List<EmployeeUserRoleExample> selectByName(EmployeeUserRoleExample employeeUserRoleExample);
}
