package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.InventoryGainLossDetails;
import pers.wangshun.supermarketserver.model.InventoryGainLossDetailsExample;
import pers.wangshun.supermarketserver.model.InventoryGainLossDetailsKey;

public interface InventoryGainLossDetailsMapper {
    int deleteByPrimaryKey(InventoryGainLossDetailsKey key);

    int insert(InventoryGainLossDetails record);

    int insertSelective(InventoryGainLossDetails record);

    List<InventoryGainLossDetails> selectByExample(InventoryGainLossDetailsExample example);

    InventoryGainLossDetails selectByPrimaryKey(InventoryGainLossDetailsKey key);

    int updateByPrimaryKeySelective(InventoryGainLossDetails record);

    int updateByPrimaryKey(InventoryGainLossDetails record);
}