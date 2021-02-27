package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.UserRoleExample;
import pers.wangshun.supermarketserver.model.UserRoleKey;

import java.util.List;

public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

    int updateByPrimaryKeySelective(UserRoleKey record);

    List<UserRoleKey> selectByExample(UserRoleExample example);

    UserRoleKey selectByUserId(Integer userId);
}