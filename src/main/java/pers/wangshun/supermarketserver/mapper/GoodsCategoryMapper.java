package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.GoodsCategory;
import pers.wangshun.supermarketserver.model.GoodsCategoryExample;

import java.util.List;

public interface GoodsCategoryMapper {
    int deleteByPrimaryKey(Integer categoryNumber);

    int insert(GoodsCategory record);

    int insertSelective(GoodsCategory record);

    List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    GoodsCategory selectByPrimaryKey(Integer categoryNumber);

    int updateByPrimaryKeySelective(GoodsCategory record);

    int updateByPrimaryKey(GoodsCategory record);

}