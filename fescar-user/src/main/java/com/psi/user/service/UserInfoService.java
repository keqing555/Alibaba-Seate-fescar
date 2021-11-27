package com.psi.user.service;

public interface UserInfoService {

    /**
     * 账户金额递减
     *
     * @param username
     * @param money
     */
    void decrMoney(String username, int money);
}
