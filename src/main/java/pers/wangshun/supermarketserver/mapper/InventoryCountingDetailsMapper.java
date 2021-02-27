package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.InventoryCountingDetails;
import pers.wangshun.supermarketserver.model.InventoryCountingDetailsExample;

public interface InventoryCountingDetailsMapper {
    int deleteByPrimaryKey(Long inventoryCountingDetailsId);

    int insert(InventoryCountingDetails record);

    int insertSelective(InventoryCountingDetails record);

    List<InventoryCountingDetails> selectByExample(InventoryCountingDetailsExample example);

    InventoryCountingDetails selectByPrimaryKey(Long inventoryCountingDetailsId);

    int updateByPrimaryKeySelective(InventoryCountingDetails record);

    int updateByPrimaryKey(InventoryCountingDetails record);
}