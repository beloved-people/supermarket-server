package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.InventoryCountingInfo;
import pers.wangshun.supermarketserver.model.InventoryCountingInfoExample;

public interface InventoryCountingInfoMapper {
    int deleteByPrimaryKey(Long inventoryCountingInfoNumber);

    int insert(InventoryCountingInfo record);

    int insertSelective(InventoryCountingInfo record);

    List<InventoryCountingInfo> selectByExample(InventoryCountingInfoExample example);

    InventoryCountingInfo selectByPrimaryKey(Long inventoryCountingInfoNumber);

    int updateByPrimaryKeySelective(InventoryCountingInfo record);

    int updateByPrimaryKey(InventoryCountingInfo record);
}