package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单列对象 order_list
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public class OrderList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单id */
    private Long orderId;

    /** 店铺名称 */
    @Excel(name = "店铺名称")
    private String orderShopName;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String orderProductName;

    /** 套餐类型 */
    @Excel(name = "套餐类型")
    private String orderSubjectName;

    /** 行程天数 */
    @Excel(name = "行程天数")
    private String orderTimeName;

    /** 数量 */
    @Excel(name = "数量")
    private String orderNumber;

    /** 订单编号 */
    @Excel(name = "订单编号")
    private String orderNumbers;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String orderUserName;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String orderIdCardNumber;

    /** 出生日期 */
    @Excel(name = "出生日期")
    private String orderBirthday;

    /** 联系人 */
    @Excel(name = "联系人")
    private String orderSystemUser;

    /** 手机号 */
    @Excel(name = "手机号")
    private String orderPhone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String orderEmail;

    /** 付款方式 */
    @Excel(name = "付款方式")
    private String orderUserPayWay;

    /** 单价 */
    @Excel(name = "单价")
    private String orderPrice;

    /** 录单客服 */
    @Excel(name = "录单客服")
    private String orderServersName;

    /** 出行日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出行日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date orderDataTime;

    /** 备注 */
    @Excel(name = "备注")
    private String orderExtends;

    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setOrderShopName(String orderShopName) 
    {
        this.orderShopName = orderShopName;
    }

    public String getOrderShopName() 
    {
        return orderShopName;
    }
    public void setOrderProductName(String orderProductName) 
    {
        this.orderProductName = orderProductName;
    }

    public String getOrderProductName() 
    {
        return orderProductName;
    }
    public void setOrderSubjectName(String orderSubjectName) 
    {
        this.orderSubjectName = orderSubjectName;
    }

    public String getOrderSubjectName() 
    {
        return orderSubjectName;
    }
    public void setOrderTimeName(String orderTimeName) 
    {
        this.orderTimeName = orderTimeName;
    }

    public String getOrderTimeName() 
    {
        return orderTimeName;
    }
    public void setOrderNumber(String orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() 
    {
        return orderNumber;
    }
    public void setOrderNumbers(String orderNumbers) 
    {
        this.orderNumbers = orderNumbers;
    }

    public String getOrderNumbers() 
    {
        return orderNumbers;
    }
    public void setOrderUserName(String orderUserName) 
    {
        this.orderUserName = orderUserName;
    }

    public String getOrderUserName() 
    {
        return orderUserName;
    }
    public void setOrderIdCardNumber(String orderIdCardNumber) 
    {
        this.orderIdCardNumber = orderIdCardNumber;
    }

    public String getOrderIdCardNumber() 
    {
        return orderIdCardNumber;
    }
    public void setOrderBirthday(String orderBirthday) 
    {
        this.orderBirthday = orderBirthday;
    }

    public String getOrderBirthday() 
    {
        return orderBirthday;
    }
    public void setOrderSystemUser(String orderSystemUser) 
    {
        this.orderSystemUser = orderSystemUser;
    }

    public String getOrderSystemUser() 
    {
        return orderSystemUser;
    }
    public void setOrderPhone(String orderPhone) 
    {
        this.orderPhone = orderPhone;
    }

    public String getOrderPhone() 
    {
        return orderPhone;
    }
    public void setOrderEmail(String orderEmail) 
    {
        this.orderEmail = orderEmail;
    }

    public String getOrderEmail() 
    {
        return orderEmail;
    }
    public void setOrderUserPayWay(String orderUserPayWay) 
    {
        this.orderUserPayWay = orderUserPayWay;
    }

    public String getOrderUserPayWay() 
    {
        return orderUserPayWay;
    }
    public void setOrderPrice(String orderPrice) 
    {
        this.orderPrice = orderPrice;
    }

    public String getOrderPrice() 
    {
        return orderPrice;
    }
    public void setOrderServersName(String orderServersName) 
    {
        this.orderServersName = orderServersName;
    }

    public String getOrderServersName() 
    {
        return orderServersName;
    }
    public void setOrderDataTime(Date orderDataTime) 
    {
        this.orderDataTime = orderDataTime;
    }

    public Date getOrderDataTime() 
    {
        return orderDataTime;
    }
    public void setOrderExtends(String orderExtends) 
    {
        this.orderExtends = orderExtends;
    }

    public String getOrderExtends() 
    {
        return orderExtends;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("orderShopName", getOrderShopName())
            .append("orderProductName", getOrderProductName())
            .append("orderSubjectName", getOrderSubjectName())
            .append("orderTimeName", getOrderTimeName())
            .append("orderNumber", getOrderNumber())
            .append("orderNumbers", getOrderNumbers())
            .append("orderUserName", getOrderUserName())
            .append("orderIdCardNumber", getOrderIdCardNumber())
            .append("orderBirthday", getOrderBirthday())
            .append("orderSystemUser", getOrderSystemUser())
            .append("orderPhone", getOrderPhone())
            .append("orderEmail", getOrderEmail())
            .append("orderUserPayWay", getOrderUserPayWay())
            .append("orderPrice", getOrderPrice())
            .append("orderServersName", getOrderServersName())
            .append("orderDataTime", getOrderDataTime())
            .append("orderExtends", getOrderExtends())
            .toString();
    }
}
