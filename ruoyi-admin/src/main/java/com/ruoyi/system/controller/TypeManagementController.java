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
import com.ruoyi.system.domain.TypeManagement;
import com.ruoyi.system.service.ITypeManagementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 订单类型Controller
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@RestController
@RequestMapping("/system/management")
public class TypeManagementController extends BaseController
{
    @Autowired
    private ITypeManagementService typeManagementService;

    /**
     * 查询订单类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:management:list')")
    @GetMapping("/list")
    public TableDataInfo list(TypeManagement typeManagement)
    {
        startPage();
        List<TypeManagement> list = typeManagementService.selectTypeManagementList(typeManagement);
        return getDataTable(list);
    }

    /**
     * 导出订单类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:management:export')")
    @Log(title = "订单类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TypeManagement typeManagement)
    {
        List<TypeManagement> list = typeManagementService.selectTypeManagementList(typeManagement);
        ExcelUtil<TypeManagement> util = new ExcelUtil<TypeManagement>(TypeManagement.class);
        util.exportExcel(response, list, "订单类型数据");
    }

    /**
     * 获取订单类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:management:query')")
    @GetMapping(value = "/{typeId}")
    public AjaxResult getInfo(@PathVariable("typeId") Long typeId)
    {
        return success(typeManagementService.selectTypeManagementByTypeId(typeId));
    }

    /**
     * 新增订单类型
     */
    @PreAuthorize("@ss.hasPermi('system:management:add')")
    @Log(title = "订单类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TypeManagement typeManagement)
    {
        return toAjax(typeManagementService.insertTypeManagement(typeManagement));
    }

    /**
     * 修改订单类型
     */
    @PreAuthorize("@ss.hasPermi('system:management:edit')")
    @Log(title = "订单类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TypeManagement typeManagement)
    {
        return toAjax(typeManagementService.updateTypeManagement(typeManagement));
    }

    /**
     * 删除订单类型
     */
    @PreAuthorize("@ss.hasPermi('system:management:remove')")
    @Log(title = "订单类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{typeIds}")
    public AjaxResult remove(@PathVariable Long[] typeIds)
    {
        return toAjax(typeManagementService.deleteTypeManagementByTypeIds(typeIds));
    }
}
