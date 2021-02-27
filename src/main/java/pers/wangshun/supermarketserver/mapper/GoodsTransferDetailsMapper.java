package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.GoodsTransferDetails;
import pers.wangshun.supermarketserver.model.GoodsTransferDetailsExample;

public interface GoodsTransferDetailsMapper {
    int deleteByPrimaryKey(Long goodsTransferDetailsId);

    int insert(GoodsTransferDetails record);

    int insertSelective(GoodsTransferDetails record);

    List<GoodsTransferDetails> selectByExample(GoodsTransferDetailsExample example);

    GoodsTransferDetails selectByPrimaryKey(Long goodsTransferDetailsId);

    int updateByPrimaryKeySelective(GoodsTransferDetails record);

    int updateByPrimaryKey(GoodsTransferDetails record);
}