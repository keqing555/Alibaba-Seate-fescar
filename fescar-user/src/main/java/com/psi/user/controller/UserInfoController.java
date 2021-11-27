package com.psi.user.controller;

import com.psi.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 账户余额递减
     *
     * @param username
     * @param money
     * @return
     */
    @PostMapping("add")
    public String decrMoney(String username, int money) {
        userInfoService.decrMoney(username, money);
        return "SUCCESS";
    }
}
