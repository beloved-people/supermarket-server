package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.PurchaseReceiptInfo;
import pers.wangshun.supermarketserver.model.PurchaseReceiptInfoExample;

import java.util.List;

public interface PurchaseReceiptInfoService {
    int deleteByPrimaryKey(Long purchaseReceiptNumber);

    int insert(PurchaseReceiptInfo record);

    int insertSelective(PurchaseReceiptInfo record);

    List<PurchaseReceiptInfo> selectByExample(PurchaseReceiptInfoExample example);

    PurchaseReceiptInfo selectByPrimaryKey(Long purchaseReceiptNumber);

    int updateByPrimaryKeySelective(PurchaseReceiptInfo record);

    int updateByPrimaryKey(PurchaseReceiptInfo record);
}
