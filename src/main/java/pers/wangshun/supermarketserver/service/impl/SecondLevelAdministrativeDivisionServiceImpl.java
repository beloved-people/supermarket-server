package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.SecondLevelAdministrativeDivisionMapper;
import pers.wangshun.supermarketserver.model.SecondLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.SecondLevelAdministrativeDivisionExample;
import pers.wangshun.supermarketserver.service.SecondLevelAdministrativeDivisionService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SecondLevelAdministrativeDivisionServiceImpl implements SecondLevelAdministrativeDivisionService {
    @Resource
    private SecondLevelAdministrativeDivisionMapper secondLevelAdministrativeDivisionMapper;

    @Override
    public int deleteByPrimaryKey(Integer secondLevelId) {
        return secondLevelAdministrativeDivisionMapper.deleteByPrimaryKey(secondLevelId);
    }

    @Override
    public int insert(SecondLevelAdministrativeDivision record) {
        return secondLevelAdministrativeDivisionMapper.insert(record);
    }

    @Override
    public int insertSelective(SecondLevelAdministrativeDivision record) {
        return secondLevelAdministrativeDivisionMapper.insertSelective(record);
    }

    @Override
    public List<SecondLevelAdministrativeDivision> selectByExample(SecondLevelAdministrativeDivisionExample example) {
        return secondLevelAdministrativeDivisionMapper.selectByExample(example);
    }

    @Override
    public SecondLevelAdministrativeDivision selectByPrimaryKey(Integer secondLevelId) {
        return secondLevelAdministrativeDivisionMapper.selectByPrimaryKey(secondLevelId);
    }

    @Override
    public int updateByPrimaryKeySelective(SecondLevelAdministrativeDivision record) {
        return secondLevelAdministrativeDivisionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SecondLevelAdministrativeDivision record) {
        return secondLevelAdministrativeDivisionMapper.updateByPrimaryKey(record);
    }
}
