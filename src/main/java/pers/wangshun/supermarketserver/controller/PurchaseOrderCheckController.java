package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import pers.wangshun.supermarketserver.model.WarehouseProductInfo;
import pers.wangshun.supermarketserver.model.*;
import pers.wangshun.supermarketserver.service.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WangShun
 */
@Controller
public class PurchaseOrderCheckController {

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
    @Resource
    private PurchaseReceiptInfoService purchaseReceiptInfoService;
    @Resource
    private WarehouseProductInfoService warehouseProductInfoService;
    @Resource
    private GoodsInfoService goodsInfoService;

    @GetMapping("/purchaseOrderChecks")
    public String getPurchaseOrderChecks(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                         @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                                         ModelMap map) {
        PurchaseOrderInfoExample purchaseOrderInfoExample = new PurchaseOrderInfoExample();
        purchaseOrderInfoExample.setOrderByClause("purchase_order_number desc");
        PageHelper.startPage(pageNum, pageSize);
        List<PurchaseOrderInfo> purchaseOrderInfos = purchaseOrderInfoService.selectByExample(purchaseOrderInfoExample);
        List<PurchaseOrderInfo> purchaseOrderInfosByCheck = new ArrayList<>();
        for (int i = 0; i < purchaseOrderInfos.size(); i++) {
            if (purchaseOrderInfos.get(i).getPurchaser() != null
                    && purchaseOrderInfos.get(i).getOrderer() !=null
                    && "02".equals(purchaseOrderInfos.get(i).getPurchaseOrderFinishedCondition())) {
                purchaseOrderInfosByCheck.add(purchaseOrderInfos.get(i));
            }
        }
        PageInfo<PurchaseOrderInfo> purchaseOrderInfoPageInfo = new PageInfo<>(purchaseOrderInfosByCheck, 5);
        map.put("pageInfo", purchaseOrderInfoPageInfo);
        System.out.println(purchaseOrderInfoPageInfo);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        Map<Long, String> employeeCodes = new HashMap<>();
        Map<Long, String> orders = new HashMap<>();
        Map<Long, String> acceptors = new HashMap<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            employeeCodes.put(employeeUsers.get(i).getEmployeeCode(), employeeUsers.get(i).getUsername());
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            if ("ROLE_ORDERER".equals(employeeUsers.get(i).getRoles().get(0).getName())) {
                orders.put(employeeUsers.get(i).getEmployeeCode(), employeeUsers.get(i).getUsername());
            }
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            if ("ROLE_ACCEPTOR".equals(employeeUsers.get(i).getRoles().get(0).getName())) {
                acceptors.put(employeeUsers.get(i).getEmployeeCode(), employeeUsers.get(i).getUsername());
            }
        }
        map.put("orders", orders);
        map.put("employeeCodes", employeeCodes);
        map.put("acceptors", acceptors);

        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        Map<Integer, String> supplierIds = new HashMap<>();
        for (int i = 0; i < supplierInfos.size(); i++) {
            supplierIds.put(supplierInfos.get(i).getSupplierId(), supplierInfos.get(i).getSupplierName());
        }
        map.put("supplierIds", supplierIds);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        Map<Long, String> warehouseCodes = new HashMap<>();
        for (int i = 0; i < warehouseInfos.size(); i++) {
            warehouseCodes.put(warehouseInfos.get(i).getWarehouseCode(), warehouseInfos.get(i).getWarehouseName());
        }
        map.put("warehouseCodes", warehouseCodes);
        return "purchase/purchaseOrderCheckList";
    }

    @GetMapping("/purchaseOrderCheckTrashes")
    public String getPurchaseOrderCheckTrashes(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                                               @RequestParam(value = "pageSize", required = false, defaultValue = "5") Integer pageSize,
                                               ModelMap map) {
        PurchaseOrderInfoExample purchaseOrderInfoExample = new PurchaseOrderInfoExample();
        purchaseOrderInfoExample.setOrderByClause("purchase_order_number desc");
        PageHelper.startPage(pageNum, pageSize);
        List<PurchaseOrderInfo> purchaseOrderInfos = purchaseOrderInfoService.selectByExample(purchaseOrderInfoExample);
        List<PurchaseOrderInfo> objects = new ArrayList<>();
        for (int i = 0; i < purchaseOrderInfos.size(); i++) {
            if ((!StringUtils.isEmpty(purchaseOrderInfos.get(i).getAcceptor())) && ("01".equals(purchaseOrderInfos.get(i).getPurchaseOrderFinishedCondition()))) {
                objects.add(purchaseOrderInfos.get(i));
            }
        }
        PageInfo<PurchaseOrderInfo> purchaseOrderInfoPageInfo = new PageInfo<>(objects, 5);
        map.put("pageInfo", purchaseOrderInfoPageInfo);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        Map<Long, String> employeeCodes = new HashMap<>();
        Map<Long, String> orders = new HashMap<>();
        Map<Long, String> acceptors = new HashMap<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            employeeCodes.put(employeeUsers.get(i).getEmployeeCode(), employeeUsers.get(i).getUsername());
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            if ("ROLE_ORDERER".equals(employeeUsers.get(i).getRoles().get(0).getName())) {
                orders.put(employeeUsers.get(i).getEmployeeCode(), employeeUsers.get(i).getUsername());
            }
        }
        for (int i = 0; i < employeeUsers.size(); i++) {
            if ("ROLE_ACCEPTOR".equals(employeeUsers.get(i).getRoles().get(0).getName())) {
                acceptors.put(employeeUsers.get(i).getEmployeeCode(), employeeUsers.get(i).getUsername());
            }
        }
        map.put("orders", orders);
        map.put("employeeCodes", employeeCodes);
        map.put("acceptors", acceptors);

        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        Map<Integer, String> supplierIds = new HashMap<>();
        for (int i = 0; i < supplierInfos.size(); i++) {
            supplierIds.put(supplierInfos.get(i).getSupplierId(), supplierInfos.get(i).getSupplierName());
        }
        map.put("supplierIds", supplierIds);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        Map<Long, String> warehouseCodes = new HashMap<>();
        for (int i = 0; i < warehouseInfos.size(); i++) {
            warehouseCodes.put(warehouseInfos.get(i).getWarehouseCode(), warehouseInfos.get(i).getWarehouseName());
        }
        map.put("warehouseCodes", warehouseCodes);
        return "purchase/purchaseOrderCheckTrash";
    }

    @GetMapping("/purchaseOrderCheck/{id}")
    public String toEditPage(@PathVariable("id") Long id, Model model) {
        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        model.addAttribute("supplierInfos", supplierInfos);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        List<EmployeeUser> employeeUsers2 = new ArrayList<>();
        List<EmployeeUser> employeeUsers3 = new ArrayList<>();
        List<EmployeeUser> employeeUsers4 = new ArrayList<>();
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
        for (int i = 0; i < employeeUsers.size(); i++) {
            String name = employeeUsers.get(i).getRoles().get(0).getName();
            if ("ROLE_ACCEPTOR".equals(name)) {
                employeeUsers4.add(employeeUsers.get(i));
            }
        }
        model.addAttribute("employeeUsersOfPurchase", employeeUsers2);
        model.addAttribute("employeeUsersOfOrder", employeeUsers3);
        model.addAttribute("employeeUsersOfAcceptor", employeeUsers4);
        List<FourthLevelAdministrativeDivision> fourthLevelAdministrativeDivisions
                = fourthLevelAdministrativeDivisionService.selectByExample(null);
        model.addAttribute("fourthLevel", fourthLevelAdministrativeDivisions);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        model.addAttribute("warehouseInfos", warehouseInfos);

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
        model.addAttribute("purchaseDetailsInfos", purchaseDetailsInfos2);
        return "purchase/purchaseOrderCheckAdd";
    }

    @GetMapping("/purchaseReceipt/{id}")
    public String toFillPage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("purchaseReceiptNumber", id);
        PurchaseReceiptInfo purchaseReceiptInfo = purchaseReceiptInfoService.selectByPrimaryKey(id);
        List<SupplierInfo> supplierInfos = supplierInfoService.selectByExample(null);
        model.addAttribute("supplierInfos", supplierInfos);
        PurchaseDetailsInfoExample purchaseDetailsInfoExample = new PurchaseDetailsInfoExample();
        PurchaseDetailsInfoExample.Criteria criteria = purchaseDetailsInfoExample.createCriteria();
        criteria.andPurchaseOrderNumberEqualTo(id);
        List<PurchaseDetailsInfo> purchaseDetailsInfos = purchaseDetailsInfoService.selectByExample(purchaseDetailsInfoExample);
        BigDecimal totalAmount = new BigDecimal(0);
        for (int i = 0; i < purchaseDetailsInfos.size(); i++) {
            totalAmount = totalAmount.add(purchaseDetailsInfos.get(i).getPurchaseDetailsAmount());
        }
        model.addAttribute("totalAmount", totalAmount);
        List<EmployeeUser> employeeUsers = employeeUserService.selectByExample(null);
        List<EmployeeUser> employeeUsers2 = new ArrayList<>();
        for (int i = 0; i < employeeUsers.size(); i++) {
            String name = employeeUsers.get(i).getRoles().get(0).getName();
            if ("ROLE_ACCEPTOR".equals(name)) {
                employeeUsers2.add(employeeUsers.get(i));
            }
        }
        model.addAttribute("employeeUsersOfAcceptor", employeeUsers2);
        model.addAttribute("purchaseReceiptInfo", purchaseReceiptInfo);
        return "purchase/purchaseReceiptAdd";
    }

    @GetMapping("/purchaseWarehouse/{id}")
    public String toPurchaseWarehousePage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("purchaseOrderNumber", id);
        List<WarehouseInfo> warehouseInfos = warehouseInfoService.selectByExample(null);
        model.addAttribute("warehouseInfos",warehouseInfos);
        return "purchase/purchaseWarehouseAdd";
    }

    @PostMapping("/purchaseWarehouse")
    public String addPurchaseWarehouse(@RequestParam(value = "warehouseCode") Long warehouseCode,
                                       @RequestParam(value = "purchaseOrderNumber") Long purchaseOrderNumber) {
        PurchaseDetailsInfoExample purchaseDetailsInfoExample = new PurchaseDetailsInfoExample();
        purchaseDetailsInfoExample.createCriteria().andPurchaseOrderNumberEqualTo(purchaseOrderNumber);
        List<PurchaseDetailsInfo> purchaseDetailsInfos = purchaseDetailsInfoService.selectByExample(purchaseDetailsInfoExample);
        WarehouseProductInfo warehouseProductInfo = new WarehouseProductInfo();
        for (int i = 0; i < purchaseDetailsInfos.size(); i++) {
            warehouseProductInfo.setWarehouseCode(warehouseCode);
            warehouseProductInfo.setGoodsBarCode(purchaseDetailsInfos.get(i).getGoodsBarCode());
            warehouseProductInfo.setPurchasePrice(purchaseDetailsInfos.get(i).getPurchasePrice());
            warehouseProductInfo.setPurchaseDetailsQuantity(purchaseDetailsInfos.get(i).getPurchaseDetailsQuantity());
            warehouseProductInfo.setPurchaseDetailsQuantityUnit(purchaseDetailsInfos.get(i).getPurchaseDetailsQuantityUnit());
            warehouseProductInfo.setPurchaseDetailsAmount(purchaseDetailsInfos.get(i).getPurchaseDetailsAmount());
            warehouseProductInfo.setPurchaseDetailsExpirationDate(purchaseDetailsInfos.get(i).getPurchaseDetailsExpirationDate());
            warehouseProductInfoService.insert(warehouseProductInfo);
            GoodsInfo goodsInfo = new GoodsInfo();
            GoodsInfo goodsInfo1 = goodsInfoService.selectByPrimaryKey(purchaseDetailsInfos.get(i).getGoodsBarCode());
            if (!StringUtils.isEmpty(goodsInfo1)) {
                goodsInfo.setGoodsBarCode(purchaseDetailsInfos.get(i).getGoodsBarCode());
                goodsInfo.setGoodsPurchasePrice(purchaseDetailsInfos.get(i).getPurchasePrice());
                goodsInfo.setGoodsExpiryDate(purchaseDetailsInfos.get(i).getPurchaseDetailsExpirationDate());
                goodsInfoService.insertSelective(goodsInfo);
            }
        }
        return "redirect:/purchaseOrderChecks";
    }


    @PutMapping("/purchaseOrderCheck")
    public String editPurchaseOrderCheck(PurchaseOrderInfo purchaseOrderInfo) {
        purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);

        return "redirect:/purchaseOrderChecks";
    }

    @PutMapping("/purchaseReceipt")
    public String fillPurchaseReceipt(PurchaseReceiptInfo purchaseReceiptInfo) {
        PurchaseReceiptInfo purchaseReceipt = purchaseReceiptInfoService.selectByPrimaryKey(purchaseReceiptInfo.getPurchaseReceiptNumber());
        if (purchaseReceipt == null) {
            purchaseReceiptInfoService.insertSelective(purchaseReceiptInfo);

        } else {
            purchaseReceiptInfoService.updateByPrimaryKeySelective(purchaseReceiptInfo);
        }

        return "redirect:/purchaseOrderChecks";
    }

//    @DeleteMapping("/purchaseOrderCheck/{id}")
//    public String deletePurchaseOrder(@PathVariable("id") Long id) {
//        PurchaseOrderInfo purchaseOrderInfo = purchaseOrderInfoService.selectByPrimaryKey(id);
//
//        return "redirect:/purchaseOrderChecks";
//    }

//    @PostMapping("/purchaseOrderCheckTrash/{id}")
//    public String restorePurchaseOrderTrash(@PathVariable("id") Long id) {
//        PurchaseOrderInfo purchaseOrderInfo = purchaseOrderInfoService.selectByPrimaryKey(id);
//        purchaseOrderInfo.setPurchaseOrderFinishedCondition("02");
//        purchaseOrderInfoService.updateByPrimaryKeySelective(purchaseOrderInfo);
//        return "redirect:/purchaseOrderChecks";
//    }


}
