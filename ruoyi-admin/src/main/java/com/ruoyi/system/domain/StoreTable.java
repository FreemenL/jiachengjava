package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 店铺对象 store_table
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public class StoreTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 店铺id */
    private Long storeId;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String storeName;

    /** 店铺描述 */
    @Excel(name = "店铺描述")
    private String storeComment;

    /** token */
    @Excel(name = "token")
    private String storeToken;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setStoreId(Long storeId) 
    {
        this.storeId = storeId;
    }

    public Long getStoreId() 
    {
        return storeId;
    }
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    public String getStoreName() 
    {
        return storeName;
    }
    public void setStoreComment(String storeComment) 
    {
        this.storeComment = storeComment;
    }

    public String getStoreComment() 
    {
        return storeComment;
    }
    public void setStoreToken(String storeToken) 
    {
        this.storeToken = storeToken;
    }

    public String getStoreToken() 
    {
        return storeToken;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("storeId", getStoreId())
            .append("storeName", getStoreName())
            .append("storeComment", getStoreComment())
            .append("storeToken", getStoreToken())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("status", getStatus())
            .toString();
    }
}
