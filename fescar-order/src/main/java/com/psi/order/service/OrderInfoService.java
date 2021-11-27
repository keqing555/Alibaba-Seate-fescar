package com.psi.order.service;

public interface OrderInfoService {

    /**
     * 添加订单
     * @param username
     * @param count
     */
    void add(String username,int id,int count);
}
