package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.PurchaseOrderInfo;
import pers.wangshun.supermarketserver.model.PurchaseOrderInfoExample;

import java.util.List;

public interface PurchaseOrderInfoMapper {
    int deleteByPrimaryKey(Long purchaseOrderNumber);

    int insert(PurchaseOrderInfo record);

    int insertSelective(PurchaseOrderInfo record);

    List<PurchaseOrderInfo> selectByExample(PurchaseOrderInfoExample example);

    PurchaseOrderInfo selectByPrimaryKey(Long purchaseOrderNumber);

    int updateByPrimaryKeySelective(PurchaseOrderInfo record);
    int update(Long purchaseOrderNumber, Long orderer,String purchaseOrderFinishedCondition);

    int updateByPrimaryKey(PurchaseOrderInfo record);
}