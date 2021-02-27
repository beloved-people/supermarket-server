package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.PurchaseAccountingEntryInfoMapper;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryInfo;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryInfoExample;
import pers.wangshun.supermarketserver.service.PurchaseAccountingEntryInfoService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PurchaseAccountingEntryInfoServiceImpl implements PurchaseAccountingEntryInfoService {
    @Resource
    private PurchaseAccountingEntryInfoMapper purchaseAccountingEntryInfoMapper;
    @Override
    public int deleteByPrimaryKey(Long purchaseAccountingEntryId) {
        return purchaseAccountingEntryInfoMapper.deleteByPrimaryKey(purchaseAccountingEntryId);
    }

    @Override
    public int insert(PurchaseAccountingEntryInfo record) {
        return purchaseAccountingEntryInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PurchaseAccountingEntryInfo record) {
        return purchaseAccountingEntryInfoMapper.insertSelective(record);
    }

    @Override
    public List<PurchaseAccountingEntryInfo> selectByExample(PurchaseAccountingEntryInfoExample example) {
        return purchaseAccountingEntryInfoMapper.selectByExample(example);
    }

    @Override
    public PurchaseAccountingEntryInfo selectByPrimaryKey(Long purchaseAccountingEntryId) {
        return purchaseAccountingEntryInfoMapper.selectByPrimaryKey(purchaseAccountingEntryId);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseAccountingEntryInfo record) {
        return purchaseAccountingEntryInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PurchaseAccountingEntryInfo record) {
        return purchaseAccountingEntryInfoMapper.updateByPrimaryKey(record);
    }
}
