package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.OrderList;
import com.ruoyi.system.service.IOrderListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单列Controller
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@RestController
@RequestMapping("/system/list")
public class OrderListController extends BaseController
{
    @Autowired
    private IOrderListService orderListService;

    /**
     * 查询订单列列表
     */
    @PreAuthorize("@ss.hasPermi('system:list:list')")
    @GetMapping("/list")
    public TableDataInfo list(OrderList orderList)
    {
        startPage();
        List<OrderList> list = orderListService.selectOrderListList(orderList);
        return getDataTable(list);
    }

    /**
     * 导出订单列列表
     */
    @PreAuthorize("@ss.hasPermi('system:list:export')")
    @Log(title = "订单列", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OrderList orderList)
    {
        List<OrderList> list = orderListService.selectOrderListList(orderList);
        ExcelUtil<OrderList> util = new ExcelUtil<OrderList>(OrderList.class);
        util.exportExcel(response, list, "订单列数据");
    }

    /**
     * 获取订单列详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:list:query')")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") Long orderId)
    {
        return success(orderListService.selectOrderListByOrderId(orderId));
    }

    /**
     * 新增订单列
     */
    @PreAuthorize("@ss.hasPermi('system:list:add')")
    @Log(title = "订单列", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OrderList orderList)
    {
        return toAjax(orderListService.insertOrderList(orderList));
    }

    /**
     * 修改订单列
     */
    @PreAuthorize("@ss.hasPermi('system:list:edit')")
    @Log(title = "订单列", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OrderList orderList)
    {
        return toAjax(orderListService.updateOrderList(orderList));
    }

    /**
     * 删除订单列
     */
    @PreAuthorize("@ss.hasPermi('system:list:remove')")
    @Log(title = "订单列", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable Long[] orderIds)
    {
        return toAjax(orderListService.deleteOrderListByOrderIds(orderIds));
    }
}
