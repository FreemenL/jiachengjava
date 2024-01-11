package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OrderList;

/**
 * 订单列Service接口
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public interface IOrderListService 
{
    /**
     * 查询订单列
     * 
     * @param orderId 订单列主键
     * @return 订单列
     */
    public OrderList selectOrderListByOrderId(Long orderId);

    /**
     * 查询订单列列表
     * 
     * @param orderList 订单列
     * @return 订单列集合
     */
    public List<OrderList> selectOrderListList(OrderList orderList);

    /**
     * 新增订单列
     * 
     * @param orderList 订单列
     * @return 结果
     */
    public int insertOrderList(OrderList orderList);

    /**
     * 修改订单列
     * 
     * @param orderList 订单列
     * @return 结果
     */
    public int updateOrderList(OrderList orderList);

    /**
     * 批量删除订单列
     * 
     * @param orderIds 需要删除的订单列主键集合
     * @return 结果
     */
    public int deleteOrderListByOrderIds(Long[] orderIds);

    /**
     * 删除订单列信息
     * 
     * @param orderId 订单列主键
     * @return 结果
     */
    public int deleteOrderListByOrderId(Long orderId);
}
