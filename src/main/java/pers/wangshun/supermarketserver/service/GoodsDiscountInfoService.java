package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.GoodsDiscountInfo;
import pers.wangshun.supermarketserver.model.GoodsDiscountInfoExample;

import java.util.List;

/**
 * @author WangShun
 */
public interface GoodsDiscountInfoService {
    GoodsDiscountInfo selectByPrimaryKey(Long goodsBarCode);
    int insert(GoodsDiscountInfo record);

    int insertSelective(GoodsDiscountInfo record);

    List<GoodsDiscountInfo> selectByExample(GoodsDiscountInfoExample example);

    int deleteByPrimaryKey(Long goodsBarCode);

    int updateByPrimaryKeySelective(GoodsDiscountInfo record);
}
