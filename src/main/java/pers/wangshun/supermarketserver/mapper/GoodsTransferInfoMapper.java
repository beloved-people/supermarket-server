package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.GoodsTransferInfo;
import pers.wangshun.supermarketserver.model.GoodsTransferInfoExample;

public interface GoodsTransferInfoMapper {
    int deleteByPrimaryKey(Long goodsTransferInfoId);

    int insert(GoodsTransferInfo record);

    int insertSelective(GoodsTransferInfo record);

    List<GoodsTransferInfo> selectByExample(GoodsTransferInfoExample example);

    GoodsTransferInfo selectByPrimaryKey(Long goodsTransferInfoId);

    int updateByPrimaryKeySelective(GoodsTransferInfo record);

    int updateByPrimaryKey(GoodsTransferInfo record);
}