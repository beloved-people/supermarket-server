package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.SupplierInfoMapper;
import pers.wangshun.supermarketserver.model.SupplierInfo;
import pers.wangshun.supermarketserver.model.SupplierInfoExample;
import pers.wangshun.supermarketserver.service.SupplierInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class SupplierInfoServiceImpl implements SupplierInfoService {
    @Resource
    private SupplierInfoMapper supplierInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer supplierId) {
        return supplierInfoMapper.deleteByPrimaryKey(supplierId);
    }

    @Override
    public int insert(SupplierInfo record) {
        return supplierInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(SupplierInfo record) {
        return supplierInfoMapper.insertSelective(record);
    }

    @Override
    public List<SupplierInfo> selectByExample(SupplierInfoExample example) {
        return supplierInfoMapper.selectByExample(example);
    }

    @Override
    public SupplierInfo selectByPrimaryKey(Integer supplierId) {
        return supplierInfoMapper.selectByPrimaryKey(supplierId);
    }

    @Override
    public int updateByPrimaryKeySelective(SupplierInfo record) {
        return supplierInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SupplierInfo record) {
        return supplierInfoMapper.updateByPrimaryKey(record);
    }
}
