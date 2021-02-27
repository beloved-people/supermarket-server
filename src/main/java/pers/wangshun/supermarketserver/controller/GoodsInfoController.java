package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.GoodsCategoryService;
import pers.wangshun.supermarketserver.service.GoodsInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class GoodsInfoController {
    @Resource
    private GoodsInfoService goodsInfoService;
    @Resource
    private GoodsCategoryService goodsCategoryService;

    @GetMapping("/goodsInfos")
    public String getSuppliers(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                               @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                               ModelMap map) {
        GoodsInfoExample goodsInfoExample = new GoodsInfoExample();
        goodsInfoExample.setOrderByClause("goods_bar_code desc");

        PageHelper.startPage(pageNum, pageSize);
        List<GoodsInfo> goodsInfos = goodsInfoService.selectByExample(goodsInfoExample);
        PageInfo<GoodsInfo> goodsInfoPageInfo = new PageInfo<>(goodsInfos, 5);
        map.put("pageInfo",goodsInfoPageInfo);
        List<GoodsInfo> goodsInfos1 = goodsInfoService.selectByExample(null);
        map.put("goodsInfos1",goodsInfos1);
        List<GoodsCategory> goodsCategories = goodsCategoryService.selectByExample(null);
        map.put("goodsCategories1",goodsCategories);
        return "good/goodList";
    }

    @GetMapping("/goodsInfo")
    public String toAddSupplier(ModelMap modelMap) {
        List<GoodsCategory> goodsCategories = goodsCategoryService.selectByExample(null);
        modelMap.put("goodsCategories",goodsCategories);
        return "good/goodAdd";
    }

    @PostMapping("/goodsInfo")
    public String addGoodsInfo(GoodsInfo goodsInfo) {
        goodsInfoService.insert(goodsInfo);
        return "redirect:/goodsInfos";
    }

    @GetMapping("/goodsInfo/{id}")
    public String toEditPage(@PathVariable("id") Long goodsBarCode, Model model) {
        List<GoodsCategory> goodsCategories = goodsCategoryService.selectByExample(null);
        model.addAttribute("goodsCategories",goodsCategories);
        GoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(goodsBarCode);
        model.addAttribute("goodsInfo", goodsInfo);
        return "good/goodAdd";
    }

    @PutMapping("/goodsInfo")
    public String editSupplier(GoodsInfo goodsInfo) {
        goodsInfoService.updateByPrimaryKeySelective(goodsInfo);
        return "redirect:/goodsInfos";
    }

    @DeleteMapping("/goodsInfo/{id}")
    public String deleteSupplier(@PathVariable("id") Long goodsBarCode) {
        goodsInfoService.deleteByPrimaryKey(goodsBarCode);
        return "redirect:/goodsInfos";
    }

}
