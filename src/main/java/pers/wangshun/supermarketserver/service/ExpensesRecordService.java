package pers.wangshun.supermarketserver.service;

import pers.wangshun.supermarketserver.model.ExpensesRecord;
import pers.wangshun.supermarketserver.model.ExpensesRecordExample;

import java.util.List;

public interface ExpensesRecordService {
    int deleteByPrimaryKey(Long invoiceNumber);

    int insert(ExpensesRecord record);

    int insertSelective(ExpensesRecord record);

    List<ExpensesRecord> selectByExample(ExpensesRecordExample example);

    ExpensesRecord selectByPrimaryKey(Long invoiceNumber);

    int updateByPrimaryKeySelective(ExpensesRecord record);

    int updateByPrimaryKey(ExpensesRecord record);
}
