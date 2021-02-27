package pers.wangshun.supermarketserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import pers.wangshun.supermarketserver.model.FourthLevelAdministrativeDivision;
import pers.wangshun.supermarketserver.model.ShopInfo;
import pers.wangshun.supermarketserver.model.VipUser;
import pers.wangshun.supermarketserver.service.FourthLevelAdministrativeDivisionService;
import pers.wangshun.supermarketserver.service.ShopInfoService;
import pers.wangshun.supermarketserver.service.VipUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VipController {

    @Resource
    private VipUserService vipUserService;
    @Resource
    private FourthLevelAdministrativeDivisionService fourthLevelAdministrativeDivisionService;
    @Resource
    private ShopInfoService shopInfoService;

    @GetMapping("/toChangeVipInfo")
    public String toEditPage(HttpSession session, ModelMap modelMap) {
        VipUser vip = (VipUser)session.getAttribute("VIP");
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions = fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.addAttribute("fourthLevel",fourthLevelAdministrativeDivisions);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        modelMap.addAttribute("shopInfos",shopInfos);
        return "vip/vipInfoChange";
    }

    @PutMapping("/changeVipInfo")
    public String changeVipInfo(HttpSession session, ModelMap modelMap, VipUser vipUser) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions = fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.addAttribute("fourthLevel",fourthLevelAdministrativeDivisions);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        modelMap.addAttribute("shopInfos",shopInfos);
        VipUser vip = (VipUser)session.getAttribute("VIP");
        vip.setId(vipUser.getId());
        vip.setUsername(vipUser.getUsername());
        vip.setPassword(vipUser.getPassword());
        vip.setVipGender(vipUser.getVipGender());
        vip.setVipNumber(vipUser.getVipNumber());
        vip.setVipBirthday(vipUser.getVipBirthday());
        vip.setVipPlace(vipUser.getVipPlace());
        vip.setVipShopId(vipUser.getVipShopId());
        vip.setVipCardCode(vipUser.getVipCardCode());
        vip.setVipIntegration(vipUser.getVipIntegration());
        vip.setVipRegisterDate(vipUser.getVipRegisterDate());
        vip.setEnabled(vipUser.getEnabled());
        vip.setLocked(vipUser.getLocked());
        vipUserService.updateByPrimaryKeySelective(vipUser);
        return "vip/vipInfoChange";
    }
}
