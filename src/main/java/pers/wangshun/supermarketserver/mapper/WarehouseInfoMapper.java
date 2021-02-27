package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.WarehouseInfo;
import pers.wangshun.supermarketserver.model.WarehouseInfoExample;

public interface WarehouseInfoMapper {
    int deleteByPrimaryKey(Long warehouseCode);

    int insert(WarehouseInfo record);

    int insertSelective(WarehouseInfo record);

    List<WarehouseInfo> selectByExample(WarehouseInfoExample example);

    WarehouseInfo selectByPrimaryKey(Long warehouseCode);

    int updateByPrimaryKeySelective(WarehouseInfo record);

    int updateByPrimaryKey(WarehouseInfo record);
}