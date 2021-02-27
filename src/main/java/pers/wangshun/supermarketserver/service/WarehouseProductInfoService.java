package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.WarehouseProductInfo;
import pers.wangshun.supermarketserver.model.WarehouseProductInfoExample;

import java.util.List;

public interface WarehouseProductInfoService {
    int insert(WarehouseProductInfo record);

    int insertSelective(WarehouseProductInfo record);

    List<WarehouseProductInfo> selectByExample(WarehouseProductInfoExample example);
}
