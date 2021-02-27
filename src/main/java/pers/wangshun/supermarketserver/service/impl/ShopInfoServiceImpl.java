package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.ShopInfoMapper;
import pers.wangshun.supermarketserver.model.ShopInfo;
import pers.wangshun.supermarketserver.model.ShopInfoExample;
import pers.wangshun.supermarketserver.service.ShopInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class ShopInfoServiceImpl implements ShopInfoService {
    @Resource
    private ShopInfoMapper shopInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long shopId) {
        return shopInfoMapper.deleteByPrimaryKey(shopId);
    }

    @Override
    public int insert(ShopInfo record) {
        return shopInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(ShopInfo record) {
        return shopInfoMapper.insertSelective(record);
    }

    @Override
    public List<ShopInfo> selectByExample(ShopInfoExample example) {
        return shopInfoMapper.selectByExample(example);
    }

    @Override
    public ShopInfo selectByPrimaryKey(Long shopId) {
        return shopInfoMapper.selectByPrimaryKey(shopId);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopInfo record) {
        return shopInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopInfo record) {
        return shopInfoMapper.updateByPrimaryKey(record);
    }
}
