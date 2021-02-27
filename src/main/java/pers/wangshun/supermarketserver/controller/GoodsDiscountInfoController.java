package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.GoodsDiscountInfo;
import pers.wangshun.supermarketserver.model.GoodsDiscountInfoExample;
import pers.wangshun.supermarketserver.model.GoodsInfo;
import pers.wangshun.supermarketserver.service.GoodsDiscountInfoService;
import pers.wangshun.supermarketserver.service.GoodsInfoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class GoodsDiscountInfoController {
    @Resource
    private GoodsDiscountInfoService goodsDiscountInfoService;
    @Resource
    private GoodsInfoService goodsInfoService;

    @GetMapping("/goodsDiscountInfos")
    public String getGoodsDiscountInfos(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                        @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                                        ModelMap map) {
        GoodsDiscountInfoExample goodsDiscountInfoExample = new GoodsDiscountInfoExample();
        goodsDiscountInfoExample.setOrderByClause("goods_bar_code desc");

        PageHelper.startPage(pageNum, pageSize);
        List<GoodsDiscountInfo> goodsDiscountInfos = goodsDiscountInfoService.selectByExample(goodsDiscountInfoExample);
        PageInfo<GoodsDiscountInfo> goodsDiscountInfoPageInfo = new PageInfo<>(goodsDiscountInfos, 5);
        map.put("pageInfo", goodsDiscountInfoPageInfo);
        return "good/goodsDiscountInfoList";
    }

    @GetMapping("/goodsDiscountInfo")
    public String toAddGoodsDiscountInfo(ModelMap modelMap) {
        List<GoodsInfo> goodsInfos = goodsInfoService.selectByExample(null);
        List<GoodsDiscountInfo> goodsDiscountInfos = goodsDiscountInfoService.selectByExample(null);
        List<GoodsInfo> goodsInfos1 = new ArrayList<>();
        List<Long> codeList = new ArrayList<>();
        for (int i = 0; i < goodsDiscountInfos.size(); i++) {
            codeList.add(goodsDiscountInfos.get(i).getGoodsBarCode());
        }
        for (int i = 0; i < goodsInfos.size(); i++) {
            Long goodsBarCode = goodsInfos.get(i).getGoodsBarCode();
            if (!codeList.contains(goodsBarCode)) {
                goodsInfos1.add(goodsInfos.get(i));
            }
        }
        modelMap.addAttribute("goods", goodsInfos1);
        return "good/goodsDiscountInfoAdd";
    }

    @GetMapping("/goods")
    @ResponseBody
    public GoodsInfo getGoods(@RequestParam("goodsBarCode") Long goodsBarCode) {
        return goodsInfoService.selectByPrimaryKey(goodsBarCode);
    }

    @PostMapping("/goodsDiscountInfo")
    public String addGoodsDiscountInfo(GoodsDiscountInfo goodsDiscountInfo) {
        GoodsInfo goodsInfo = goodsInfoService.selectByPrimaryKey(goodsDiscountInfo.getGoodsBarCode());
        String goodsName = goodsInfo.getGoodsName();
        goodsDiscountInfo.setGoodsName(goodsName);
        goodsDiscountInfoService.insert(goodsDiscountInfo);
        return "redirect:/goodsDiscountInfos";
    }

    @GetMapping("/goodsDiscountInfo/{id}")
    public String toEditPage(@PathVariable("id") Long goodsBarCode, Model model) {
        List<GoodsInfo> goodsInfos = goodsInfoService.selectByExample(null);
        model.addAttribute("goods", goodsInfos);
        GoodsDiscountInfo goodsDiscountInfo = goodsDiscountInfoService.selectByPrimaryKey(goodsBarCode);
        model.addAttribute("goodsDiscountInfo", goodsDiscountInfo);
        return "good/goodsDiscountInfoAdd";
    }

    @PutMapping("/goodsDiscountInfo")
    public String editGoodsDiscountInfo(GoodsDiscountInfo goodsDiscountInfo) {
        goodsDiscountInfoService.updateByPrimaryKeySelective(goodsDiscountInfo);
        return "redirect:/goodsDiscountInfos";
    }

    @DeleteMapping("/goodsDiscountInfo/{id}")
    public String deleteGoodsDiscountInfos(@PathVariable("id") Long goodsBarCode) {
        goodsDiscountInfoService.deleteByPrimaryKey(goodsBarCode);
        return "redirect:/goodsDiscountInfos";
    }


}
