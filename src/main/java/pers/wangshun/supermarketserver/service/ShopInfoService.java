package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.ShopInfo;
import pers.wangshun.supermarketserver.model.ShopInfoExample;

import java.util.List;

/**
 * @author WangShun
 */
public interface ShopInfoService {
    int deleteByPrimaryKey(Long shopId);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    List<ShopInfo> selectByExample(ShopInfoExample example);

    ShopInfo selectByPrimaryKey(Long shopId);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);
}
