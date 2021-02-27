package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.FourthLevelAdministrativeDivisionMapper;
import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivisionExample;
import pers.wangshun.supermarketserver.service.FourthLevelAdministrativeDivisionService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FourthLevelAdministrativeDivisionServiceImpl implements FourthLevelAdministrativeDivisionService {
    @Resource
    private FourthLevelAdministrativeDivisionMapper fourthLevelAdministrativeDivisionMapper;
    @Override
    public int deleteByPrimaryKey(Integer fourthLevelId) {
        return fourthLevelAdministrativeDivisionMapper.deleteByPrimaryKey(fourthLevelId);
    }

    @Override
    public int insert(FourthLevelAdministrativeDivision record) {
        return fourthLevelAdministrativeDivisionMapper.insert(record);
    }

    @Override
    public int insertSelective(FourthLevelAdministrativeDivision record) {
        return fourthLevelAdministrativeDivisionMapper.insertSelective(record);
    }

    @Override
    public List<FourthLevelAdministrativeDivision> selectByExample(FourthLevelAdministrativeDivisionExample example) {
        return fourthLevelAdministrativeDivisionMapper.selectByExample(example);
    }

    @Override
    public FourthLevelAdministrativeDivision selectByPrimaryKey(Integer fourthLevelId) {
        return fourthLevelAdministrativeDivisionMapper.selectByPrimaryKey(fourthLevelId);
    }

    @Override
    public int updateByPrimaryKeySelective(FourthLevelAdministrativeDivision record) {
        return fourthLevelAdministrativeDivisionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(FourthLevelAdministrativeDivision record) {
        return fourthLevelAdministrativeDivisionMapper.updateByPrimaryKey(record);
    }
}
