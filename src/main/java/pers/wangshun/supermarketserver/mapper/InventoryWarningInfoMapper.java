package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.InventoryWarningInfo;
import pers.wangshun.supermarketserver.model.InventoryWarningInfoExample;

public interface InventoryWarningInfoMapper {
    int deleteByPrimaryKey(Long goodsBarCode);

    int insert(InventoryWarningInfo record);

    int insertSelective(InventoryWarningInfo record);

    List<InventoryWarningInfo> selectByExample(InventoryWarningInfoExample example);

    InventoryWarningInfo selectByPrimaryKey(Long goodsBarCode);

    int updateByPrimaryKeySelective(InventoryWarningInfo record);

    int updateByPrimaryKey(InventoryWarningInfo record);
}