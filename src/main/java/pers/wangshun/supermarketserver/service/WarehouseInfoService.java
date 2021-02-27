package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.WarehouseInfo;
import pers.wangshun.supermarketserver.model.WarehouseInfoExample;

import java.util.List;

public interface WarehouseInfoService {
    int deleteByPrimaryKey(Long warehouseCode);

    int insert(WarehouseInfo record);

    int insertSelective(WarehouseInfo record);

    List<WarehouseInfo> selectByExample(WarehouseInfoExample example);

    WarehouseInfo selectByPrimaryKey(Long warehouseCode);

    int updateByPrimaryKeySelective(WarehouseInfo record);

    int updateByPrimaryKey(WarehouseInfo record);
}
