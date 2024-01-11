package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrderListMapper;
import com.ruoyi.system.domain.OrderList;
import com.ruoyi.system.service.IOrderListService;

/**
 * 订单列Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@Service
public class OrderListServiceImpl implements IOrderListService 
{
    @Autowired
    private OrderListMapper orderListMapper;

    /**
     * 查询订单列
     * 
     * @param orderId 订单列主键
     * @return 订单列
     */
    @Override
    public OrderList selectOrderListByOrderId(Long orderId)
    {
        return orderListMapper.selectOrderListByOrderId(orderId);
    }

    /**
     * 查询订单列列表
     * 
     * @param orderList 订单列
     * @return 订单列
     */
    @Override
    public List<OrderList> selectOrderListList(OrderList orderList)
    {
        return orderListMapper.selectOrderListList(orderList);
    }

    /**
     * 新增订单列
     * 
     * @param orderList 订单列
     * @return 结果
     */
    @Override
    public int insertOrderList(OrderList orderList)
    {
        return orderListMapper.insertOrderList(orderList);
    }

    /**
     * 修改订单列
     * 
     * @param orderList 订单列
     * @return 结果
     */
    @Override
    public int updateOrderList(OrderList orderList)
    {
        return orderListMapper.updateOrderList(orderList);
    }

    /**
     * 批量删除订单列
     * 
     * @param orderIds 需要删除的订单列主键
     * @return 结果
     */
    @Override
    public int deleteOrderListByOrderIds(Long[] orderIds)
    {
        return orderListMapper.deleteOrderListByOrderIds(orderIds);
    }

    /**
     * 删除订单列信息
     * 
     * @param orderId 订单列主键
     * @return 结果
     */
    @Override
    public int deleteOrderListByOrderId(Long orderId)
    {
        return orderListMapper.deleteOrderListByOrderId(orderId);
    }
}
