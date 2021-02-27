package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.GoodsPriceAdjustmentInfo;
import pers.wangshun.supermarketserver.model.GoodsPriceAdjustmentInfoExample;

public interface GoodsPriceAdjustmentInfoMapper {
    int deleteByPrimaryKey(Long goodsBarCode);

    int insert(GoodsPriceAdjustmentInfo record);

    int insertSelective(GoodsPriceAdjustmentInfo record);

    List<GoodsPriceAdjustmentInfo> selectByExample(GoodsPriceAdjustmentInfoExample example);

    GoodsPriceAdjustmentInfo selectByPrimaryKey(Long goodsBarCode);

    int updateByPrimaryKeySelective(GoodsPriceAdjustmentInfo record);

    int updateByPrimaryKey(GoodsPriceAdjustmentInfo record);
}