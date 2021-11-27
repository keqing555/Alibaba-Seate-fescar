package com.psi.item.service.impl;

import com.psi.api.pojo.ItemInfo;
import com.psi.item.dao.ItemInfoMapper;
import com.psi.item.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
//出现异常时回滚
//@Transactional(rollbackFor = Exception.class)
public class ItemInfoServiceImpl implements ItemInfoService {
    @Autowired
    private ItemInfoMapper itemInfoMapper;

    /***
     * 库存递减
     * @param id
     * @param count
     */
    @Override
    public void decrCount(int id, int count) {
        //查询商品信息
        ItemInfo itemInfo = itemInfoMapper.selectById(id);
        itemInfo.setCount(itemInfo.getCount() - count);
        int dcount = itemInfoMapper.updateById(itemInfo);
        System.out.println("库存递减受影响行数：" + dcount);
        //try catch 手动回滚   TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    }
}
