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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PurchaseOrderReviewController {

    @Resource
    private PurchaseOrderInfoService purchaseOrderInfoService;
    @Resource
    private SupplierInfoService supplierInfoService;
    @Resource
    private EmployeeUserService employeeUserService;
    @Resource
    private FourthLevelAdministrativeDivisionService fourthLevelAdministrativeDivisionService;
    @Resource
    private WarehouseInfoService warehouseInfoService;
    @Resource
    private PurchaseDetailsInfoService purchaseDetailsInfoService;



    @GetMapping("/purchaseOrderReviews")
    public String getPurchaseOrders(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                                    @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                                    ModelMap map) {
        PurchaseOrderInfoExample purchaseOrderInfoExample = new PurchaseOrderInfoExample();
        purchaseOrderInfoExample.setOrderByClause("purchase_order_number desc");
        PageHelper.startPage(pageNum, pageSize);
        List<PurchaseOrderInfo> purchaseOrderInfos = purchaseOrderInfoService.selectByExample(purchaseOrderInfoExample);
        PageInfo<PurchaseOrderInfo> purchaseOrderInfoPageInfo = new PageInfo<>(purchaseOrderInfos, 5);
        map.put("pageInfo",purchaseOrderInfoPageInfo);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        Map<Long, String> employeeCodes = new HashMap<>();
        Map<Long, String> orders = new HashMap<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            employeeCodes.put(employeeUsers.get(i).getEmployeeCode(),employeeUsers.get(i).getUsername());
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            if ("ROLE_ORDERER".equals(employeeUsers.get(i).getRoles().get(0).getName())){
                orders.put(employeeUsers.get(i).getEmployeeCode(),employeeUsers.get(i).getUsername());
            }
        }
        map.put("orders",orders);
        map.put("employeeCodes",employeeCodes);

        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        Map<Integer, String> supplierIds = new HashMap<>();
        for (int i = 0; i < supplierInfos.size(); i++) {
            supplierIds.put(supplierInfos.get(i).getSupplierId(), supplierInfos.get(i).getSupplierName());
        }
        map.put("supplierIds",supplierIds);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        Map<Long, String> warehouseCodes = new HashMap<>();
        for (int i = 0; i < warehouseInfos.size(); i++) {
            warehouseCodes.put(warehouseInfos.get(i).getWarehouseCode(),warehouseInfos.get(i).getWarehouseName());
        }
        map.put("warehouseCodes",warehouseCodes);
        return "purchase/PurchaseOrderReviewList";
    }

    @GetMapping("/purchaseOrderReviewTrashs/purchaseOrderReview")
    public String getPurchaseOrderReviewTrash(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                                              @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                                              ModelMap map) {
        PurchaseOrderInfoExample purchaseOrderInfoExample = new PurchaseOrderInfoExample();
        purchaseOrderInfoExample.setOrderByClause("purchase_order_number desc");
        List<PurchaseOrderInfo> purchaseOrderInfos = purchaseOrderInfoService.selectByExample(purchaseOrderInfoExample);
        PageHelper.startPage(pageNum, pageSize);
        List<PurchaseOrderInfo> purchaseOrderInfos1 = new ArrayList<>();
        for (int i = 0; i < purchaseOrderInfos.size(); i++) {
            if ("01".equals(purchaseOrderInfos.get(i).getPurchaseOrderFinishedCondition())) {
                purchaseOrderInfos1.add(purchaseOrderInfos.get(i));
            }
        }
        PageInfo<PurchaseOrderInfo> purchaseOrderInfoPageInfo = new PageInfo<>(purchaseOrderInfos1, 5);
        map.put("pageInfo",purchaseOrderInfoPageInfo);

        List<EmployeeUser> employeeUsers = employeeUserService.selectAll();
        Map<Long, String> employeeCodes = new HashMap<>();
        Map<Long, String> orders = new HashMap<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            employeeCodes.put(employeeUsers.get(i).getEmployeeCode(),employeeUsers.get(i).getUsername());
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            if ("ROLE_ORDERER".equals(employeeUsers.get(i).getRoles().get(0).getName())){
                orders.put(employeeUsers.get(i).getEmployeeCode(),employeeUsers.get(i).getUsername());
            }
        }
        map.put("orders",orders);
        map.put("employeeCodes",employeeCodes);

        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        Map<Integer, String> supplierIds = new HashMap<>();
        for (int i = 0; i < supplierInfos.size(); i++) {
            supplierIds.put(supplierInfos.get(i).getSupplierId(), supplierInfos.get(i).getSupplierName());
        }
        map.put("supplierIds",supplierIds);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        Map<Long, String> warehouseCodes = new HashMap<>();
        for (int i = 0; i < warehouseInfos.size(); i++) {
            warehouseCodes.put(warehouseInfos.get(i).getWarehouseCode(),warehouseInfos.get(i).getWarehouseName());
        }
        map.put("warehouseCodes",warehouseCodes);

        return "purchase/purchaseOrderReviewTrash";
    }



    @GetMapping("/purchaseOrderReview/{id}")
    public String toEditPage(@PathVariable("id") Long id, Model model) {
        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        model.addAttribute("supplierInfos", supplierInfos);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        List<EmployeeUser> employeeUsers2 = new ArrayList<>();
        List<EmployeeUser> employeeUsers3 = new ArrayList<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            String name = employeeUsers.get(i).getRoles().get(0).getName();
            if ("ROLE_PURCHASER".equals(name)) {
                employeeUsers2.add(employeeUsers.get(i));
            }
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            String name = employeeUsers.get(i).getRoles().get(0).getName();
            if ("ROLE_ORDERER".equals(name)) {
                employeeUsers3.add(employeeUsers.get(i));
            }
        }
        model.addAttribute("employeeUsersOfPurchase", employeeUsers2);
        model.addAttribute("employeeUsersOfOrder", employeeUsers3);
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("fourthLevel",fourthLevelAdministrativeDivisions);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        model.addAttribute("warehouseInfos",warehouseInfos);

        PurchaseOrderInfo purchaseOrderInfo = purchaseOrderInfoService.selectByPrimaryKey(id);
        model.addAttribute("purchaseOrder", purchaseOrderInfo);

        PurchaseDetailsInfoExample purchaseDetailsInfoExample = new PurchaseDetailsInfoExample();
        List<PurchaseDetailsInfo> purchaseDetailsInfos = purchaseDetailsInfoService.selectByExample(purchaseDetailsInfoExample);
        List<PurchaseDetailsInfo> purchaseDetailsInfos2 = new ArrayList<>();
        for (int i = 0; i < purchaseDetailsInfos.size(); i++) {
            if (id.equals(purchaseDetailsInfos.get(i).getPurchaseOrderNumber())) {
                purchaseDetailsInfos2.add(purchaseDetailsInfos.get(i));
            }
        }
        model.addAttribute("purchaseDetailsInfos",purchaseDetailsInfos2);
        return "purchase/PurchaseOrderReviewAdd";
    }

    @PutMapping("/purchaseOrderReview")
    public String editPurchaseOrderReview(PurchaseOrderInfo purchaseOrderInfo) {
        if (!StringUtils.isEmpty(purchaseOrderInfo.getOrderer())) {
            purchaseOrderInfo.setPurchaseOrderFinishedCondition("02");
            purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);
        } else {
            purchaseOrderInfoService.update(purchaseOrderInfo.getPurchaseOrderNumber(),null,"00");
        }

        return "redirect:/purchaseOrderReviews";
    }

    @DeleteMapping("/purchaseOrderReview/{id}")
    public String deletePurchaseOrderReview(@PathVariable("id") Long id) {
        PurchaseOrderInfo purchaseOrderInfo = purchaseOrderInfoService.selectByPrimaryKey(id);
        purchaseOrderInfo.setPurchaseOrderFinishedCondition("01");
        purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);
        return "redirect:/purchaseOrderReviews";
    }

    @PostMapping("/purchaseOrderReview/{id}")
    public String restorePurchaseOrderReview(@PathVariable("id") Long id) {
        PurchaseOrderInfo purchaseOrderInfo = purchaseOrderInfoService.selectByPrimaryKey(id);
        if (!StringUtils.isEmpty(purchaseOrderInfo.getOrderer())){
            purchaseOrderInfo.setPurchaseOrderFinishedCondition("00");
            purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);
        } else {
            purchaseOrderInfo.setPurchaseOrderFinishedCondition("02");
            purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);
        }

        return "redirect:/purchaseOrderReviews";
    }


}
