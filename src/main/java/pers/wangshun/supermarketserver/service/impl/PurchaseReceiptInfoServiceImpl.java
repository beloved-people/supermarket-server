package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.PurchaseReceiptInfoMapper;
import pers.wangshun.supermarketserver.model.PurchaseReceiptInfo;
import pers.wangshun.supermarketserver.model.PurchaseReceiptInfoExample;
import pers.wangshun.supermarketserver.service.PurchaseReceiptInfoService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PurchaseReceiptInfoServiceImpl implements PurchaseReceiptInfoService {
    @Resource
    private PurchaseReceiptInfoMapper purchaseReceiptInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long purchaseReceiptNumber) {
        return purchaseReceiptInfoMapper.deleteByPrimaryKey(purchaseReceiptNumber);
    }

    @Override
    public int insert(PurchaseReceiptInfo record) {
        return purchaseReceiptInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PurchaseReceiptInfo record) {
        return purchaseReceiptInfoMapper.insertSelective(record);
    }

    @Override
    public List<PurchaseReceiptInfo> selectByExample(PurchaseReceiptInfoExample example) {
        return purchaseReceiptInfoMapper.selectByExample(example);
    }

    @Override
    public PurchaseReceiptInfo selectByPrimaryKey(Long purchaseReceiptNumber) {
        return purchaseReceiptInfoMapper.selectByPrimaryKey(purchaseReceiptNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseReceiptInfo record) {
        return purchaseReceiptInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PurchaseReceiptInfo record) {
        return purchaseReceiptInfoMapper.updateByPrimaryKey(record);
    }
}
