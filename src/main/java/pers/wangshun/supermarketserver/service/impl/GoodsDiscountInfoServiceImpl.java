package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.GoodsDiscountInfoMapper;
import pers.wangshun.supermarketserver.model.GoodsDiscountInfo;
import pers.wangshun.supermarketserver.model.GoodsDiscountInfoExample;
import pers.wangshun.supermarketserver.service.GoodsDiscountInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class GoodsDiscountInfoServiceImpl implements GoodsDiscountInfoService {

    @Resource
    private GoodsDiscountInfoMapper goodsDiscountInfoMapper;

    @Override
    public GoodsDiscountInfo selectByPrimaryKey(Long goodsBarCode) {
        return goodsDiscountInfoMapper.selectByPrimaryKey(goodsBarCode);
    }

    @Override
    public int insert(GoodsDiscountInfo record) {
        return goodsDiscountInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsDiscountInfo record) {
        return goodsDiscountInfoMapper.insertSelective(record);
    }

    @Override
    public List<GoodsDiscountInfo> selectByExample(GoodsDiscountInfoExample example) {
        return goodsDiscountInfoMapper.selectByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long goodsBarCode) {
        return goodsDiscountInfoMapper.deleteByPrimaryKey(goodsBarCode);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsDiscountInfo record) {
        return goodsDiscountInfoMapper.updateByPrimaryKeySelective(record);
    }
}
