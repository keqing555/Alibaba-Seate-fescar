package com.psi.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user")
//@RequestMapping("/userInfo")
public interface UserInfoFeign {

    @PostMapping(value = "/userInfo/add")
    public String decrMoney(@RequestParam(value = "username") String username,
                            @RequestParam(value = "money") int money);

}
