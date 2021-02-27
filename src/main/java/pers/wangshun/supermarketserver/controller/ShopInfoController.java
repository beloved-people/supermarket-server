package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.EmployeeUser;
import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.ShopInfo;
import pers.wangshun.supermarketserver.model.ShopInfoExample;
import pers.wangshun.supermarketserver.service.EmployeeUserService;
import pers.wangshun.supermarketserver.service.FourthLevelAdministrativeDivisionService;
import pers.wangshun.supermarketserver.service.ShopInfoService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class ShopInfoController {

    @Resource
    private ShopInfoService shopInfoService;
    @Resource
    private EmployeeUserService employeeUserService;
    @Resource
    private FourthLevelAdministrativeDivisionService fourthLevelAdministrativeDivisionService;

    @GetMapping("/shops")
    public String getShops(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                           @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                           ModelMap map) {
        ShopInfoExample shopInfoExample = new ShopInfoExample();
        shopInfoExample.setOrderByClause("shop_id desc");
        PageHelper.startPage(pageNum, pageSize);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(shopInfoExample);
        PageInfo<ShopInfo> shopInfoPageInfo = new PageInfo<>(shopInfos, 5);
        for (int i = 0; i < shopInfos.size(); i++) {
            Long shopId = shopInfos.get(i).getShopId();
            List<EmployeeUser> employeeUsers = employeeUserService.selectByEmployeeShopId(shopId);
            shopInfos.get(i).setWorkersNumber(employeeUsers.size());
        }
        map.put("pageInfo",shopInfoPageInfo);
        return "shop/shopList";
    }

    @GetMapping("/shop")
    public String toAddShop(ModelMap modelMap) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.put("fourthLevel",fourthLevelAdministrativeDivisions);
        return "shop/shopAdd";
    }

    @PostMapping("/shop")
    public String addShop(ShopInfo shopInfo) {
        List<EmployeeUser> employeeUsers = employeeUserService.selectByEmployeeShopId(shopInfo.getShopId());
        shopInfo.setWorkersNumber(employeeUsers.size());
        shopInfoService.insert(shopInfo);
        return "redirect:/shops";
    }

    @GetMapping("/shop/{id}")
    public String toEditPage(@PathVariable("id") Long id, Model model) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("fourthLevel",fourthLevelAdministrativeDivisions);
        ShopInfo shopInfo = shopInfoService.selectByPrimaryKey(id);
        model.addAttribute("shop", shopInfo);
        return "shop/shopAdd";
    }

    @PutMapping("/shop")
    public String editShop(ShopInfo shopInfo) {
        List<EmployeeUser> employeeUsers = employeeUserService.selectByEmployeeShopId(shopInfo.getShopId());
        shopInfo.setWorkersNumber(employeeUsers.size());
        shopInfoService.updateByPrimaryKeySelective(shopInfo);
        return "redirect:/shops";
    }

    @DeleteMapping("/shop/{id}")
    public String deleteShop(@PathVariable("id") Long id) {
        shopInfoService.deleteByPrimaryKey(id);
        return "redirect:/shops";
    }
}
