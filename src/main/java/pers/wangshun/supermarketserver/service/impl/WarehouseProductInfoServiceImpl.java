package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.WarehouseProductInfoMapper;
import pers.wangshun.supermarketserver.model.WarehouseProductInfo;
import pers.wangshun.supermarketserver.model.WarehouseProductInfoExample;
import pers.wangshun.supermarketserver.service.WarehouseProductInfoService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WarehouseProductInfoServiceImpl implements WarehouseProductInfoService {
    @Resource
    private WarehouseProductInfoMapper warehouseProductInfoMapper;

    @Override
    public int insert(WarehouseProductInfo record) {
        return warehouseProductInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(WarehouseProductInfo record) {
        return warehouseProductInfoMapper.insertSelective(record);
    }

    @Override
    public List<WarehouseProductInfo> selectByExample(WarehouseProductInfoExample example) {
        return warehouseProductInfoMapper.selectByExample(example);
    }
}
