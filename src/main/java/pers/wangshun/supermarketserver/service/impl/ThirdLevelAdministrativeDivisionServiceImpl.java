package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.ThirdLevelAdministrativeDivisionMapper;
import pers.wangshun.supermarketserver.model.ThirdLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.ThirdLevelAdministrativeDivisionExample;
import pers.wangshun.supermarketserver.service.ThirdLevelAdministrativeDivisionService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ThirdLevelAdministrativeDivisionServiceImpl implements ThirdLevelAdministrativeDivisionService {
    @Resource
    private ThirdLevelAdministrativeDivisionMapper thirdLevelAdministrativeDivisionMapper;


    @Override
    public int deleteByPrimaryKey(Integer thirdLevelId) {
        return thirdLevelAdministrativeDivisionMapper.deleteByPrimaryKey(thirdLevelId);
    }

    @Override
    public int insert(ThirdLevelAdministrativeDivision record) {
        return thirdLevelAdministrativeDivisionMapper.insert(record);
    }

    @Override
    public int insertSelective(ThirdLevelAdministrativeDivision record) {
        return thirdLevelAdministrativeDivisionMapper.insertSelective(record);
    }

    @Override
    public List<ThirdLevelAdministrativeDivision> selectByExample(ThirdLevelAdministrativeDivisionExample example) {
        return thirdLevelAdministrativeDivisionMapper.selectByExample(example);
    }

    @Override
    public ThirdLevelAdministrativeDivision selectByPrimaryKey(Integer thirdLevelId) {
        return thirdLevelAdministrativeDivisionMapper.selectByPrimaryKey(thirdLevelId);
    }

    @Override
    public int updateByPrimaryKeySelective(ThirdLevelAdministrativeDivision record) {
        return thirdLevelAdministrativeDivisionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ThirdLevelAdministrativeDivision record) {
        return thirdLevelAdministrativeDivisionMapper.updateByPrimaryKey(record);
    }
}
