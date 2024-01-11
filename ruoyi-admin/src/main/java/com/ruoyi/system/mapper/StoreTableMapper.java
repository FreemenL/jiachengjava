package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StoreTable;

/**
 * 店铺Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-30
 */
public interface StoreTableMapper 
{
    /**
     * 查询店铺
     * 
     * @param storeId 店铺主键
     * @return 店铺
     */
    public StoreTable selectStoreTableByStoreId(Long storeId);

    /**
     * 查询店铺列表
     * 
     * @param storeTable 店铺
     * @return 店铺集合
     */
    public List<StoreTable> selectStoreTableList(StoreTable storeTable);

    /**
     * 新增店铺
     * 
     * @param storeTable 店铺
     * @return 结果
     */
    public int insertStoreTable(StoreTable storeTable);

    /**
     * 修改店铺
     * 
     * @param storeTable 店铺
     * @return 结果
     */
    public int updateStoreTable(StoreTable storeTable);

    /**
     * 删除店铺
     * 
     * @param storeId 店铺主键
     * @return 结果
     */
    public int deleteStoreTableByStoreId(Long storeId);

    /**
     * 批量删除店铺
     * 
     * @param storeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStoreTableByStoreIds(Long[] storeIds);
}
