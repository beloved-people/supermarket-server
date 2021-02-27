package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryInfo;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryInfoExample;

import java.util.List;

public interface PurchaseAccountingEntryInfoService {
    int deleteByPrimaryKey(Long purchaseAccountingEntryId);

    int insert(PurchaseAccountingEntryInfo record);

    int insertSelective(PurchaseAccountingEntryInfo record);

    List<PurchaseAccountingEntryInfo> selectByExample(PurchaseAccountingEntryInfoExample example);

    PurchaseAccountingEntryInfo selectByPrimaryKey(Long purchaseAccountingEntryId);

    int updateByPrimaryKeySelective(PurchaseAccountingEntryInfo record);

    int updateByPrimaryKey(PurchaseAccountingEntryInfo record);
}
