package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.SecondLevelAdministrativeDivisionService;
import pers.wangshun.supermarketserver.service.SupplierInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class SupplierInfoController {

    @Resource
    private SupplierInfoService supplierInfoService;
    @Resource
    private SecondLevelAdministrativeDivisionService secondLevelAdministrativeDivisionService;

    @GetMapping("/suppliers")
    public String getSuppliers(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                               @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                               ModelMap map) {
        SupplierInfoExample supplierInfoExample = new SupplierInfoExample();
        supplierInfoExample.setOrderByClause("supplier_id desc");
        PageHelper.startPage(pageNum, pageSize);
        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(supplierInfoExample);
        PageInfo<SupplierInfo> supplierInfoPageInfo = new PageInfo<>(supplierInfos, 5);
        map.put("pageInfo",supplierInfoPageInfo);
        return "supplier/supplierList";
    }

    @GetMapping("/supplier")
    public String toAddSupplier(ModelMap modelMap) {
        List<SecondLevelAdministrativeDivision> secondLevelAdministrativeDivisions
                = secondLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.addAttribute("secondLevel",secondLevelAdministrativeDivisions);
        return "supplier/supplierAdd";
    }

    @PostMapping("/supplier")
    public String addSupplier(SupplierInfo supplierInfo) {
        supplierInfoService.insert(supplierInfo);
        return "redirect:/suppliers";
    }

    @GetMapping("/supplier/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        List<SecondLevelAdministrativeDivision> secondLevelAdministrativeDivisions
                = secondLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("secondLevel",secondLevelAdministrativeDivisions);
        SupplierInfo supplierInfo = supplierInfoService.selectByPrimaryKey(id);
        model.addAttribute("supplier", supplierInfo);
        return "supplier/supplierAdd";
    }

    @PutMapping("/supplier")
    public String editSupplier(SupplierInfo supplierInfo) {
        supplierInfoService.updateByPrimaryKeySelective(supplierInfo);
        return "redirect:/suppliers";
    }

    @DeleteMapping("/supplier/{id}")
    public String deleteSupplier(@PathVariable("id") Integer id) {
        supplierInfoService.deleteByPrimaryKey(id);
        return "redirect:/suppliers";
    }


}
