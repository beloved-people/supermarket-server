package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.wangshun.supermarketserver.model.WarehouseInfo;
import pers.wangshun.supermarketserver.model.WarehouseProductInfo;
import pers.wangshun.supermarketserver.model.WarehouseProductInfoExample;
import pers.wangshun.supermarketserver.service.WarehouseInfoService;
import pers.wangshun.supermarketserver.service.WarehouseProductInfoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class InventoryController {

    @Resource
    private WarehouseProductInfoService warehouseProductInfoService;
    @Resource
    private WarehouseInfoService warehouseInfoService;

    @GetMapping("/inventories")
    public String getInventories(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                                 @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                                 @RequestParam(value = "warehouseCode",required = false, defaultValue = "")Long warehouseCode,
                                 @RequestParam(value = "goodsBarCode",required = false, defaultValue = "")Long goodsBarCode,
                                 ModelMap map) {
        WarehouseProductInfoExample warehouseProductInfoExample = new WarehouseProductInfoExample();
        warehouseProductInfoExample.setOrderByClause("warehouse_code desc");
        WarehouseProductInfoExample.Criteria criteria = warehouseProductInfoExample.createCriteria();
        if (!StringUtils.isEmpty(warehouseCode)) {
            criteria.andWarehouseCodeEqualTo(warehouseCode);
        }
        if(!StringUtils.isEmpty(goodsBarCode)) {
            criteria.andGoodsBarCodeEqualTo(goodsBarCode);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<WarehouseProductInfo> warehouseProductInfos = warehouseProductInfoService.selectByExample(warehouseProductInfoExample);
        PageInfo<WarehouseProductInfo> pageInfo = new PageInfo<>(warehouseProductInfos, 5);
        map.addAttribute("pageInfo",pageInfo);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        map.addAttribute("warehouseInfos",warehouseInfos);
        List<WarehouseProductInfo> warehouseProductInfos1 = warehouseProductInfoService.selectByExample(null);
        List<Long> objects = new ArrayList<>();
        for (int i = 0; i < warehouseProductInfos1.size(); i++) {
            objects.add(warehouseProductInfos1.get(i).getGoodsBarCode());
        }
        map.addAttribute("goodsBarCodes",objects);
        map.addAttribute("warehouseCode",warehouseCode);
        map.addAttribute("goodsBarCode",goodsBarCode);
        return "inventory/inventoryList";
    }


}
