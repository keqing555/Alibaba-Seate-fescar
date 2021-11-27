package com.psi.order.controller;

import com.psi.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderInfo")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    /**
     * 添加订单
     *
     * @param username
     * @param id
     * @param money
     * @return
     */
    @PostMapping("add")
    public String add(String username, int id, int money) {
        orderInfoService.add(username, id, money);
        return "SUCCESS";
    }
}
