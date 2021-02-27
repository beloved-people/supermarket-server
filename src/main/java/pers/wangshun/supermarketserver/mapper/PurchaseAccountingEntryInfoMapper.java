package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryInfo;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryInfoExample;

import java.util.List;

public interface PurchaseAccountingEntryInfoMapper {
    int deleteByPrimaryKey(Long purchaseAccountingEntryId);

    int insert(PurchaseAccountingEntryInfo record);

    int insertSelective(PurchaseAccountingEntryInfo record);

    List<PurchaseAccountingEntryInfo> selectByExample(PurchaseAccountingEntryInfoExample example);

    PurchaseAccountingEntryInfo selectByPrimaryKey(Long purchaseAccountingEntryId);

    int updateByPrimaryKeySelective(PurchaseAccountingEntryInfo record);

    int updateByPrimaryKey(PurchaseAccountingEntryInfo record);
}