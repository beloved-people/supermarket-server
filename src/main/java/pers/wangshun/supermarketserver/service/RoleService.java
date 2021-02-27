package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.Role;
import pers.wangshun.supermarketserver.model.RoleExample;

import java.util.List;

/**
 * @author WangShun
 */
public interface RoleService {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}
