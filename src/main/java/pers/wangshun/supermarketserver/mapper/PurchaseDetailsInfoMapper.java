package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.PurchaseDetailsInfo;
import pers.wangshun.supermarketserver.model.PurchaseDetailsInfoExample;

import java.util.List;

public interface PurchaseDetailsInfoMapper {
    int deleteByPrimaryKey(Long purchaseDetailsNumber);
    int deleteByPurchaseOrderNumber(Long purchaseOrderNumber);

    int insert(PurchaseDetailsInfo record);

    int insertSelective(PurchaseDetailsInfo record);

    List<PurchaseDetailsInfo> selectByExample(PurchaseDetailsInfoExample example);

    PurchaseDetailsInfo selectByPrimaryKey(Long purchaseDetailsNumber);

    int updateByPrimaryKeySelective(PurchaseDetailsInfo record);

    int updateByPrimaryKey(PurchaseDetailsInfo record);
}