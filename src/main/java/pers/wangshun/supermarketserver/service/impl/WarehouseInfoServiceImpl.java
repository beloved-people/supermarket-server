package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.WarehouseInfoMapper;
import pers.wangshun.supermarketserver.model.WarehouseInfo;
import pers.wangshun.supermarketserver.model.WarehouseInfoExample;
import pers.wangshun.supermarketserver.service.WarehouseInfoService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WarehouseInfoServiceImpl implements WarehouseInfoService {
    @Resource
    private WarehouseInfoMapper warehouseInfoMapper;
    @Override
    public int deleteByPrimaryKey(Long warehouseCode) {
        return warehouseInfoMapper.deleteByPrimaryKey(warehouseCode);
    }

    @Override
    public int insert(WarehouseInfo record) {
        return warehouseInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(WarehouseInfo record) {
        return warehouseInfoMapper.insertSelective(record);
    }

    @Override
    public List<WarehouseInfo> selectByExample(WarehouseInfoExample example) {
        return warehouseInfoMapper.selectByExample(example);
    }

    @Override
    public WarehouseInfo selectByPrimaryKey(Long warehouseCode) {
        return warehouseInfoMapper.selectByPrimaryKey(warehouseCode);
    }

    @Override
    public int updateByPrimaryKeySelective(WarehouseInfo record) {
        return warehouseInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WarehouseInfo record) {
        return warehouseInfoMapper.updateByPrimaryKey(record);
    }
}
