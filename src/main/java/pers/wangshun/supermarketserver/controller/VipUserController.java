package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.FourthLevelAdministrativeDivisionService;
import pers.wangshun.supermarketserver.service.ShopInfoService;
import pers.wangshun.supermarketserver.service.VipUserService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class VipUserController {
    @Resource
    private VipUserService vipUserService;
    @Resource
    private ShopInfoService shopInfoService;
    @Resource
    private FourthLevelAdministrativeDivisionService fourthLevelAdministrativeDivisionService;

    @GetMapping("/vipUsers")
    public String getVipUsers(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                           @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                           @RequestParam(value="vipShopId",required=false,defaultValue="")Long vipShopId,
                           ModelMap map) {
        VipUserExample vipUserExample = new VipUserExample();
        vipUserExample.setOrderByClause("id desc");
        VipUserExample.Criteria criteria = vipUserExample.createCriteria();
        if (!StringUtils.isEmpty(vipShopId)){
            criteria.andVipShopIdEqualTo(vipShopId);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<VipUser> vipUsers = vipUserService.selectByExample(vipUserExample);
        PageInfo<VipUser> vipUserPageInfo = new PageInfo<>(vipUsers, 5);
        map.put("pageInfo",vipUserPageInfo);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        map.put("shopInfos",shopInfos);
        map.put("vipShopId",vipShopId);
        return "vip/vipList";
    }

    @GetMapping("/vipUser")
    public String toAddVipUser(ModelMap modelMap) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.put("fourthLevel",fourthLevelAdministrativeDivisions);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        modelMap.put("shopInfos",shopInfos);
        return "vip/vipUserAdd";
    }

    @PostMapping("/vipUser")
    public String addVipUser(VipUser vipUser) {
        vipUserService.insertSelective(vipUser);
        return "redirect:/vipUsers";
    }

    @GetMapping("/vipUser/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("fourthLevel",fourthLevelAdministrativeDivisions);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        model.addAttribute("shopInfos",shopInfos);
        VipUser vipUser = vipUserService.selectByPrimaryKey(id);
        model.addAttribute("vipUser",vipUser);
        return "vip/vipUserAdd";
    }

    @PutMapping("/vipUser")
    public String editVipUser(VipUser vipUser) {
        vipUserService.updateByPrimaryKeySelective(vipUser);
        return "redirect:/vipUsers";
    }


    @DeleteMapping("/vipUser/{id}")
    public String deleteVipUser(@PathVariable("id") Integer id) {
        vipUserService.deleteByPrimaryKey(id);
        return "redirect:/vipUsers";
    }


}
