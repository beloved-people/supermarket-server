package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.ExpensesRecordMapper;
import pers.wangshun.supermarketserver.model.ExpensesRecord;
import pers.wangshun.supermarketserver.model.ExpensesRecordExample;
import pers.wangshun.supermarketserver.service.ExpensesRecordService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ExpensesRecordServiceImpl implements ExpensesRecordService {
    @Resource
    private ExpensesRecordMapper expensesRecordMapper;
    @Override
    public int deleteByPrimaryKey(Long invoiceNumber) {
        return expensesRecordMapper.deleteByPrimaryKey(invoiceNumber);
    }

    @Override
    public int insert(ExpensesRecord record) {
        return expensesRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(ExpensesRecord record) {
        return expensesRecordMapper.insertSelective(record);
    }

    @Override
    public List<ExpensesRecord> selectByExample(ExpensesRecordExample example) {
        return expensesRecordMapper.selectByExample(example);
    }

    @Override
    public ExpensesRecord selectByPrimaryKey(Long invoiceNumber) {
        return expensesRecordMapper.selectByPrimaryKey(invoiceNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(ExpensesRecord record) {
        return expensesRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ExpensesRecord record) {
        return expensesRecordMapper.updateByPrimaryKey(record);
    }
}
