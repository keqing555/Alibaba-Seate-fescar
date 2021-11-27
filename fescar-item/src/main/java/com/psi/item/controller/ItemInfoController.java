package com.psi.item.controller;

import com.psi.item.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itemInfo")
public class ItemInfoController {
    @Autowired
    private ItemInfoService itemInfoService;


    @PostMapping("decrCount")
    public String decrCount(int count, int id) {
        try {
            //库存递减
            itemInfoService.decrCount(id, count);
            return "SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
            return "FAILURE";
        }
    }
}
