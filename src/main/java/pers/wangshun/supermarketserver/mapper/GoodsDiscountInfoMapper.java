package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.GoodsDiscountInfo;
import pers.wangshun.supermarketserver.model.GoodsDiscountInfoExample;

import java.util.List;

public interface GoodsDiscountInfoMapper {
    int insert(GoodsDiscountInfo record);

    int insertSelective(GoodsDiscountInfo record);

    List<GoodsDiscountInfo> selectByExample(GoodsDiscountInfoExample example);

    GoodsDiscountInfo selectByPrimaryKey(Long goodsBarCode);

    int updateByPrimaryKeySelective(GoodsDiscountInfo record);

    int deleteByPrimaryKey(Long goodsBarCode);


}