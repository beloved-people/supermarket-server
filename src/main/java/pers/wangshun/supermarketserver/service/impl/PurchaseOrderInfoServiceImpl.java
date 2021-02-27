package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.PurchaseOrderInfoMapper;
import pers.wangshun.supermarketserver.model.PurchaseOrderInfo;
import pers.wangshun.supermarketserver.model.PurchaseOrderInfoExample;
import pers.wangshun.supermarketserver.service.PurchaseOrderInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class PurchaseOrderInfoServiceImpl implements PurchaseOrderInfoService {
    @Resource
    private PurchaseOrderInfoMapper purchaseOrderInfoMapper;
    @Override
    public int deleteByPrimaryKey(Long purchaseOrderNumber) {
        return purchaseOrderInfoMapper.deleteByPrimaryKey(purchaseOrderNumber);
    }

    @Override
    public int insert(PurchaseOrderInfo record) {
        return purchaseOrderInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(PurchaseOrderInfo record) {
        return purchaseOrderInfoMapper.insertSelective(record);
    }

    @Override
    public List<PurchaseOrderInfo> selectByExample(PurchaseOrderInfoExample example) {
        return purchaseOrderInfoMapper.selectByExample(example);
    }

    @Override
    public PurchaseOrderInfo selectByPrimaryKey(Long purchaseOrderNumber) {
        return purchaseOrderInfoMapper.selectByPrimaryKey(purchaseOrderNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseOrderInfo record) {
        return purchaseOrderInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PurchaseOrderInfo record) {
        return purchaseOrderInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int update(Long purchaseOrderNumber, Long orderer, String purchaseOrderFinishedCondition) {
        return purchaseOrderInfoMapper.update(purchaseOrderNumber,orderer,purchaseOrderFinishedCondition);
    }
}
