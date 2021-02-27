package pers.wangshun.supermarketserver.mapper;

import java.util.List;
import pers.wangshun.supermarketserver.model.ExpensesRecord;
import pers.wangshun.supermarketserver.model.ExpensesRecordExample;

public interface ExpensesRecordMapper {
    int deleteByPrimaryKey(Long invoiceNumber);

    int insert(ExpensesRecord record);

    int insertSelective(ExpensesRecord record);

    List<ExpensesRecord> selectByExample(ExpensesRecordExample example);

    ExpensesRecord selectByPrimaryKey(Long invoiceNumber);

    int updateByPrimaryKeySelective(ExpensesRecord record);

    int updateByPrimaryKey(ExpensesRecord record);
}