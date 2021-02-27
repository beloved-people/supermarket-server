package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.GoodsInfo;
import pers.wangshun.supermarketserver.model.GoodsInfoExample;

import java.util.List;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Long goodsBarCode);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    List<GoodsInfo> selectByExample(GoodsInfoExample example);

    GoodsInfo selectByPrimaryKey(Long goodsBarCode);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}