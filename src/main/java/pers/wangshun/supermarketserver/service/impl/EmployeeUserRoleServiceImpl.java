package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.EmployeeUserRoleMapper;
import pers.wangshun.supermarketserver.model.EmployeeUserRoleExample;
import pers.wangshun.supermarketserver.service.EmployeeUserRoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class EmployeeUserRoleServiceImpl implements EmployeeUserRoleService {
    @Resource
    private EmployeeUserRoleMapper employeeUserRoleMapper;
    @Override
    public List<EmployeeUserRoleExample> selectByName(EmployeeUserRoleExample employeeUserRoleExample) {
        return employeeUserRoleMapper.selectByName(employeeUserRoleExample);
    }
}
