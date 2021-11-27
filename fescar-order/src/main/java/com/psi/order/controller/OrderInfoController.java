package com.psi.order.controller;

import com.psi.order.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
     * @param count
     * @return
     */
    @PostMapping("add")
    public String add(@RequestParam(value = "username") String username,
                      @RequestParam(value = "id") Integer id,
                      @RequestParam(value = "count") Integer count) {
        orderInfoService.add(username, id, count);
        return "SUCCESS";
    }

}
