package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TypeManagement;

/**
 * 订单类型Service接口
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public interface ITypeManagementService 
{
    /**
     * 查询订单类型
     * 
     * @param typeId 订单类型主键
     * @return 订单类型
     */
    public TypeManagement selectTypeManagementByTypeId(Long typeId);

    /**
     * 查询订单类型列表
     * 
     * @param typeManagement 订单类型
     * @return 订单类型集合
     */
    public List<TypeManagement> selectTypeManagementList(TypeManagement typeManagement);

    /**
     * 新增订单类型
     * 
     * @param typeManagement 订单类型
     * @return 结果
     */
    public int insertTypeManagement(TypeManagement typeManagement);

    /**
     * 修改订单类型
     * 
     * @param typeManagement 订单类型
     * @return 结果
     */
    public int updateTypeManagement(TypeManagement typeManagement);

    /**
     * 批量删除订单类型
     * 
     * @param typeIds 需要删除的订单类型主键集合
     * @return 结果
     */
    public int deleteTypeManagementByTypeIds(Long[] typeIds);

    /**
     * 删除订单类型信息
     * 
     * @param typeId 订单类型主键
     * @return 结果
     */
    public int deleteTypeManagementByTypeId(Long typeId);
}
