package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.GoodsInfoMapper;
import pers.wangshun.supermarketserver.model.GoodsInfo;
import pers.wangshun.supermarketserver.model.GoodsInfoExample;
import pers.wangshun.supermarketserver.service.GoodsInfoService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {
    @Resource
    private GoodsInfoMapper goodsInfoMapper;

    @Override
    public int deleteByPrimaryKey(Long goodsBarCode) {
        return goodsInfoMapper.deleteByPrimaryKey(goodsBarCode);
    }

    @Override
    public int insert(GoodsInfo record) {
        return goodsInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsInfo record) {
        return goodsInfoMapper.insertSelective(record);
    }

    @Override
    public List<GoodsInfo> selectByExample(GoodsInfoExample example) {
        return goodsInfoMapper.selectByExample(example);
    }

    @Override
    public GoodsInfo selectByPrimaryKey(Long goodsBarCode) {
        return goodsInfoMapper.selectByPrimaryKey(goodsBarCode);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsInfo record) {
        return goodsInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsInfo record) {
        return goodsInfoMapper.updateByPrimaryKey(record);
    }
}
