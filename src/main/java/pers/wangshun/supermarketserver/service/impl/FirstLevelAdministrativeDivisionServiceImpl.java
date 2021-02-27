package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.FirstLevelAdministrativeDivisionMapper;
import pers.wangshun.supermarketserver.model.FirstLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.FirstLevelAdministrativeDivisionExample;
import pers.wangshun.supermarketserver.service.FirstLevelAdministrativeDivisionService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Service
public class FirstLevelAdministrativeDivisionServiceImpl implements FirstLevelAdministrativeDivisionService {
    @Resource
    private FirstLevelAdministrativeDivisionMapper firstLevelAdministrativeDivisionMapper;

    @Override
    public int deleteByPrimaryKey(Integer firstLevelId) {
        return firstLevelAdministrativeDivisionMapper.deleteByPrimaryKey(firstLevelId);
    }

    @Override
    public int insert(FirstLevelAdministrativeDivision record) {
        return firstLevelAdministrativeDivisionMapper.insert(record);
    }

    @Override
    public int insertSelective(FirstLevelAdministrativeDivision record) {
        return firstLevelAdministrativeDivisionMapper.insertSelective(record);
    }

    @Override
    public List<FirstLevelAdministrativeDivision> selectByExample(FirstLevelAdministrativeDivisionExample example) {
        return firstLevelAdministrativeDivisionMapper.selectByExample(example);
    }

    @Override
    public FirstLevelAdministrativeDivision selectByPrimaryKey(Integer firstLevelId) {
        return firstLevelAdministrativeDivisionMapper.selectByPrimaryKey(firstLevelId);
    }

    @Override
    public int updateByPrimaryKeySelective(FirstLevelAdministrativeDivision record) {
        return firstLevelAdministrativeDivisionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FirstLevelAdministrativeDivision record) {
        return firstLevelAdministrativeDivisionMapper.updateByPrimaryKey(record);
    }
}
