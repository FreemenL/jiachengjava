package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ShopInformationMapper;
import com.ruoyi.system.domain.ShopInformation;
import com.ruoyi.system.service.IShopInformationService;

/**
 * 商品Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@Service
public class ShopInformationServiceImpl implements IShopInformationService 
{
    @Autowired
    private ShopInformationMapper shopInformationMapper;

    /**
     * 查询商品
     * 
     * @param shopId 商品主键
     * @return 商品
     */
    @Override
    public ShopInformation selectShopInformationByShopId(Long shopId)
    {
        return shopInformationMapper.selectShopInformationByShopId(shopId);
    }

    /**
     * 查询商品列表
     * 
     * @param shopInformation 商品
     * @return 商品
     */
    @Override
    public List<ShopInformation> selectShopInformationList(ShopInformation shopInformation)
    {
        return shopInformationMapper.selectShopInformationList(shopInformation);
    }

    /**
     * 新增商品
     * 
     * @param shopInformation 商品
     * @return 结果
     */
    @Override
    public int insertShopInformation(ShopInformation shopInformation)
    {
        return shopInformationMapper.insertShopInformation(shopInformation);
    }

    /**
     * 修改商品
     * 
     * @param shopInformation 商品
     * @return 结果
     */
    @Override
    public int updateShopInformation(ShopInformation shopInformation)
    {
        return shopInformationMapper.updateShopInformation(shopInformation);
    }

    /**
     * 批量删除商品
     * 
     * @param shopIds 需要删除的商品主键
     * @return 结果
     */
    @Override
    public int deleteShopInformationByShopIds(Long[] shopIds)
    {
        return shopInformationMapper.deleteShopInformationByShopIds(shopIds);
    }

    /**
     * 删除商品信息
     * 
     * @param shopId 商品主键
     * @return 结果
     */
    @Override
    public int deleteShopInformationByShopId(Long shopId)
    {
        return shopInformationMapper.deleteShopInformationByShopId(shopId);
    }
}
