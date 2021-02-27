package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.RoleMapper;
import pers.wangshun.supermarketserver.model.Role;
import pers.wangshun.supermarketserver.model.RoleExample;
import pers.wangshun.supermarketserver.service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public List<Role> selectByExample(RoleExample example) {
        return roleMapper.selectByExample(example);
    }

    @Override
    public Role selectByPrimaryKey(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }
}
