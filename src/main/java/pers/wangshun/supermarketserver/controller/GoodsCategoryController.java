package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.GoodsCategory;
import pers.wangshun.supermarketserver.model.GoodsCategoryExample;
import pers.wangshun.supermarketserver.service.GoodsCategoryService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class GoodsCategoryController {

    @Resource
    private GoodsCategoryService goodsCategoryService;

    @GetMapping("/goodsCategories")
    public String getGoodsCategories(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                                     @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                                     ModelMap map) {
        GoodsCategoryExample goodsCategoryExample = new GoodsCategoryExample();
        goodsCategoryExample.setOrderByClause("category_number desc");

        PageHelper.startPage(pageNum, pageSize);
        List<GoodsCategory> goodsCategories = goodsCategoryService.selectByExample(goodsCategoryExample);
        PageInfo<GoodsCategory> goodsCategoryPageInfo = new PageInfo<>(goodsCategories, 5);
        map.put("pageInfo",goodsCategoryPageInfo);
        return "good/goodsCategoryList";
    }

    @GetMapping("/goodsCategory")
    public String toAddGoodsCategory(ModelMap modelMap) {
        List<GoodsCategory> goodsCategories = goodsCategoryService.selectByExample(null);
        modelMap.put("goodsCategories",goodsCategories);
        return "good/goodsCategoryAdd";
    }

    @PostMapping("/goodsCategory")
    public String addGoodsCategory(GoodsCategory goodsCategory) {
        goodsCategoryService.insert(goodsCategory);
        return "redirect:/goodsCategories";
    }

    @GetMapping("/goodsCategory/{id}")
    public String toEditPage(@PathVariable("id") Integer categoryNumber, Model model) {
        GoodsCategory goodsCategory = goodsCategoryService.selectByPrimaryKey(categoryNumber);
        model.addAttribute("goodsCategory", goodsCategory);
        return "good/goodsCategoryAdd";
    }

    @PutMapping("/goodsCategory")
    public String editGoodsCategory(GoodsCategory goodsCategory) {
        goodsCategoryService.updateByPrimaryKeySelective(goodsCategory);
        return "redirect:/goodsCategories";
    }

    @DeleteMapping("/goodsCategory/{id}")
    public String deleteGoodsCategory(@PathVariable("id") Integer categoryNumber) {
        goodsCategoryService.deleteByPrimaryKey(categoryNumber);
        return "redirect:/goodsCategories";
    }




}
