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
import com.ruoyi.system.domain.StoreTable;
import com.ruoyi.system.service.IStoreTableService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 店铺Controller
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@RestController
@RequestMapping("/system/table")
public class StoreTableController extends BaseController
{
    @Autowired
    private IStoreTableService storeTableService;

    /**
     * 查询店铺列表
     */
    @PreAuthorize("@ss.hasPermi('system:table:list')")
    @GetMapping("/list")
    public TableDataInfo list(StoreTable storeTable)
    {
        startPage();
        List<StoreTable> list = storeTableService.selectStoreTableList(storeTable);
        return getDataTable(list);
    }

    /**
     * 导出店铺列表
     */
    @PreAuthorize("@ss.hasPermi('system:table:export')")
    @Log(title = "店铺", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, StoreTable storeTable)
    {
        List<StoreTable> list = storeTableService.selectStoreTableList(storeTable);
        ExcelUtil<StoreTable> util = new ExcelUtil<StoreTable>(StoreTable.class);
        util.exportExcel(response, list, "店铺数据");
    }

    /**
     * 获取店铺详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:table:query')")
    @GetMapping(value = "/{storeId}")
    public AjaxResult getInfo(@PathVariable("storeId") Long storeId)
    {
        return success(storeTableService.selectStoreTableByStoreId(storeId));
    }

    /**
     * 新增店铺
     */
    @PreAuthorize("@ss.hasPermi('system:table:add')")
    @Log(title = "店铺", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody StoreTable storeTable)
    {
        return toAjax(storeTableService.insertStoreTable(storeTable));
    }

    /**
     * 修改店铺
     */
    @PreAuthorize("@ss.hasPermi('system:table:edit')")
    @Log(title = "店铺", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody StoreTable storeTable)
    {
        return toAjax(storeTableService.updateStoreTable(storeTable));
    }

    /**
     * 删除店铺
     */
    @PreAuthorize("@ss.hasPermi('system:table:remove')")
    @Log(title = "店铺", businessType = BusinessType.DELETE)
	@DeleteMapping("/{storeIds}")
    public AjaxResult remove(@PathVariable Long[] storeIds)
    {
        return toAjax(storeTableService.deleteStoreTableByStoreIds(storeIds));
    }
}
