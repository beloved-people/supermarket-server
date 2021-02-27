package pers.wangshun.supermarketserver.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pers.wangshun.supermarketserver.model.ExpensesRecord;
import pers.wangshun.supermarketserver.model.ExpensesRecordExample;
import pers.wangshun.supermarketserver.model.ShopInfo;
import pers.wangshun.supermarketserver.service.ExpensesRecordService;
import pers.wangshun.supermarketserver.service.ShopInfoService;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ExpensesRecordController {
    @Resource
    private ExpensesRecordService expensesRecordService;
    @Resource
    private ShopInfoService shopInfoService;
    @GetMapping("/expensesRecords")
    public String getInventories(@RequestParam(value="pageNum",required=false,defaultValue="1")Integer pageNum,
                                 @RequestParam(value="pageSize",required=false,defaultValue="5")Integer pageSize,
                                 @RequestParam(value = "shopId",required = false, defaultValue = "")Long shopId,
                                 ModelMap map) {
        ExpensesRecordExample expensesRecordExample = new ExpensesRecordExample();
        expensesRecordExample.setOrderByClause("invoice_number desc");
        ExpensesRecordExample.Criteria criteria = expensesRecordExample.createCriteria();
        if (!StringUtils.isEmpty(shopId)) {
            criteria.andShopIdEqualTo(shopId);
        }
        PageHelper.startPage(pageNum, pageSize);
        List<ExpensesRecord> expensesRecords = expensesRecordService.selectByExample(expensesRecordExample);
        PageInfo<ExpensesRecord> expensesRecordPageInfo = new PageInfo<>(expensesRecords, 5);
        map.addAttribute("pageInfo",expensesRecordPageInfo);
        List<ShopInfo> shopInfos = shopInfoService.selectByExample(null);
        map.addAttribute("shopInfos",shopInfos);
        map.addAttribute("shopId",shopId);
        return "data/expensesRecordList";
    }
}
