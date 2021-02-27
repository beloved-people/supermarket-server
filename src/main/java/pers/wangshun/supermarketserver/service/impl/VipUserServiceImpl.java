package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.VipUserMapper;
import pers.wangshun.supermarketserver.model.VipUser;
import pers.wangshun.supermarketserver.model.VipUserExample;
import pers.wangshun.supermarketserver.service.VipUserService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VipUserServiceImpl implements VipUserService {
    @Resource
    private VipUserMapper vipUserMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return vipUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(VipUser record) {
        return vipUserMapper.insert(record);
    }

    @Override
    public int insertSelective(VipUser record) {
        return vipUserMapper.insertSelective(record);
    }

    @Override
    public List<VipUser> selectByExample(VipUserExample example) {
        return vipUserMapper.selectByExample(example);
    }

    @Override
    public VipUser selectByVipUser(String vipCardCode, String username, String password) {
        return vipUserMapper.selectByVipUser(vipCardCode,username,password);
    }

    @Override
    public VipUser selectByVipCardCode(String vipCardCode) {
        return vipUserMapper.selectByVipCardCode(vipCardCode);
    }

    @Override
    public VipUser selectByPrimaryKey(Integer id) {
        return vipUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(VipUser record) {
        return vipUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(VipUser record) {
        return vipUserMapper.updateByPrimaryKey(record);
    }
}
