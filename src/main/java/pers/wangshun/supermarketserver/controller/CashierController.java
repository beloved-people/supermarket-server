package pers.wangshun.supermarketserver.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import pers.wangshun.supermarketserver.model.EmployeeUser;
import pers.wangshun.supermarketserver.model.ExpensesRecord;
import pers.wangshun.supermarketserver.service.EmployeeUserService;
import pers.wangshun.supermarketserver.service.ExpensesRecordService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @author WangShun
 */
@Controller
public class CashierController {
    @Resource
    private EmployeeUserService employeeUserService;
    @Resource
    private ExpensesRecordService expensesRecordService;

    @GetMapping("/toCashLogin")
    public String toCashLogin(@RequestParam("employeeCode") Long employeeCode,
                              @RequestParam("password") String password,
                              HttpServletRequest request,
                              ModelMap modelMap) {
        EmployeeUser employeeUser = employeeUserService.selectByEmployeeCodeAndPassword(employeeCode, password);
        if (employeeUser != null) {
            request.getSession().setAttribute("CASHIER", employeeUser);
            return "redirect:/cashPage.html";
        } else {
            modelMap.put("message", "该账户不存在");
            return "redirect:/toCash";
        }

    }

    @GetMapping("/toCash")
    public String toCash() {
        return "/salespersonLogin";
    }

    @PostMapping("/cash")
    public String addExpensesRecord(@RequestBody Map<String,Object> expensesRecords,
                                    HttpServletRequest request) {
        Long employeeCode = Long.parseLong((String) expensesRecords.get("employeeCode"));
        String password = (String) expensesRecords.get("password");
        EmployeeUser employeeUser = employeeUserService.selectByEmployeeCodeAndPassword(employeeCode, password);
        request.getSession().setAttribute("CASHIER", employeeUser);
        List<ExpensesRecord> expensesRecords1 = (List<ExpensesRecord>) expensesRecords.get("expensesRecords");
        for (int i = 0; i < expensesRecords1.size(); i++) {
            JSONObject jsonObject = JSONObject.fromObject(expensesRecords1.get(i));
            ExpensesRecord expensesRecord = (ExpensesRecord)JSONObject.toBean(jsonObject, ExpensesRecord.class);
            expensesRecordService.insert(expensesRecord);
        }

        return "redirect:/toCashLogin";
    }


    @GetMapping("/cashLogout")
    public String cashLogout(HttpSession session) {
        session.invalidate();
        return "/salespersonLogin";
    }


}
