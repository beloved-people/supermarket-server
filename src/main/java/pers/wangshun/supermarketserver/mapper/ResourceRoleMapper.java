package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.ResourceRoleExample;
import pers.wangshun.supermarketserver.model.ResourceRoleKey;

public interface ResourceRoleMapper {
    int deleteByPrimaryKey(ResourceRoleKey key);

    int insert(ResourceRoleKey record);

    int insertSelective(ResourceRoleKey record);

    List<ResourceRoleKey> selectByExample(ResourceRoleExample example);
}