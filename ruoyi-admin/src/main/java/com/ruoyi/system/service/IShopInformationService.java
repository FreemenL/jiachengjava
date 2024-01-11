package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ShopInformation;

/**
 * 商品Service接口
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public interface IShopInformationService 
{
    /**
     * 查询商品
     * 
     * @param shopId 商品主键
     * @return 商品
     */
    public ShopInformation selectShopInformationByShopId(Long shopId);

    /**
     * 查询商品列表
     * 
     * @param shopInformation 商品
     * @return 商品集合
     */
    public List<ShopInformation> selectShopInformationList(ShopInformation shopInformation);

    /**
     * 新增商品
     * 
     * @param shopInformation 商品
     * @return 结果
     */
    public int insertShopInformation(ShopInformation shopInformation);

    /**
     * 修改商品
     * 
     * @param shopInformation 商品
     * @return 结果
     */
    public int updateShopInformation(ShopInformation shopInformation);

    /**
     * 批量删除商品
     * 
     * @param shopIds 需要删除的商品主键集合
     * @return 结果
     */
    public int deleteShopInformationByShopIds(Long[] shopIds);

    /**
     * 删除商品信息
     * 
     * @param shopId 商品主键
     * @return 结果
     */
    public int deleteShopInformationByShopId(Long shopId);
}
