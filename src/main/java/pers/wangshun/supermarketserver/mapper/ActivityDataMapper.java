package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.ActivityData;
import pers.wangshun.supermarketserver.model.ActivityDataExample;

public interface ActivityDataMapper {
    int deleteByPrimaryKey(Long shopId);

    int insert(ActivityData record);

    int insertSelective(ActivityData record);

    List<ActivityData> selectByExample(ActivityDataExample example);

    ActivityData selectByPrimaryKey(Long shopId);

    int updateByPrimaryKeySelective(ActivityData record);

    int updateByPrimaryKey(ActivityData record);
}