package com.psi.business.controller;

import com.psi.business.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    /**
     * 购买商品分布式测试
     *
     * @param username
     * @param id
     * @param count
     * @return
     */
    @PostMapping("addOrder")
    public String addOrder(String username, int id, int count) {
        businessService.add(username, id, count);
        return "SUCCESS";
    }
}
