package com.psi.business.service.impl;

import com.alibaba.fescar.spring.annotation.GlobalTransactional;
import com.psi.api.feign.OrderInfoFeign;
import com.psi.api.feign.UserInfoFeign;
import com.psi.api.pojo.LogInfo;
import com.psi.business.dao.LogInfoMapper;
import com.psi.business.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BusinessServiceImpl implements BusinessService {


    @Autowired
    private OrderInfoFeign orderInfoFeign;

    @Autowired
    private UserInfoFeign userInfoFeign;

    @Autowired
    private LogInfoMapper logInfoMapper;

    /***
     * 下单
     * @param username
     * @param id
     * @param count
     */
    //添加全局事务，回滚所有“add”方法异常
    //注意：controller、service千万不能try catch处理异常，
    // 一定要抛出异常，要不然分布式事务不会生效
    @GlobalTransactional(name = "add")
    @Override
    public void add(String username, int id, int count) {
        //添加订单日志
        LogInfo logInfo = new LogInfo();
        logInfo.setContent("添加订单数据---" + new Date());
        logInfo.setCreatetime(new Date());
        int logcount = logInfoMapper.insert(logInfo);
        System.out.println("添加日志受影响行数：" + logcount);

        //添加订单
        orderInfoFeign.add(username, id, count);

        //  int i = 1 / 0;//模拟异常
        //用户账户余额递减
        userInfoFeign.decrMoney(username, 10);
    }
}
