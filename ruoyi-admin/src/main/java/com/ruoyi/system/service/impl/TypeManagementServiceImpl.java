package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TypeManagementMapper;
import com.ruoyi.system.domain.TypeManagement;
import com.ruoyi.system.service.ITypeManagementService;

/**
 * 订单类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@Service
public class TypeManagementServiceImpl implements ITypeManagementService 
{
    @Autowired
    private TypeManagementMapper typeManagementMapper;

    /**
     * 查询订单类型
     * 
     * @param typeId 订单类型主键
     * @return 订单类型
     */
    @Override
    public TypeManagement selectTypeManagementByTypeId(Long typeId)
    {
        return typeManagementMapper.selectTypeManagementByTypeId(typeId);
    }

    /**
     * 查询订单类型列表
     * 
     * @param typeManagement 订单类型
     * @return 订单类型
     */
    @Override
    public List<TypeManagement> selectTypeManagementList(TypeManagement typeManagement)
    {
        return typeManagementMapper.selectTypeManagementList(typeManagement);
    }

    /**
     * 新增订单类型
     * 
     * @param typeManagement 订单类型
     * @return 结果
     */
    @Override
    public int insertTypeManagement(TypeManagement typeManagement)
    {
        return typeManagementMapper.insertTypeManagement(typeManagement);
    }

    /**
     * 修改订单类型
     * 
     * @param typeManagement 订单类型
     * @return 结果
     */
    @Override
    public int updateTypeManagement(TypeManagement typeManagement)
    {
        return typeManagementMapper.updateTypeManagement(typeManagement);
    }

    /**
     * 批量删除订单类型
     * 
     * @param typeIds 需要删除的订单类型主键
     * @return 结果
     */
    @Override
    public int deleteTypeManagementByTypeIds(Long[] typeIds)
    {
        return typeManagementMapper.deleteTypeManagementByTypeIds(typeIds);
    }

    /**
     * 删除订单类型信息
     * 
     * @param typeId 订单类型主键
     * @return 结果
     */
    @Override
    public int deleteTypeManagementByTypeId(Long typeId)
    {
        return typeManagementMapper.deleteTypeManagementByTypeId(typeId);
    }
}
