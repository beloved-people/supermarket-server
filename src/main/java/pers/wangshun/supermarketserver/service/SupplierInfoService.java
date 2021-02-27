package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.SupplierInfo;
import pers.wangshun.supermarketserver.model.SupplierInfoExample;

import java.util.List;

/**
 * @author WangShun
 */
public interface SupplierInfoService {
    int deleteByPrimaryKey(Integer supplierId);

    int insert(SupplierInfo record);

    int insertSelective(SupplierInfo record);

    List<SupplierInfo> selectByExample(SupplierInfoExample example);

    SupplierInfo selectByPrimaryKey(Integer supplierId);

    int updateByPrimaryKeySelective(SupplierInfo record);

    int updateByPrimaryKey(SupplierInfo record);
}
