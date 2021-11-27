package com.psi.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order")
//@RequestMapping("/orderInfo")
public interface OrderInfoFeign {
    @PostMapping(value = "/orderInfo/add")
    public String add(@RequestParam(value = "username") String username,
                      @RequestParam(value = "id") Integer id,
                      @RequestParam(value = "count") Integer count);
}
