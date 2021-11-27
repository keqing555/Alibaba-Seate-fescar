package com.psi.user.service.impl;

import com.psi.api.pojo.UserInfo;
import com.psi.user.dao.UserInfoDao;
import com.psi.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public void decrMoney(String username, int money) {
        UserInfo userInfo = userInfoDao.selectById(username);
        userInfo.setMoney(userInfo.getMoney() - money);
        int count = userInfoDao.updateById(userInfo);
        System.out.println("添加用户受影响行数：" + count);
        //int q=10/0;
    }
}
