package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商品对象 shop_information
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public class ShopInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long shopId;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String shopName;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    public void setShopId(Long shopId) 
    {
        this.shopId = shopId;
    }

    public Long getShopId() 
    {
        return shopId;
    }
    public void setShopName(String shopName) 
    {
        this.shopName = shopName;
    }

    public String getShopName() 
    {
        return shopName;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("shopId", getShopId())
            .append("shopName", getShopName())
            .append("storeName", getStoreName())
            .toString();
    }
}
