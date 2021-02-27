package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author WangShun
 */
@Controller
public class EmployeeUserController {
    @Resource
    private EmployeeUserService employeeUserService;
    @Resource
    private ShopInfoService shopInfoService;
    @Resource
    private RoleService roleService;
    @Resource
    private UserRoleService userRoleService;
    @Resource
    private FirstLevelAdministrativeDivisionService firstLevelAdministrativeDivisionService;
    @Resource
    private SecondLevelAdministrativeDivisionService secondLevelAdministrativeDivisionService;
    @Resource
    private ThirdLevelAdministrativeDivisionService thirdLevelAdministrativeDivisionService;
    @Resource
    private FourthLevelAdministrativeDivisionService fourthLevelAdministrativeDivisionService;

    @GetMapping("/employees")
    public String list(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                       @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                       @RequestParam(value = "employeeShopId", required = false, defaultValue = "") Long employeeShopId,
                       ModelMap map) {
        EmployeeUserExample employeeUserExample = new EmployeeUserExample();
        employeeUserExample.setOrderByClause("id desc");
        EmployeeUserExample.Criteria criteria = employeeUserExample.createCriteria();
        if (!StringUtils.isEmpty(employeeShopId)) {
            criteria.andEmployeeShopIdEqualTo(employeeShopId);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(employeeUserExample);
        PageInfo<EmployeeUser> pageEmployeeUsersInfo = new PageInfo<>(employeeUsers, 5);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        List<Role> roles = roleService.selectByExample(null);
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions = fourthLevelAdministrativeDivisionService.selectByExample(null);
        map.put("shopInfos", shopInfos);
        map.put("pageInfo", pageEmployeeUsersInfo);
        map.put("roles", roles);
        map.put("fourthLevel", fourthLevelAdministrativeDivisions);
        map.put("employeeShopId", employeeShopId);
        //        Result.ok().data(map);
        return "employee/list";
    }


    @GetMapping("/employee")
    public String toAddEmployee(ModelMap modelMap) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions = fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.put("fourthLevel", fourthLevelAdministrativeDivisions);
        List<Role> roles = roleService.selectByExample(null);
        modelMap.addAttribute("roles",roles);
        System.out.println(roles+",");
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        modelMap.addAttribute("shopInfos", shopInfos);
        return "employee/employeeAdd";
    }

    @PostMapping("/employee")
    public String addShop(EmployeeUser employeeUser) {
        System.out.println(employeeUser);
        System.out.println(",,"+employeeUser.getRoles());
        employeeUserService.insert(employeeUser);
        List<Role> roles = employeeUser.getRoles();
        Integer roleId = roles.get(0).getId();
        Integer userId = employeeUser.getId();
        UserRoleKey userRoleKey = new UserRoleKey();
        userRoleKey.setRoleId(roleId);
        userRoleKey.setUserId(userId);
        userRoleService.insert(userRoleKey);
        return "redirect:/employees";
    }

    @GetMapping("/employee/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions = fourthLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("fourthLevel", fourthLevelAdministrativeDivisions);
        List<Role> roles = roleService.selectByExample(null);
        model.addAttribute("roles",roles);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        model.addAttribute("shopInfos", shopInfos);
        EmployeeUser employeeUser = employeeUserService.selectById(id);
        model.addAttribute("employeeUser",employeeUser);
        UserRoleKey userRoleKey = userRoleService.selectByUserId(employeeUser.getId());
        System.out.println(employeeUser+",,,"+userRoleKey);
        model.addAttribute("userRoleKey",userRoleKey);
        return "employee/employeeAdd";
    }

    @PutMapping("/employee")
    public String editShop(EmployeeUser employeeUser) {
        employeeUserService.updateByPrimaryKeySelective(employeeUser);
        List<Role> roles = employeeUser.getRoles();
        Integer roleId = roles.get(0).getId();
        Integer userId = employeeUser.getId();
        UserRoleKey userRoleKey = new UserRoleKey();
        userRoleKey.setRoleId(roleId);
        userRoleKey.setUserId(userId);
        userRoleService.updateByPrimaryKeySelective(userRoleKey);
        return "redirect:/employees";
    }

    @DeleteMapping("/employee/{id}")
        public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeUserService.deleteByPrimaryKey(id);
        UserRoleKey userRoleKey = new UserRoleKey();
        userRoleKey.setUserId(id);
        userRoleService.deleteByPrimaryKey(userRoleKey);
        return "redirect:/employees";
    }

}
