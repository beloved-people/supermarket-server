package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WangShun
 */
@Controller
public class PurchaseOrderController {

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



    @GetMapping("/purchaseOrderInfos")
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
        for (int i = 0; i < employeeUsers.size(); i++) {
            employeeCodes.put(employeeUsers.get(i).getEmployeeCode(),employeeUsers.get(i).getUsername());
        }
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
        return "purchase/purchaseOrderList";
    }



    @GetMapping("/purchaseOrderInfo")
    public String toAddPurchaseOrder(ModelMap modelMap) {
        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        modelMap.addAttribute("supplierInfos", supplierInfos);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        List<EmployeeUser> employeeUsers2 = new ArrayList<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            String name = employeeUsers.get(i).getRoles().get(0).getName();
            if ("ROLE_PURCHASER".equals(name)) {
                employeeUsers2.add(employeeUsers.get(i));
            }
        }
        modelMap.addAttribute("employeeUsersOfPurchase", employeeUsers2);
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions =
                fourthLevelAdministrativeDivisionService.selectByExample(null);
        modelMap.addAttribute("fourthLevel", fourthLevelAdministrativeDivisions);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        modelMap.addAttribute("warehouseInfos",warehouseInfos);
        return "purchase/purchaseOrderAdd";
    }

    @PostMapping("/purchaseOrderInfo")
    public String addPurchaseOrder(@RequestBody Map<String,Object> purchaseOrders) {
        PurchaseOrderInfo purchaseOrderInfo = new PurchaseOrderInfo();
        purchaseOrderInfo.setPurchaseOrderNumber(Long.parseLong(String.valueOf(purchaseOrders.get("purchaseOrderNumber"))));
        if (!"".equals(purchaseOrders.get("purchaseOrderSupplier"))) {
            purchaseOrderInfo.setPurchaseOrderSupplier(Integer.parseInt(String.valueOf(purchaseOrders.get("purchaseOrderSupplier"))));
        } else {
            purchaseOrderInfo.setPurchaseOrderSupplier(null);
        }
        if (!"".equals(purchaseOrders.get("shippingAddress"))) {
            purchaseOrderInfo.setShippingAddress(String.valueOf(purchaseOrders.get("shippingAddress")));
        } else {
            purchaseOrderInfo.setShippingAddress(null);
        }
        if (!"".equals(purchaseOrders.get("warehouse"))){
            purchaseOrderInfo.setWarehouse(Long.parseLong(String.valueOf(purchaseOrders.get("warehouse"))));
        } else {
            purchaseOrderInfo.setWarehouse(null);
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (!"".equals(purchaseOrders.get("purchaseOrderDate").toString()) || !"".equals(purchaseOrders.get("purchaseOrderArrivalDate").toString())) {
                purchaseOrderInfo.setPurchaseOrderDate(format.parse(purchaseOrders.get("purchaseOrderDate").toString()));
                purchaseOrderInfo.setPurchaseOrderArrivalDate(format.parse(purchaseOrders.get("purchaseOrderArrivalDate").toString()));
            } else {
                purchaseOrderInfo.setPurchaseOrderDate(null);
                purchaseOrderInfo.setPurchaseOrderArrivalDate(null);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        purchaseOrderInfo.setPurchaseOrderFinishedCondition(String.valueOf(purchaseOrders.get("purchaseOrderFinishedCondition")));
        purchaseOrderInfo.setPurchaseOrderRemarks(String.valueOf(purchaseOrders.get("purchaseOrderRemarks")));
        if (!"".equals(purchaseOrders.get("purchaser"))){
            purchaseOrderInfo.setPurchaser(Long.parseLong(String.valueOf(purchaseOrders.get("purchaser"))));
        } else {
            purchaseOrderInfo.setPurchaser(null);
        }
        purchaseOrderInfoService.insert(purchaseOrderInfo);

        List<PurchaseDetailsInfo> purchaseDetails = (List<PurchaseDetailsInfo>)purchaseOrders.get("purchaseDetails");
        for (Object obj: purchaseDetails){
            JSONObject jsonObject= JSONObject.fromObject(obj);
            PurchaseDetailsInfo purchaseDetailsInfo = (PurchaseDetailsInfo) JSONObject.toBean(jsonObject, PurchaseDetailsInfo.class);
            if (!purchaseDetails.isEmpty()){
                purchaseDetailsInfoService.insert(purchaseDetailsInfo);
            }
        }
        return "redirect:/purchaseOrderInfos";
    }

    @GetMapping("/purchaseOrderInfo/{id}")
    public String toEditPage(@PathVariable("id") Long id, Model model) {
        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        model.addAttribute("supplierInfos", supplierInfos);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        List<EmployeeUser> employeeUsers2 = new ArrayList<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            String name = employeeUsers.get(i).getRoles().get(0).getName();
            if ("ROLE_PURCHASER".equals(name)) {
                employeeUsers2.add(employeeUsers.get(i));
            }
        }
        model.addAttribute("employeeUsersOfPurchase", employeeUsers2);
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
        return "purchase/purchaseOrderAdd";
    }

    @PostMapping("/purchase/purchaseOrderInfo")
    public String editPurchaseOrder(@RequestBody Map<String,Object> purchaseOrders) {
        System.out.println(","+purchaseOrders);
        PurchaseOrderInfo purchaseOrderInfo = new PurchaseOrderInfo();
        purchaseOrderInfo.setPurchaseOrderNumber(Long.parseLong(String.valueOf(purchaseOrders.get("purchaseOrderNumber"))));
        if (!"".equals(purchaseOrders.get("purchaseOrderSupplier"))) {
            purchaseOrderInfo.setPurchaseOrderSupplier(Integer.parseInt(String.valueOf(purchaseOrders.get("purchaseOrderSupplier"))));
        } else {
            purchaseOrderInfo.setPurchaseOrderSupplier(null);
        }
        if (!"".equals(purchaseOrders.get("shippingAddress"))) {
            purchaseOrderInfo.setShippingAddress(String.valueOf(purchaseOrders.get("shippingAddress")));
        } else {
            purchaseOrderInfo.setShippingAddress(null);
        }
        if (!"".equals(purchaseOrders.get("warehouse"))){
            purchaseOrderInfo.setWarehouse(Long.parseLong(String.valueOf(purchaseOrders.get("warehouse"))));
        } else {
            purchaseOrderInfo.setWarehouse(null);
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (!"".equals(purchaseOrders.get("purchaseOrderDate").toString()) || !"".equals(purchaseOrders.get("purchaseOrderArrivalDate").toString())) {
                purchaseOrderInfo.setPurchaseOrderDate(format.parse(purchaseOrders.get("purchaseOrderDate").toString()));
                purchaseOrderInfo.setPurchaseOrderArrivalDate(format.parse(purchaseOrders.get("purchaseOrderArrivalDate").toString()));
            } else {
                purchaseOrderInfo.setPurchaseOrderDate(null);
                purchaseOrderInfo.setPurchaseOrderArrivalDate(null);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        purchaseOrderInfo.setPurchaseOrderFinishedCondition(String.valueOf(purchaseOrders.get("purchaseOrderFinishedCondition")));
        purchaseOrderInfo.setPurchaseOrderRemarks(String.valueOf(purchaseOrders.get("purchaseOrderRemarks")));
        if (!"".equals(purchaseOrders.get("purchaser"))){
            purchaseOrderInfo.setPurchaser(Long.parseLong(String.valueOf(purchaseOrders.get("purchaser"))));
        } else {
            purchaseOrderInfo.setPurchaser(null);
        }
        purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);

        List<PurchaseDetailsInfo> purchaseDetails = (List<PurchaseDetailsInfo>)purchaseOrders.get("purchaseDetails");
        List<Long> goodsBarCodes = new ArrayList<>();
        for (int i = 0; i < purchaseDetails.size(); i++) {
            JSONObject jsonObject= JSONObject.fromObject(purchaseDetails.get(i));
            PurchaseDetailsInfo purchaseDetailsInfo = (PurchaseDetailsInfo) JSONObject.toBean(jsonObject, PurchaseDetailsInfo.class);
            goodsBarCodes.add(purchaseDetailsInfo.getGoodsBarCode());
        }

        List<PurchaseDetailsInfo> purchaseDetailsInfos = purchaseDetailsInfoService.selectByExample(null);
        List<Long> purchaseDetailsGoodsBarCodes = new ArrayList<>();
        for (int i = 0; i < purchaseDetailsInfos.size(); i++) {
            purchaseDetailsGoodsBarCodes.add(purchaseDetailsInfos.get(i).getGoodsBarCode());
        }

        for (Object obj: purchaseDetails){
            JSONObject jsonObject= JSONObject.fromObject(obj);
            PurchaseDetailsInfo purchaseDetailsInfo = (PurchaseDetailsInfo) JSONObject.toBean(jsonObject, PurchaseDetailsInfo.class);
            if (!purchaseDetails.isEmpty()){
                for (int i = 0; i < goodsBarCodes.size(); i++) {
                    System.out.println(goodsBarCodes.get(i));
                    if (!purchaseDetailsGoodsBarCodes.contains(goodsBarCodes.get(i))){
                        purchaseDetailsInfoService.insert(purchaseDetailsInfo);
                    } else {
                        purchaseDetailsInfoService.updateByPrimaryKey(purchaseDetailsInfo);
                    }
                }
            }
        }
        return "redirect:/purchaseOrderInfos";
    }

    @DeleteMapping("/purchaseOrderInfo/{id}")
    public String deletePurchaseOrder(@PathVariable("id") Long id) {
        purchaseOrderInfoService.deleteByPrimaryKey(id);
        purchaseDetailsInfoService.deleteByPurchaseOrderNumber(id);
        return "redirect:/purchaseOrderInfos";
    }






}
