package pers.wangshun.supermarketserver.mapper;

import pers.wangshun.supermarketserver.model.VipUser;
import pers.wangshun.supermarketserver.model.VipUserExample;

import java.util.List;

public interface VipUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VipUser record);

    int insertSelective(VipUser record);

    List<VipUser> selectByExample(VipUserExample example);

    VipUser selectByVipUser(String vipCardCode, String username, String password);
    VipUser selectByVipCardCode(String vipCardCode);

    VipUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VipUser record);

    int updateByPrimaryKey(VipUser record);
}