package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.PurchaseDetailsInfoMapper;
import pers.wangshun.supermarketserver.model.PurchaseDetailsInfo;
import pers.wangshun.supermarketserver.model.PurchaseDetailsInfoExample;
import pers.wangshun.supermarketserver.service.PurchaseDetailsInfoService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PurchaseDetailsInfoServiceImpl implements PurchaseDetailsInfoService {
    @Resource
    private PurchaseDetailsInfoMapper purchaseDetailsInfoMapper;
    @Override
    public int deleteByPrimaryKey(Long purchaseDetailsNumber) {
        return purchaseDetailsInfoMapper.deleteByPrimaryKey(purchaseDetailsNumber);
    }

    @Override
    public int deleteByPurchaseOrderNumber(Long purchaseOrderNumber) {
        return purchaseDetailsInfoMapper.deleteByPurchaseOrderNumber(purchaseOrderNumber);
    }

    @Override
    public int insert(PurchaseDetailsInfo record) {
        return purchaseDetailsInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PurchaseDetailsInfo record) {
        return purchaseDetailsInfoMapper.insertSelective(record);
    }

    @Override
    public List<PurchaseDetailsInfo> selectByExample(PurchaseDetailsInfoExample example) {
        return purchaseDetailsInfoMapper.selectByExample(example);
    }

    @Override
    public PurchaseDetailsInfo selectByPrimaryKey(Long purchaseDetailsNumber) {
        return purchaseDetailsInfoMapper.selectByPrimaryKey(purchaseDetailsNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseDetailsInfo record) {
        return purchaseDetailsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PurchaseDetailsInfo record) {
        return purchaseDetailsInfoMapper.updateByPrimaryKey(record);
    }
}
