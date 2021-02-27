package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.WarehouseProductInfo;
import pers.wangshun.supermarketserver.model.WarehouseProductInfoExample;

public interface WarehouseProductInfoMapper {
    int insert(WarehouseProductInfo record);

    int insertSelective(WarehouseProductInfo record);

    List<WarehouseProductInfo> selectByExample(WarehouseProductInfoExample example);
}