package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.UserRoleMapper;
import pers.wangshun.supermarketserver.model.UserRoleExample;
import pers.wangshun.supermarketserver.model.UserRoleKey;
import pers.wangshun.supermarketserver.service.UserRoleService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Resource
    private UserRoleMapper userRoleMapper;


    @Override
    public int deleteByPrimaryKey(UserRoleKey key) {
        return userRoleMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(UserRoleKey record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(UserRoleKey record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRoleKey record) {
        return userRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<UserRoleKey> selectByExample(UserRoleExample example) {
        return userRoleMapper.selectByExample(example);
    }

    @Override
    public UserRoleKey selectByUserId(Integer userId) {
        return userRoleMapper.selectByUserId(userId);
    }
}
