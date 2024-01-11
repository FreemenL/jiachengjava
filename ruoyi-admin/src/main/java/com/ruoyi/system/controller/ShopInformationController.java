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
import com.ruoyi.system.domain.ShopInformation;
import com.ruoyi.system.service.IShopInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品Controller
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@RestController
@RequestMapping("/system/information")
public class ShopInformationController extends BaseController
{
    @Autowired
    private IShopInformationService shopInformationService;

    /**
     * 查询商品列表
     */
    @PreAuthorize("@ss.hasPermi('system:information:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShopInformation shopInformation)
    {
        startPage();
        List<ShopInformation> list = shopInformationService.selectShopInformationList(shopInformation);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @PreAuthorize("@ss.hasPermi('system:information:export')")
    @Log(title = "商品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShopInformation shopInformation)
    {
        List<ShopInformation> list = shopInformationService.selectShopInformationList(shopInformation);
        ExcelUtil<ShopInformation> util = new ExcelUtil<ShopInformation>(ShopInformation.class);
        util.exportExcel(response, list, "商品数据");
    }

    /**
     * 获取商品详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:information:query')")
    @GetMapping(value = "/{shopId}")
    public AjaxResult getInfo(@PathVariable("shopId") Long shopId)
    {
        return success(shopInformationService.selectShopInformationByShopId(shopId));
    }

    /**
     * 新增商品
     */
    @PreAuthorize("@ss.hasPermi('system:information:add')")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShopInformation shopInformation)
    {
        return toAjax(shopInformationService.insertShopInformation(shopInformation));
    }

    /**
     * 修改商品
     */
    @PreAuthorize("@ss.hasPermi('system:information:edit')")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShopInformation shopInformation)
    {
        return toAjax(shopInformationService.updateShopInformation(shopInformation));
    }

    /**
     * 删除商品
     */
    @PreAuthorize("@ss.hasPermi('system:information:remove')")
    @Log(title = "商品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{shopIds}")
    public AjaxResult remove(@PathVariable Long[] shopIds)
    {
        return toAjax(shopInformationService.deleteShopInformationByShopIds(shopIds));
    }
}
