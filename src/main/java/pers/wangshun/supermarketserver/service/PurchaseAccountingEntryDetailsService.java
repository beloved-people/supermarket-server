package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryDetails;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryDetailsExample;

import java.util.List;

public interface PurchaseAccountingEntryDetailsService {
    int deleteByPrimaryKey(Long purchaseAccountingEntryDetailsId);

    int insert(PurchaseAccountingEntryDetails record);

    int insertSelective(PurchaseAccountingEntryDetails record);

    List<PurchaseAccountingEntryDetails> selectByExample(PurchaseAccountingEntryDetailsExample example);

    PurchaseAccountingEntryDetails selectByPrimaryKey(Long purchaseAccountingEntryDetailsId);

    int updateByPrimaryKeySelective(PurchaseAccountingEntryDetails record);

    int updateByPrimaryKey(PurchaseAccountingEntryDetails record);
}
