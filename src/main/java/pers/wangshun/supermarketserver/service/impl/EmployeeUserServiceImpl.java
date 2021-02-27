package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.EmployeeUserMapper;
import pers.wangshun.supermarketserver.model.EmployeeUser;
import pers.wangshun.supermarketserver.model.EmployeeUserExample;
import pers.wangshun.supermarketserver.service.EmployeeUserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class EmployeeUserServiceImpl implements EmployeeUserService {
    @Resource
    private EmployeeUserMapper employeeUserMapper;
    @Override
    public List<EmployeeUser> selectAll() {
        return employeeUserMapper.selectAll();
    }

    @Override
    public EmployeeUser login(Long employeeCode, String username, String password) {
        return employeeUserMapper.login(employeeCode, username, password);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return employeeUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(EmployeeUser record) {
        return employeeUserMapper.insert(record);
    }

    @Override
    public EmployeeUser selectByEmployeeCodeAndPassword(Long employeeCode, String password) {
        return employeeUserMapper.selectByEmployeeCodeAndPassword(employeeCode, password);
    }

    @Override
    public int insertSelective(EmployeeUser record) {
        return employeeUserMapper.insertSelective(record);
    }

    @Override
    public EmployeeUser selectById(Integer id) {
        return employeeUserMapper.selectById(id);
    }

    @Override
    public List<EmployeeUser> selectByExample(EmployeeUserExample example) {
        return employeeUserMapper.selectByExample(example);
    }

    @Override
    public List<EmployeeUser> selectByEmployeeShopId(Long employeeShopId) {
        return employeeUserMapper.selectByEmployeeShopId(employeeShopId);
    }

    @Override
    public EmployeeUser selectByPrimaryKey(Integer id) {
        return employeeUserMapper.selectByPrimaryKey(id);
    }


    @Override
    public EmployeeUser selectByUsernameAndPassword(String username, String password) {
        return employeeUserMapper.selectByUsernameAndPassword(username, password);
    }

    @Override
    public EmployeeUser selectByEmployeeCode(Long employeeCode) {
        return employeeUserMapper.selectByEmployeeCode(employeeCode);
    }

    @Override
    public int updateByPrimaryKeySelective(EmployeeUser record) {
        return employeeUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(EmployeeUser record) {
        return employeeUserMapper.updateByPrimaryKey(record);
    }
}
