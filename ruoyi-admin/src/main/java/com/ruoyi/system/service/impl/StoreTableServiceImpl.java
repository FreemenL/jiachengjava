package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StoreTableMapper;
import com.ruoyi.system.domain.StoreTable;
import com.ruoyi.system.service.IStoreTableService;

/**
 * 店铺Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
@Service
public class StoreTableServiceImpl implements IStoreTableService 
{
    @Autowired
    private StoreTableMapper storeTableMapper;

    /**
     * 查询店铺
     * 
     * @param storeId 店铺主键
     * @return 店铺
     */
    @Override
    public StoreTable selectStoreTableByStoreId(Long storeId)
    {
        return storeTableMapper.selectStoreTableByStoreId(storeId);
    }

    /**
     * 查询店铺列表
     * 
     * @param storeTable 店铺
     * @return 店铺
     */
    @Override
    public List<StoreTable> selectStoreTableList(StoreTable storeTable)
    {
        return storeTableMapper.selectStoreTableList(storeTable);
    }

    /**
     * 新增店铺
     * 
     * @param storeTable 店铺
     * @return 结果
     */
    @Override
    public int insertStoreTable(StoreTable storeTable)
    {
        storeTable.setCreateTime(DateUtils.getNowDate());
        return storeTableMapper.insertStoreTable(storeTable);
    }

    /**
     * 修改店铺
     * 
     * @param storeTable 店铺
     * @return 结果
     */
    @Override
    public int updateStoreTable(StoreTable storeTable)
    {
        return storeTableMapper.updateStoreTable(storeTable);
    }

    /**
     * 批量删除店铺
     * 
     * @param storeIds 需要删除的店铺主键
     * @return 结果
     */
    @Override
    public int deleteStoreTableByStoreIds(Long[] storeIds)
    {
        return storeTableMapper.deleteStoreTableByStoreIds(storeIds);
    }

    /**
     * 删除店铺信息
     * 
     * @param storeId 店铺主键
     * @return 结果
     */
    @Override
    public int deleteStoreTableByStoreId(Long storeId)
    {
        return storeTableMapper.deleteStoreTableByStoreId(storeId);
    }
}
