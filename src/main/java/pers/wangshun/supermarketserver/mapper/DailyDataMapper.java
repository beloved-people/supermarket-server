package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.DailyData;
import pers.wangshun.supermarketserver.model.DailyDataExample;

public interface DailyDataMapper {
    int deleteByPrimaryKey(Integer volumeId);

    int insert(DailyData record);

    int insertSelective(DailyData record);

    List<DailyData> selectByExample(DailyDataExample example);

    DailyData selectByPrimaryKey(Integer volumeId);

    int updateByPrimaryKeySelective(DailyData record);

    int updateByPrimaryKey(DailyData record);
}