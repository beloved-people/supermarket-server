package pers.wangshun.supermarketserver.service.impl;

import org.springframework.stereotype.Service;
import pers.wangshun.supermarketserver.mapper.GoodsCategoryMapper;
import pers.wangshun.supermarketserver.model.GoodsCategory;
import pers.wangshun.supermarketserver.model.GoodsCategoryExample;
import pers.wangshun.supermarketserver.service.GoodsCategoryService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    @Resource
    private GoodsCategoryMapper goodsCategoryMapper;
    @Override
    public int deleteByPrimaryKey(Integer categoryNumber) {
        return goodsCategoryMapper.deleteByPrimaryKey(categoryNumber);
    }

    @Override
    public int insert(GoodsCategory record) {
        return goodsCategoryMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsCategory record) {
        return goodsCategoryMapper.insertSelective(record);
    }

    @Override
    public List<GoodsCategory> selectByExample(GoodsCategoryExample example) {
        return goodsCategoryMapper.selectByExample(example);
    }

    @Override
    public GoodsCategory selectByPrimaryKey(Integer categoryNumber) {
        return goodsCategoryMapper.selectByPrimaryKey(categoryNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsCategory record) {
        return goodsCategoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsCategory record) {
        return goodsCategoryMapper.updateByPrimaryKey(record);
    }
}
