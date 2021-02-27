package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.FourthLevelAdministrativeDivisionService;
import pers.wangshun.supermarketserver.service.WarehouseInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class WarehouseInfoController {
    @Resource
    private WarehouseInfoService warehouseInfoService;
    @Resource
    private FourthLevelAdministrativeDivisionService fourthLevelAdministrativeDivisionService;


    @GetMapping("/warehouses")
    public String getWarehouses(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                                ModelMap map) {
        WarehouseInfoExample warehouseInfoExample = new WarehouseInfoExample();
        warehouseInfoExample.setOrderByClause("warehouse_code desc");
        PageHelper.startPage(pageNum, pageSize);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(warehouseInfoExample);
        PageInfo<WarehouseInfo> warehouseInfoPageInfo = new PageInfo<>(warehouseInfos, 5);
        map.put("pageInfo", warehouseInfoPageInfo);
        return "warehouse/warehouseList";
    }

    @GetMapping("/warehouse")
    public String toAddWarehouse(ModelMap modelMap) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.put("fourthLevel", fourthLevelAdministrativeDivisions);
        return "warehouse/warehouseAdd";
    }

    @PostMapping("/warehouse")
    public String addWarehouse(WarehouseInfo warehouseInfo) {
        warehouseInfoService.insert(warehouseInfo);
        return "redirect:/warehouses";
    }

    @GetMapping("/warehouse/{id}")
    public String toEditPage(@PathVariable("id") Long id, Model model) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("fourthLevel", fourthLevelAdministrativeDivisions);
        WarehouseInfo warehouseInfo = warehouseInfoService.selectByPrimaryKey(id);
        model.addAttribute("warehouse", warehouseInfo);
        return "warehouse/warehouseAdd";
    }

    @PutMapping("/warehouse")
    public String editWarehouse(WarehouseInfo warehouseInfo) {
        warehouseInfoService.updateByPrimaryKeySelective(warehouseInfo);
        return "redirect:/warehouses";
    }

    @DeleteMapping("/warehouse/{id}")
    public String deleteWarehouse(@PathVariable("id") Long id) {
        warehouseInfoService.deleteByPrimaryKey(id);
        return "redirect:/warehouses";
    }
}
