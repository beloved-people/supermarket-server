package pers.wangshun.supermarketserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.wangshun.supermarketserver.model.EmployeeUser;
import pers.wangshun.supermarketserver.model.VipUser;
import pers.wangshun.supermarketserver.service.EmployeeUserService;
import pers.wangshun.supermarketserver.service.VipUserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author WangShun
 */
@Controller
public class MainController {
    @Resource
    private EmployeeUserService employeeUserService;
    @Resource
    private VipUserService vipUserService;


    @GetMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @GetMapping("/toLogin2")
    public String toLogin2(ModelMap modelMap) {
        modelMap.put("message", "Аккаунт не существует!");
        return "login";
    }

    @GetMapping("/toVipLogin")
    public String toVipLogin() {
        return "vipLogin";
    }

    @GetMapping("/toVipLogin2")
    public String toVipLogin2(ModelMap modelMap) {
        modelMap.put("message", "Аккаунт не существует!");
        return "vipLogin";
    }

    @GetMapping("/toSalespersonLogin")
    public String totoSalespersonLogin() {
        return "salespersonLogin";
    }

    @GetMapping("/toModifyPassword")
    public String toModifyPassword() {
        return "passwordModify";
    }

    @GetMapping("/toModifyPassword2")
    public String toModifyPassword2(ModelMap modelMap) {
        modelMap.addAttribute("message","Два пароля несовместимы!");
        return "passwordModify";
    }

    @GetMapping("/toModifyVipPassword")
    public String toModifyVipPassword() {
        return "vipPasswordModify";
    }

    @GetMapping("/toModifyVipPassword2")
    public String toModifyVipPassword2(ModelMap modelMap) {
        modelMap.addAttribute("message","Два пароля несовместимы!");
        return "vipPasswordModify";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/toLogin";
    }

    @GetMapping(value = "/user/login")
    public String login(@RequestParam("employeeCode") Long employeeCode,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpServletRequest request) {
        EmployeeUser employeeUser = employeeUserService.login(employeeCode, username, password);
        System.out.println(employeeUser);
        if (employeeUser != null) {
            request.getSession().setAttribute("EMPLOYEE_USER", employeeUser);
            return "redirect:/main.html";
        } else {
            return "redirect:/toLogin2";
        }

    }

    @GetMapping(value = "/vip/login")
    public String vipLogin(@RequestParam("vipNumber") String vipNumber,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                           ModelMap modelMap,
                        HttpServletRequest request) {
        VipUser vipUser = vipUserService.selectByVipUser(vipNumber,username,password);

        if (vipUser != null) {
            request.getSession().setAttribute("VIP", vipUser);
            return "redirect:/vipMain.html";
        } else {
            return "redirect:/toVipLogin2";
        }

    }


    @GetMapping(value = "/user/password")
    public String modifyUserPassword(@RequestParam("employeeCode") Long employeeCode,
                                     @RequestParam("password") String password,
                                     @RequestParam("password2") String password2) {
        if (!password.equals(password2)){
            return "redirect:/toModifyPassword2";
        }
        EmployeeUser employeeUser = employeeUserService.selectByEmployeeCode(employeeCode);
        if (employeeUser!=null) {
            employeeUser.setId(employeeUser.getId());
            employeeUser.setPassword(password2);
            employeeUserService.updateByPrimaryKeySelective(employeeUser);
            return "redirect:/toLogin";
        }
        return "redirect:/toModifyPassword2";
    }

    @GetMapping(value = "/vip/password")
    public String modifyVipPassword(@RequestParam("vipCardCode") String vipCardCode,
                                    @RequestParam("username") String username,
                                    @RequestParam("password") String password,
                                    @RequestParam("password2") String password2) {
        if (!password.equals(password2)){
            return "redirect:/toModifyVipPassword2";
        }

        VipUser vipUser = vipUserService.selectByVipCardCode(vipCardCode);
        if (vipUser!=null){
            vipUser.setPassword(password);
            vipUserService.updateByPrimaryKeySelective(vipUser);
            return "redirect:/toVipLogin";
        }
        return "redirect:/toModifyVipPassword2";

    }


}
