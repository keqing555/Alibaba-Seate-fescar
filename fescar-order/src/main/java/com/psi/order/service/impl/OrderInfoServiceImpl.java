package com.psi.order.service.impl;

import com.psi.api.feign.ItemInfoFeign;
import com.psi.api.pojo.OrderInfo;
import com.psi.order.dao.OrderInfoMapper;
import com.psi.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private ItemInfoFeign itemInfoFeign;

    /***
     * 添加订单
     * @param username
     * @param id
     * @param count
     */
    @Override
    public void add(String username, int id, int count) {
        //添加订单
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setMessage("订单:" + username);
//        orderInfo.setMoney(10);
        int icount = orderInfoMapper.insert(orderInfo);
        System.out.println("添加订单受影响函数：" + icount);

        //递减库存
        itemInfoFeign.decrCount(id, count);
    }
}
