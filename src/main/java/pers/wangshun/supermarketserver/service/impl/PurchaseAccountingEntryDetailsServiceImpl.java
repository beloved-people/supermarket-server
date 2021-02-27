package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.PurchaseAccountingEntryDetailsMapper;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryDetails;
import pers.wangshun.supermarketserver.model.PurchaseAccountingEntryDetailsExample;
import pers.wangshun.supermarketserver.service.PurchaseAccountingEntryDetailsService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PurchaseAccountingEntryDetailsServiceImpl implements PurchaseAccountingEntryDetailsService {
    @Resource
    private PurchaseAccountingEntryDetailsMapper purchaseAccountingEntryDetailsMapper;
    @Override
    public int deleteByPrimaryKey(Long purchaseAccountingEntryDetailsId) {
        return purchaseAccountingEntryDetailsMapper.deleteByPrimaryKey(purchaseAccountingEntryDetailsId);
    }

    @Override
    public int insert(PurchaseAccountingEntryDetails record) {
        return purchaseAccountingEntryDetailsMapper.insert(record);
    }

    @Override
    public int insertSelective(PurchaseAccountingEntryDetails record) {
        return purchaseAccountingEntryDetailsMapper.insertSelective(record);
    }

    @Override
    public List<PurchaseAccountingEntryDetails> selectByExample(PurchaseAccountingEntryDetailsExample example) {
        return purchaseAccountingEntryDetailsMapper.selectByExample(example);
    }

    @Override
    public PurchaseAccountingEntryDetails selectByPrimaryKey(Long purchaseAccountingEntryDetailsId) {
        return purchaseAccountingEntryDetailsMapper.selectByPrimaryKey(purchaseAccountingEntryDetailsId);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseAccountingEntryDetails record) {
        return purchaseAccountingEntryDetailsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PurchaseAccountingEntryDetails record) {
        return purchaseAccountingEntryDetailsMapper.updateByPrimaryKey(record);
    }
}
